import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.abs(-10));
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.floor(10.1));
        System.out.println(Math.round(10.1));
        System.out.println(Math.sqrt(10));
        double circumference;
        double area;
        double volume;
        double radius;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the radius: ");
        radius = scanner.nextDouble();
        circumference = 2 * Math.PI * radius;
        area =Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is : %.1f cm%n", circumference);
        System.out.printf("The area is : %.1f cm^2%n", area);
        System.out.printf("The volume is : %.1f cm^3%n", volume);



        scanner.close();
    }
}
