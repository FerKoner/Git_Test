package Fer.company;

import Hierarсhy.*;
import Interfaces.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("First commit");
        System.out.println("Second commit");

        // Min max average
        // Lesson 1
        double[] array = new double[10];
        for(int i = 0; i < array.length; i++)
            array[i] = Math.random() * 100;

        MinMaxAverage minMaxAverage = new MinMaxAverage();
        System.out.println(minMaxAverage.getMax(array));
        System.out.println(minMaxAverage.getMin(array));
        System.out.println(minMaxAverage.getAverage(array));

        // Bubble sort
        // Lesson 2
        BubbleSort.sort(array);

        for (double element : array)
            System.out.print(element + ",");

        // Output primal nums
        // Lesson 3
        System.out.println();
        int[] nums = new int[100];
        for(int i = 0; i < nums.length; i++)
            nums[i] = i + 2;

        PrimesOutput.outputPrimesFromArray(nums);

        // Remove number from int array
        // Lesson 4
        int[] int_array = {0,1,2,2,3,0,4,2};
        Scanner newInt = new Scanner(System.in);
        int val = newInt.nextInt();
        int[] newArray= DeleteFromArray.removeIntFromArray(int_array, val);
        for (int element : newArray)
            System.out.print(element + ",");

        // Bowling game. Count point and het winner
        // Lesson 5
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3;i++){
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }

        game.getWinner();

        // Vector training class
        // Lesson 6
        Vector[] vectors = Vector.getVectorsArray(10);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].getLength());
        System.out.println(vectors[0].getScalarProduct(vectors[1]));
        System.out.println(vectors[0].getCrossProduct(vectors[1]));
        System.out.println(vectors[0].getCosCorner(vectors[1]));
        System.out.println(vectors[0].getSum(vectors[1]));
        System.out.println(vectors[0].getDiff(vectors[1]));

        // Generating a random element with a weight
        // Lesson 7
        int[] values = {1,2,3,4,5,6};
        int[] weights = {1,5,3,7,1,4};
        RandomFromArrayByWeight randomFromArrayByWeight= new RandomFromArrayByWeight(values, weights);
        System.out.println(randomFromArrayByWeight.getRandom());

        // Binary search
        // Lesson 8
        array = new double[100000];
        for(int i = 0; i < array.length; i++)
            array[i] = Math.random() * 100;
        Arrays.sort(array);
        System.out.println(BinarySearch.findElementInArray(array, array[2258], 0 , array.length));

        // Hierarchy
        // Lesson 9
        Hierarсhy.Ball ball = new Hierarсhy.Ball(4.5);
        Hierarсhy.Cylinder cylyinder = new Hierarсhy.Cylinder(2, 2);
        Hierarсhy.Pyramid pyramid = new Hierarсhy.Pyramid(100, 100);

        Hierarсhy.Box box = new Hierarсhy.Box(1000);

        System.out.println(box.add(ball));
        System.out.println(box.add(cylyinder));
        System.out.println(box.add(pyramid));

        // Interfaces
        // Lesson 10
        Interfaces.Pyramid iPyramid = new Interfaces.Pyramid(10, 10, 60);
        Interfaces.Ball iBall = new Interfaces.Ball(4.5);
        Interfaces.Cylinder iCylinder = new Interfaces.Cylinder(1, 10);
        Interfaces.Box iBox = new Interfaces.Box(10);

        System.out.println(iPyramid.getVolume());
        System.out.println(iBall.getVolume());
        System.out.println(iCylinder.getVolume());

        System.out.println(iBox.add(iBall));
        System.out.println(iBox.add(iCylinder));
        System.out.println(iBox.add(iPyramid));
    }



}
