package com.company;
//not completed yet

public class MaximumProductSubarray {
    public static void main(String args[]){
        int nums []={0,2};
        System.out.println(maxProduct(nums));

    }
    public static int maxProduct(int[] nums) {
        int cursum =1;
        int maxsum =Integer.MIN_VALUE;


        for(int i =0;i<nums.length;i++){

            cursum *=nums[i];

            if(cursum>maxsum){
                maxsum =cursum;
            }
            if(cursum<=0){
                cursum =1;
            }
        }
        return maxsum;
    }
}

