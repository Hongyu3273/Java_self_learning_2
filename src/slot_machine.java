import java.util.Random;
import java.util.Scanner;

public class slot_machine {
    public static void main(String[] args) {
        System.out.println("Welcome to the slot machine!");
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String play_again = "";
        String[] row;
        System.out.println("Welcome to Java Slots");
        System.out.println("===".repeat(12));
        System.out.println("Symbols: 🍅  🥑  🥭  🫐  🫒");
        System.out.println("===".repeat(12));


        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount ");
            bet = scanner.nextInt();
            scanner.nextLine();
            if (bet > balance) {
                System.out.println("You don't have enough money to place that bet.");
                continue;
            } else if (bet <= 0) {
                System.out.println("You can't bet negative money.");
            } else {
                balance -= bet;
                System.out.println("$" + balance);
                row = spinRow();
                printRow(row);
                payout = getPayout(row, bet);
                if(payout > 0){
                    System.out.println("You won $" + payout);
                    balance += payout;
                }
                else {
                    System.out.println("Sorry you Lost! ");
                }
            }
                System.out.print("Do you want to play again (Y/N) ?");
                play_again = scanner.nextLine().toUpperCase();
                if(!play_again.equals("Y")){
                    break;
                }
        }
            System.out.println("GAME OVER your final balance is " + balance);
    }
    static String[] spinRow() {
        String[] symbols = {"🍅", "🥑", "🥭", "🫐", "🫒"};
        String[] row = new String[3];
        Random random = new Random();
        for(int i = 0; i < 3 ; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println("*".repeat(10));
        System.out.println(" " + String.join("|",row));
        System.out.println("*".repeat(10));
    }
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍅" -> bet * 3;
                case "🥑" -> bet * 5;
                case "🥭" -> bet * 8;
                case "🫐" -> bet * 10;
                case "🫒" -> bet * 20;
                default -> 0;
            };
        }
        return 0;
    }
}