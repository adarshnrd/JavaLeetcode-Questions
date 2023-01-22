package com.company;

import java.util.Arrays;
//not done yet
public class DecompressRunLengthEncodedList {
    public static void main(String args[]){
        int []nums={1,1,2,3};
        System.out.println(decompressRLElist(nums));
    }
    public static int[] decompressRLElist(int[] nums) {
        int num[]= Arrays.copyOf(nums,nums.length);
        int arr[] =new int [nums.length];
        int j =0;
        for(int i=0;i<arr.length;i++){
           while (nums[j]!=0){
               arr[i]=nums[j+1];
               nums[j]--;
               i++;
           }
           i=i-1;
           j+=2;
        }
        return arr;
    }
}
