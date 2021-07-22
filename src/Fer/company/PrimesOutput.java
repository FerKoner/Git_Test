package Fer.company;

public class PrimesOutput {
    public static void outputPrimesFromArray(int[] array){
        boolean isPrime;
        for(int i = 0; i < array.length; i++){
            isPrime = true;
            for(int j = 0; j < i; j++)
                if(array[i] % array[j] == 0){
                    isPrime = false;
                    break;
                }
            if(isPrime)
                System.out.println(array[i]);
        }
    }
}
