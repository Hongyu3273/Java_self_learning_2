import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Banana"};
        String[] colors = new String[]{"red", "yellow"};
        int num_of_fruits = fruits.length;
        Arrays.sort(fruits);
        for(int i = 0; i < colors.length; i++){
            System.out.println(fruits[i]);
        }
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }

}
class array_Test2{
    public static void main(String[] args) {
        String[] phones;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of phones: ");
        int size = scanner.nextInt();
        phones = new String[size];
        System.out.println("Enter the phones");
        for(int i = 0; i < phones.length; i++){
            phones[i] = scanner.next();
        }
        for(int i = 0; i < phones.length; i++){
            System.out.println(phones[i]);
        }
    }
}
class array_find{
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int target = 2;
        boolean isFound = false;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                System.out.println("Target at " + (i+1));
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Target not found");
        }
    }
}
// varargs = allow a method to accept a varing of arguments
// java will pack the arguments into an array
class array_add{
    public static void main(String[] args){
        double[] array1 = {1.5,2,3,4,5};
        System.out.println(add1(1,2,3,4,5));
        System.out.println(average(array1));
    }
    static int add1(int... numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }
    static double average(double... numbers){
        double sum = 0;
        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}

class array_2d{
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=".repeat(30));
        for(int[] row : matrix){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}