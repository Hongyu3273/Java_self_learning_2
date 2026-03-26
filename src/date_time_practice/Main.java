package date_time_practice;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(date);
//        System.out.println(time);
//
//
//        Instant instant = Instant.now();
//        System.out.println(instant);

/*
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

 */
        LocalDate date = LocalDate.of(2024, 12, 25);
        System.out.println(date);
        LocalDateTime dateTime1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2025, 1, 2, 12, 0, 0);
        System.out.println(dateTime1);
        System.out.println(dateTime2);
        if(dateTime1.isBefore(dateTime2)){
            System.out.println( dateTime1 + "Date1 is earlier than" + dateTime2 );
        }
    }
}
