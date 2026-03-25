package runtime_polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //runtime polymorphism = When the method that gets executed is decided at runtime
        //based on the actual type of the object.
        Scanner scanner = new Scanner(System.in);
        Animal animal;
        System.out.println("would you like a dog or a cat? (1 = dog, 2 = cat)");
        int choice = scanner.nextInt();
        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else{
            animal = new Cats();
            animal.speak();
        }
    }
}
