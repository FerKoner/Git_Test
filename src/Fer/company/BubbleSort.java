package Fer.company;

public class BubbleSort {
    public static void sort(double[] array){
        for(int i = 0; i< array.length; i++)
            for(int j = 0; j < array.length - 1 - i; j++)
                if(array[j] > array[j+1])
                    swap(array, j, j+1);
    }

    private static void swap(double[] arr, int i, int j){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
