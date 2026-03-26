package Anonymous_class_practice;

public class Main {
    public static void main(String[] args){
        //Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                  Add custom behavior without having to create a new class.
        //                  Often used for one time uses (TimerTask, Runnable, callbacks)
        Dog dog1 = new Dog();
        dog1.Speak();
        Dog dog2 = new Dog(){
            @Override
            void Speak(){
                System.out.println("Scooby Doo Says ruh roh");
            }
        };
    }
}
