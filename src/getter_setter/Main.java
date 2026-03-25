package getter_setter;

public class Main {
    public static void main(String[] args){
        // they help protect object data and add rules for accessing or modify
        // GETTERS = Method that make a field READABLE
        // SETTERS = Method that make a field WRITEABLE
        Car car = new Car("Charger","Yello", 100000);
        car.setColor("blue");
        car.setPrice(200000);
        System.out.println(car.getPrice() + car.getModel() + car.getColor());
    }
}
