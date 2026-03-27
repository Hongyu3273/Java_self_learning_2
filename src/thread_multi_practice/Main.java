package thread_multi_practice;

import thread_pracrtce.MyRunnable;

public class Main {
    public static void main(String[] args) {
        /*
        Multithreading = Enables a program to run multiple threads concurrently
                        (Threads = A set of instructions that run independently)
                        Useful for background tasks or time-consuming operations
         */
        Thread thread1 = new Thread(new MyRunnable1("ping"));
        Thread thread2 = new Thread(new MyRunnable1("pong"));
        thread1.start();
        thread2.start();
        System.out.println("Game Started");
        try{
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }

         System.out.println("Game over");
    }
}
