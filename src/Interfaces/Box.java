package Interfaces;

import java.util.ArrayList;

public class Box implements Shape{
    double length, freeSpace;
    ArrayList<Shape> shapeArray = new ArrayList<>();

    public Box(double length){
        this.length = length;
        this.freeSpace = getVolume();
    }

    @Override
    public double getVolume() {
        return length * length * length;
    }

    public boolean add(Shape shape){
        if(shape.getVolume() > freeSpace)
            return false;

        shapeArray.add(shape);
        freeSpace -= shape.getVolume();
        return true;
    }
}
