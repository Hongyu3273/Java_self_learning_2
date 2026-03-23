package SuperClass;

public class Main {
    public static void main(String[] args){

//        Super = Refers to the parent class(subblass <- superclass)
//                Used in constructors and method overriding
//                Calls the parent constructor to initialize attributes
        Person person = new Person("Tony", "Stack");
        person.showName();
        Student student = new Student("Harry", "Potter", 5.3);
        student.showName();
        System.out.println(student.gpa);
    }
}
