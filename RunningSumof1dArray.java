package com.company;

import java.util.Arrays;

public class RunningSumof1dArray {
    public static void main(String[]args){

        int nums[]={3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));

    }
    public static int[] runningSum(int[] nums) {

        int arr[] =new int[nums.length];
        int sum =0;
        for(int i =0;i<nums.length;i++){

         sum =nums[i]+sum;

        arr[i] =sum;


        }
        return arr;
    }
}
