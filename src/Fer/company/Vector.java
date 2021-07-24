package Fer.company;

public class Vector {
    private double x, y, z;

    Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector[] getVectorsArray(int n){
        Vector[] vectorArray = new Vector[n];
        int num = 10;
        for(int i = 0; i < n; i++)
            vectorArray[i] = new Vector(num * Math.random(), num * Math.random(), num * Math.random());
        return  vectorArray;
    }

    public double getLength(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double getScalarProduct(Vector vector){
        return (x * vector.x + y * vector.y + z * vector.z);
    }

    public Vector getCrossProduct(Vector vector){
        return new Vector(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }

    public double getCosCorner(Vector vector){
        return (getScalarProduct(vector) / (Math.abs(this.getLength()) * Math.abs(vector.getLength())));
    }

    public Vector getSum(Vector vector){
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector getDiff(Vector vector){
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    @Override
    public String toString(){
        return "Vector{x=" + x + ", y=" + y + ", z=" + z + "}";
    }

}
