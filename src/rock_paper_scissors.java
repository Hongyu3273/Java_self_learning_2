import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    // Declaring variables
    // get choice from the user
    // get random chocie for the computer
    //check the win conditions
    //ask to play again?
    //goodbye message
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices ={"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";



do {
    System.out.print("Enter your move(rock, paper, scissors): ");
    playerChoice = scanner.nextLine().toLowerCase();
    computerChoice = choices[random.nextInt(choices.length)];
    judge(playerChoice, computerChoice);
    System.out.println("Do you want to play again? (yes/no)");
    playAgain = scanner.nextLine().toLowerCase();
    while(!playAgain.equals("yes") && !playAgain.equals("no")){
        System.out.print("Invalid choice. Please reenter the choice ");
        playAgain = scanner.nextLine().toLowerCase();
    }
}while(playAgain.equals("yes"));
System.out.println("Goodbye!");
    }
    static void judge(String playerChoice, String computerChoice){
        if(!playerChoice.equals("rock") &&
                !playerChoice.equals("paper") &&
                !playerChoice.equals("scissors")){
            System.out.println("Invalid choice. Please try again.");
        }
        System.out.println("Computer choice: " + computerChoice);

        if(playerChoice.equals(computerChoice)){
            System.out.println("it's a tie");
        }
        else if(playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                playerChoice.equals("scissors") && computerChoice.equals("paper") ||
                playerChoice.equals("paper") && computerChoice.equals("rock")){
            System.out.println("you win");
        }
        else{
            System.out.println("you lose");
        }
    }
}
