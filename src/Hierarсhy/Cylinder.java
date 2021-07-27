package Hierarсhy;

public class Cylinder extends SolidOfRevolution{
    private double height;
    public Cylinder(double radius, double height){
        super(radius, Math.PI * Math.pow(radius, 2) * height);
        this.height = height;
    }
}
