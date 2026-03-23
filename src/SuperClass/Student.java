package SuperClass;

public class Student extends Person{
    double gpa;

    Student(String first, String last, double gpa){
        super(first, last); //super get these from the parents
        this.gpa = gpa;
    }
}
