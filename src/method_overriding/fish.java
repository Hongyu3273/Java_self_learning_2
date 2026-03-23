package method_overriding;

public class fish extends animal{
    @Override    // means if using the method then use the method inside first, use for override
    void move(){
        System.out.println("This animal is swimming");
    }
}
