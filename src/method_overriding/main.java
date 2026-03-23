package method_overriding;

public class main {
    public static void main(String[] args){
        // Method overriding = When a subclass provides its own
        //                     implementation of a method that is already defined,Allows codes for
        //                     reusability and give specific implementations
        dog dog = new dog();
        cat cat = new cat();
        fish fish = new fish();
        dog.move();
        cat.move();
        fish.move();
    }
}
