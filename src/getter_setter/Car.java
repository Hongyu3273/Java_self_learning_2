package getter_setter;

public class Car {
    private final String model;
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$" + this.price;
    }
    void setColor(String color){
        this.color = color;
    }

    void setPrice(int Price){
        if(Price < 0){
            System.out.println("Price can't be negative");
        }
        else{
            this.price = Price;
        }

    }
}
