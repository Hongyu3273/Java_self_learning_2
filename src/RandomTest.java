import java.util.Random;

public class RandomTest {
    public static void main(String[] args){

        Random random = new Random();
        int number;
        double numberD;
        number = random.nextInt(1, 10);
        numberD = random.nextDouble();
        System.out.println(number);
    }
}

