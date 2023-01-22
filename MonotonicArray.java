package com.company;

public class MonotonicArray {
    public static void main(String args[]){
        int nums[] ={2,2,2,4,5};
        System.out.println(isMonotonic(nums));
    }
    public static boolean isMonotonic(int[] nums) {
        int count =0;
        if (nums.length<2){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){

            }   else{
               count++;
               break;
            }
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){

            }   else{
                count++;
                break;
            }

        }
        if(count==2){
            return false;
        }
        return true;
    }
}
