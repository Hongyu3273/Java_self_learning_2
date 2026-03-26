package game_practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // JAVA HANGMAN GAME

        String filePath = "src/game_practice/words.txt";
        ArrayList<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("could not find file");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;
        for(int i = 0; i < word.length(); i++){
            wordState.add('_');
        }

        System.out.println("Welcome to JAVA Hangman");
        while(wrongGuesses < 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.print("Word: ");
            for(char c: wordState){
                System.out.print(c + " ");
            }
            System.out.print("\nGuess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct guess!\n");
                int position = findFirstUnrevealedPosition(word, guess, wordState);
                if(position != -1){
                    System.out.println("Correct guess!\n");
                    wordState.set(position, guess);
                }
                else{
                    System.out.println("You already guessed all occurrences of this letter!\n");
                }
            }
            else{
                System.out.println("Wrong guess\n");
                wrongGuesses ++;
            }
            if(!wordState.contains('_')){
                System.out.print(getHangmanArt(wrongGuesses));
                System.out.println("you win");
                System.out.println("The word was: " + word);
                break;
            }
        }
        if(wrongGuesses >= 6){
            System.out.print(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word);
        }
        scanner.close();
    }
    static String getHangmanArt(int wrongGuesses){
        return switch (wrongGuesses){
            case 0 -> """



                    """;
            case 1 -> """
                    0


                    """;
            case 2 -> """
                    0
                    |

                    """;
            case 3 -> """
                    0
                   /|

                    """;
            case 4 -> """
                    0
                   /|\\

                    """;
            case 5 -> """
                    0
                   /|\\
                   /
                    """;
            case 6 -> """
                    0
                   /|\\
                   / \\
                    """;
            default -> "";
        };
    }
    static int findFirstUnrevealedPosition(String word, char guess, ArrayList<Character> wordState){
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == guess && wordState.get(i) == '_'){
                return i;
            }
        }
        return -1;
    }
}
