package abstract_java;

public class main {
    public static void main(String[] args){
        //Abstract = Used to define abstract classes and methods
        //          Abstraction is the process of implementation details
        //          And showing only the essential features
        //          Abstract classes CAN'T be instantiated directly
        //          Can't contain "abstract" methods (which must be implemented)
        //          Can't contain "concrete" methods (which are inherited)
        circle circle = new circle(3);
        rectangle rectangle = new rectangle(3,4);
        triangle triangle = new triangle(3,4);
        circle.display();
        triangle.display();
        rectangle.display();
        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
    }
}
