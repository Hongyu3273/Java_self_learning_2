package Alarm_clock;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable {
    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {

        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();
                int hours = now.getHour();
                int minutes = now.getMinute();
                int seconds = now.getSecond();
                System.out.printf("\r%02d:%02d:%02d\n", hours, minutes, seconds);
            } catch (InterruptedException e) {
                System.out.println("AlarmClock thread interrupted");
            }
        }
        playSound(filePath);
    }
    private void playSound(String fileName) {
        File audioFile = new File(fileName);
        try(AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("Press enter to stop the alarm");
            scanner.nextLine();
            clip.stop();
            scanner.close();
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file specified is not supported");
        }
        catch (IOException e){
            System.out.println("Error playing sound");
        }
        catch(LineUnavailableException e){
            System.out.println("Error playing sound");
        }
    }
}
