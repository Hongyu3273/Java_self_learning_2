package Exception_practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Exception = An event that interrupts the normal flow of a program
//                (Dividing by zero, file not found, mismatch input type)
//                  Surround any dangerous code with a block
//                try{}, catch{}, finally{}

//当使用 try-with-resources 时，scanner 变量的作用域仅限于 try 块内部,不需要在 finally 块中手动关闭资源，Java 会自动关闭它。
        try(Scanner scanner = new Scanner(System.in);){
            System.out.print("Enter a number");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(InputMismatchException e1){
            System.out.println("that wasn't a number!");
        }
        catch(ArithmeticException e2){
            System.out.println("You can't divide by zero!");
        }
        catch(Exception e3){
            // Safety net
            System.out.println("something went wrong");
        }
        finally {
            //execute whether exception or not
            System.out.println("This always execute");
        }
    }
}