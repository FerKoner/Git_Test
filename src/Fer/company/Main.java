package Fer.company;

import java.util.Collection;
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

    }



}
