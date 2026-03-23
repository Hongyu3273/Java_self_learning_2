package project;

public class CarTest {
    public static void main(String[] args){
//        String make, String model, int year, double price, boolean isRunning
        Car car1 = new Car("Audi", "RS7",2024, 59999);
        Car car2 = new Car("Audi", "RSQ5",2024, 57999,true);
        Car car3 = new Car("Audi", "A6",2021, 27999,true);

        car1.drive();
        Car[] cars = {car1, car2, car3};
        for(Car car: cars){
            car.drive();
        }
    }
}
