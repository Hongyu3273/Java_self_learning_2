package Countdown_timer;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
        //Java COUNTDOWN TIMER PROGRAM
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 5;
            @Override
            public void run() {
                System.out.println(count);
                count --;
                if(count < 0){
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0 ,1000); // Task, delay, Period
    }
}
