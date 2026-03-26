package composition_practice;

public class Main {
    public static void main(String[] args){
//        Composition = Represents a "part-of" relationship between objects
//                    For example, an Engine is "part of" a car
//                    Allows complex objects to be constructed from smaller objects
        Car car = new Car("Model Y", 2024, "V8");
        System.out.println(car.engine.type);
        System.out.println(car.engine);
        System.out.println(car.year);
        car.start();
    }
}
