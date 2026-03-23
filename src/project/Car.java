package project;

public class Car {
    String make;
    String model;
    int year;
    double price;
    boolean isRunning;

    Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isRunning = true;
    }
    //overloaded
    Car(String make, String model, int year, double price,boolean isRunning){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isRunning = isRunning;
    }
    void drive(){
        System.out.println("You drive the " + this.make + " " + this.model);
    }
}