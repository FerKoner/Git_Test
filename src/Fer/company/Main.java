package Fer.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("First commit");
        System.out.println("Second commit");

        // Min max average
        // Lesson 1
        double[] array = new double[100];
        for(int i = 0; i < array.length; i++)
            array[i] = Math.random() * 100;

        MinMaxAverage minMaxAverage = new MinMaxAverage();
        System.out.println(minMaxAverage.getMax(array));
        System.out.println(minMaxAverage.getMin(array));
        System.out.println(minMaxAverage.getAverage(array));
    }
}
