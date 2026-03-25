package Polymorphism_java;

public class Main {
    public static void main(String[] args){
        // Polymorphism = "POLY" = "MANY"
        //                 "MORPH" = "SHAPE"
        //                  Objects can identify as other objects.
        //                  Objects can be treated as objects of a common superclass.
        // it could implement in both class and interface
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();
//        car.go();
//        bike.go();
//        boat.go();



        Vehicle[] vehicles = {car, bike, boat};
        for(Vehicle vehicle: vehicles){
            vehicle.go();
        }
    }
}
