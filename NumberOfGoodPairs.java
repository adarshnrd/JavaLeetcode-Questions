package com.company;
import java.util.Arrays;

public class NumberOfGoodPairs {
    public static void main(String args[]){
        int arr[] ={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]==nums[j]){
               count+=j-i;
            }
            else{
                i=j;
            }

        }
        return count;
    }
}
