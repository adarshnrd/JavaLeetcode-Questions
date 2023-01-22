package com.company;

public class MaximumAscendingSubarraySum {
    public static void main(String args[]){
        int nums[]={100,10,1};
        System.out.println(maxAscendingSum(nums));
    }
    public static int maxAscendingSum(int[] nums) {
        int max =0;
        int current =0;

        for(int i=0;i<nums.length-1;i++) {
        if(nums[i+1]>nums[i]){
            current +=nums[i];
        }
        else if(i==0||nums[i]>nums[i-1]){
            current+=nums[i];
            if(current>max){
                max =current;
            }
            current =0;
        }else {
            current =0;
        }
            if(i==nums.length-2){
                if(nums[i]<nums[nums.length-1]){
                    current+=nums[nums.length-1];
                }
            }
            if(current>max){
                max=current;
            }

        }
return max;
    }
}
