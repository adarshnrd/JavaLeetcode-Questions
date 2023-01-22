package com.company;

import java.util.Arrays;

public class MaximumNumberofPairsinArray {
    public static void main(String args[]){

        int nums [] ={88,5,96,39,36,82,11,0,60};
        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }
    public static int[] numberOfPairs(int[] nums) {

        int count = 0;
        int sum = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=1+i;j<nums.length;j++){
                if(nums[i]==nums[j] ){
                    nums[i] =-1;
                    nums[j] =-1;
                    count++;
                    break;
                }
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                sum++;
            }
        }
        if(nums.length<2){
            sum =1;
        }
        return new int[]{count,sum};
    }
}
        /*  for(int i=0;i<nums.length;i++){
            for(int j=1+i;j<nums.length;j++){
                if(nums[i]==nums[j] ){
                nums[i] =0;
                nums[j] =0;
                count++;
                break;
                }
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                sum++;
            }
        }
        if(nums.length<2){
            sum =1;
        }
        return new int[]{count,sum};
    }
}
*/