package Fer.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeleteFromArray {
    public static int[] removeIntFromArray(int[] array, int num){
        int shift = 0;

        for (int i = 0; i < array.length; i++)
            if(array[i] == num)
                shift++;
            else
                array[i-shift] = array[i];

        return Arrays.copyOf(array, array.length - shift);
    }


}
