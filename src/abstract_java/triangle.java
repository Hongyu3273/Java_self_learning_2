package abstract_java;

public class triangle extends shape{
    double base,heighth;
    triangle(double base, double heighth){
        this.base = base;
        this.heighth = heighth;
    }

    @Override
    double area(){
        return base * heighth / 2;
    }
}

