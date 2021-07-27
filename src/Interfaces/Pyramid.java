package Interfaces;

public class Pyramid implements Shape{

    double length, width, height;

    public Pyramid(double length, double width, double height){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getVolume(){
        return length * width  *  height * 4 / 3;
    }
}
