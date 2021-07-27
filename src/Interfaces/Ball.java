package Interfaces;

public class Ball extends SolidOfRevolution{
    public Ball(double radius){
        super(radius);
    }
    public double getVolume(){
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }
}
