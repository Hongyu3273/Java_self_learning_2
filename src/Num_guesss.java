import java.util.Scanner;
import java.util.Random;

public class Num_guesss {
    public static void main(String[] args){
        int num_guess;
        Random random = new Random();
        int num = random.nextInt(1, 100);
        System.out.println("guess a number between 1 and 100 ");
        Scanner scanner = new Scanner(System.in);
        num_guess = scanner.nextInt();
        do {
            if(num_guess < num){
                System.out.println("wrong number,try a larger one ");
                num_guess = scanner.nextInt();
            }
            else {
                System.out.println("wrong number,try a smaller one ");
                num_guess = scanner.nextInt();
            }
        }while (num_guess != num);
        System.out.println("you are right the number is " + num_guess);
        scanner.close();
    }
}
