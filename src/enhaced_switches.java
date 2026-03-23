public class enhaced_switches {
    public static void main(String[] args){
        String day = "Monday";
        switch (day){
//            case "Monday" -> System.out.println("Today is a weekday ");
//            case "Tuesday" -> System.out.println("Today is a weekday ");
//            case "Wednesday" -> System.out.println("Today is a weekday ");
//            case "Thursday" -> System.out.println("Today is a weekday ");
//            case "Friday" -> System.out.println("Today is a weekday ");
//            case "Saturday" -> System.out.println("Today is the weekend ");
//            case "Sunday" -> System.out.println("Today is the weekend ");
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Today is a weekday ");
            case "Saturday", "Sunday" -> System.out.println("Today is the weekend ");
            default ->  System.out.println("Invalid day");
        }
    }
}
