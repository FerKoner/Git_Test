package Fer.company;

public class MinMaxAverage {
    public double getMax(double[] nums){
        if(nums.length == 0)
            return 0.0;

        double max = nums[0];
        for(double num : nums)
            if(num > max)
                max = num;

        return max;

    }

    public double getMin(double[] nums){
        if(nums.length == 0)
            return 0.0;

        double min = nums[0];
        for(double num : nums)
            if(num < min)
                min = num;

        return min;
    }

    public double getAverage(double[] nums){
        if(nums.length == 0)
            return 0.0;

        double sum = 0;
        for(double num : nums)
            sum += num;

        return sum / nums.length;
    }
}
