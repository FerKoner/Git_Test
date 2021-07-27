package Hierarсhy;

import java.util.ArrayList;

public class Box extends Shape{
    private ArrayList<Shape> shapeArray = new ArrayList<>();
    private double freeSpace;

    public Box(double freeSpace){
        super(freeSpace);
        this.freeSpace = freeSpace;
    }

    public boolean add(Shape shape){
        if(shape.getVolume() > freeSpace)
            return false;
        shapeArray.add(shape);
        freeSpace -= shape.getVolume();
        return true;
    }
}
