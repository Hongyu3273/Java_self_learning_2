public class overload_test {
    public static void main(String[] args){
        int a,b,c;
        a = 1;
        b = c = 2;
        int result1 = add(a,b,c);
        int result2 = add(a,b);
        int result3 = add(a);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
    static int add(int a,int b,int c){return a + b + c;}
    static int add(int a,int b){return a + b ;}
    static int add(int a){return a;}
    // use void if there's no return
}
