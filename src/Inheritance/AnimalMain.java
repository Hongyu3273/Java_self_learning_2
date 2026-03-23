package Inheritance;

public class AnimalMain {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.bark();
        System.out.println(cat.isAlive);
        System.out.println(dog.isAlive);

    }
}
