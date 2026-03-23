import java.util.Scanner;

public class Second_count {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int start = scanner.nextInt();
         for(int i = start; i > 0; i--){
             System.out.println(i);
             // sleep for 1 second
             Thread.sleep(1000);
         }
         System.out.println("Time's up!");
    }
}

// continue(skip for this loop)
// break(stop the loop)