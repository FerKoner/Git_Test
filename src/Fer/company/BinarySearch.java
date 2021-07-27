package Fer.company;

public class BinarySearch {

    public static boolean findElementInArray(double[] sortedArray, double element, int start, int end){
        int middle = (start + end) / 2;
        if(end < start)
            return false;

        if(sortedArray[middle] == element) {
            return true;
        }else if(element < sortedArray[middle]){
            return findElementInArray(sortedArray, element, start, middle - 1);
        }else{
            return findElementInArray(sortedArray, element, middle + 1, end);
        }

    }
}
