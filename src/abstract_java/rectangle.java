package abstract_java;

public class  rectangle extends shape{
    double base,height;
    rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    double area(){
        return base * height;
    }
}


