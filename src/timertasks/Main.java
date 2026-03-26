package timertasks;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){
        //Timer = Class that schedules tasks at specific times or periodically
        //          Useful for: sending notifications, scheduled updates, repetitive actions
        //TimerTask = Represents the task that will be executed by the Timer
        //          You will extend the TimerTask class to define your task
        //          Create a subclass of TimerTask and @Override run()
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;
            @Override
            public void run() {
                System.out.println("Hello!");
                count--;
                if(count < 0){
                    System.out.println("Task complete");
                    timer.cancel();
                }
            }
        };
        //After 3 second do the thing
        //timer.schedule(task, 3000);
        //Delay 0 Repeat 1000 period
        timer.schedule(task, 0, 1000);
    }
}
