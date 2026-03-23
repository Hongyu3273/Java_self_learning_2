import java.util.Arrays;
import java.util.Scanner;




public class Test01{  //Remeber the public class need to have the same name with the file, matching the file name
    public static void main(String[] args){

        boolean isStudent = true;
//There are two types of values,
//Primitive: int, double, char, boolean
//isEmpty() could used for figure out if the value is empty or not
        if(isStudent){
            System.out.println("you are a Student!!!");
        }
        else if(!isStudent){
            System.out.println("you are nottt");
        }
        else{
            System.out.println("you are not a Student!!!");
        }
//Reference data type: String array,

//Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("plz input your name: ");
        String name = scanner.nextLine();
        System.out.print("plz input your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name);
        System.out.println("you are " + age + " years old");
        scanner.close();
    }
}

class Test02{
    public static void main(String[] args){
//Arithmetic operation
        int a = 10;
        int b = 5;
        System.out.print(a+b);
    }
}

class Pizzahut{
    public static void main(String[] args){
        System.out.println("Welcome to Pizza Hut");
        double[] prices = new double[]{10.0, 12.0, 15.0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("plz input your choice: ");
        int choice = scanner.nextInt();
        System.out.print("how many pizza do you want? ");
        int quantity = scanner.nextInt();
        scanner.close();
        double bill = prices[choice-1] * quantity;
        System.out.println("your bill is " + bill);
    }
}