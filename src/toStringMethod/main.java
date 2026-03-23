package toStringMethod;

public class main {
    public static void main(String[] args){
        // .toString()  = method inherited from the Object class
        //                Use to return a String representation of the object
        //                By default, it returns a has code as a unique identifier
        //                It can be overridden to provide meaningful details.
        car car1 = new car("ford", "mustang",2025,"red");
        car car2 = new car("Audi","RS7",2024,"black");
        System.out.println(car1);
        System.out.println(car2);
    }
}
