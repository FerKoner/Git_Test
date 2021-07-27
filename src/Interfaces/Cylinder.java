package Interfaces;

public class Cylinder extends SolidOfRevolution{
    double height;
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getVolume(){
        return Math.PI * radius * radius * height;
    }
}
