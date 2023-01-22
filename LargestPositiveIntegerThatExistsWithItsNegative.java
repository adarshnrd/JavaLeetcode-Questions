package com.company;

import java.util.Arrays;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public static void main(String args[]){
    int nums[]={-1,2,-3,3,-9};
        System.out.println(findMaxK(nums));
    }
    public static int findMaxK(int[] nums) {

        int arr[] =new int [nums.length];
        int a=0;
        for(int i=0;i<nums.length;i++){

            int j =nums[i];
            boolean s =find(nums,j);
            if(s==true){
                arr[a]=nums[i];
                a++;
            }

        }
        Arrays.sort(arr);
        int b =arr[arr.length-1];
        return b;
    }


    public static boolean find(int []nums,int j){
        j *=-1;
        for(int i=0;i<nums.length;i++){
            if(j==nums[i]){
                return true;
            }
        }
        return false;
    }
}
