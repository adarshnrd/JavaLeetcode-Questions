package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayPartition {
    public static void main(String[] args) {
        int nums[] ={6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }
    public static int arrayPairSum(int[] nums) {

        Arrays.sort(nums);

        int sum =0;

        for(int i=0;i<nums.length;i++){
            int minsum =Math.min(nums[i],nums[i+1]);
            sum+=minsum;
            i++;
        }
return sum;
    }
}
