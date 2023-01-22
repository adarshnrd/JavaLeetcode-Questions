package com.company;

public class Maximum_subArray {
    public static void main(String[]args){



    }
    static int maxSubArray(int[] nums) {

        int maxsum =Integer.MIN_VALUE;
        int cursum =0;
        int minsum =-999999999;
        for(int i =0;i<nums.length;i++){
            cursum =cursum+nums[i];

            if(cursum>maxsum){
                maxsum =cursum;
            }

            if(cursum<0){
                cursum = Math.max(cursum,minsum);
            }

        }
        return maxsum;
    }
}
