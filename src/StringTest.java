import java.util.Scanner;

public class StringTest {
    public static void main(String[] args){
        String name = "Lebron James";
        int length = name.length();
        char letter = name.charAt(0); // L
        int index = name.indexOf("J"); // 7
        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("James", "Jamie");
        System.out.println(letter);
//        if(name.isEmpty()){
//            System.out.println("your name is empty");
//        }
//        else{
//            System.out.println("Hello" + name);
//        }
        if(name.contains(" ")){
            System.out.println("your name has a space");
        }
        if(name.equals("password")){
            System.out.println("your name can't be password");
        }




        // Substring
        String email = "cccc@ccc.com";
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        System.out.println( username);
        System.out.println( domain);

        String email1;
        Scanner scanner = new Scanner(System.in);
        email1 = scanner.nextLine();
        if(email1.contains("@")){
            System.out.println("valid email");
        }
        else{
            System.out.println("invalid email");
        }
        scanner.close();
        // Ternary Operator
        // Ternary Operator ? = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;
        int score = 75;
        String passOrfail = score >= 60 ? "pass" : "fail";
        System.out.println(passOrfail);



    }

}
