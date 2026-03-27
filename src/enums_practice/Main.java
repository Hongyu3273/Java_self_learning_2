package enums_practice;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        Enums = (Enumerations) A special kind of class that represents a fixed set of constants.
                They improve code readability and are easy to maintain.
                More efficient with swithes when comparing Strings
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week");
        String response = scanner.nextLine().toUpperCase();
        Day day = Day.valueOf(response);
        System.out.println(day);
        System.out.println(day.getDayNumber());
        switch (day) {
            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURSDAY,
                 FRIDAY -> System.out.println("it is a weekday");
            case SATURDAY, SUNDAY -> System.out.println("it is the weekend");
        }

    }
}
