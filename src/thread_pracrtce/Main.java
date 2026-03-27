package thread_pracrtce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Threading = Allows a program to run multiple tasks simultaneously
                    Helps improve performance with time-consuming operations
                    (File I/O, network communications, or any background tasks)

        How to create a Thread
        Option1: Extend the Thread class(simpler)
        Option2: Implement the Runnable interface(better)

         */
        Scanner scanner = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("you have five seconds to enter your name: ");

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();

    }
}
