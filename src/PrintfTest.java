public class PrintfTest {
    public static void main(String[] args){
        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployee = true;
        System.out.printf("Hello %.5s", name);
        System.out.printf("Your name starts wwith a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.2f meters tall\n", height);
        System.out.printf("Are you an employee? %b\n", isEmployee);
        System.out.printf("Your name is %s and you are %d years old\n", name, age);

//        %d - 用于整数（int, long, short, byte）
//        %f - 用于浮点数（float, double），可以加 .1、.2 控制小数位数
//        %s - 用于字符串
//printf() = is a method used to format ourput
// %[flags][width][.precision]conversion-character
// + = output a plus
// , = comma grouping separator
// ( = negative numbers are enclosed in ()
// space = display a minus if negative, space if positive

        double price1 = 9000.99;
        double price2 = 230.12323;
        double price3 = -257.9349;
        System.out.printf("%+.2f\n",price1);
        System.out.printf("%+.2f\n",price2);
        System.out.printf("%+.2f\n",price3);
         // 0 = zero pedding
         //number = right justified padding
         // negative number = left justified padding
        int id1 = 1;
        int id2 = 23;
        int id3 = 345;
        System.out.printf("%05d\n",id1);
        System.out.printf("%05d\n",id2);
        System.out.printf("%05d\n",id3);
    }
}