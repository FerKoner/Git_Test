package Fer.company;

public class RandomFromArrayByWeight {
    int[] weights;
    int[] values;
    int[] valuesByWeight;
    int sum;

    RandomFromArrayByWeight(int[] values, int[] weights){
        this.values = values;
        this.weights = weights;

        valuesByWeight = new int[weights.length];
        sum = 0;
        for(int i = 0; i < weights.length; i++){
            sum += weights[i];
            valuesByWeight[i] = sum;
        }
    }

    public int getRandom(){

        int rndNum = (int) (Math.random() * sum);
        System.out.println(rndNum);
        int i;
        for(i = 0; i < valuesByWeight.length; i++){
            if(valuesByWeight[i] > rndNum)
                break;
        }
        System.out.println(valuesByWeight[i]);
        return values[i];
    }


}
