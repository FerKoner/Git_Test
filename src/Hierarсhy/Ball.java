package Hierarсhy;

public class Ball extends SolidOfRevolution{
    public Ball(double radius){
        super(radius, Math.PI * Math.pow(radius, 3) * 4/3);
    }
}
