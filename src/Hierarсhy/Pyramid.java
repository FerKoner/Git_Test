package Hierarсhy;

public class Pyramid extends Shape{
    double area, height;

    public Pyramid(double area, double height){
        super(height * area * 4 / 3);
        this.height = height;
        this.area = area;
    }
}
