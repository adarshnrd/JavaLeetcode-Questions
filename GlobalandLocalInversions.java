package com.company;
//not done

public class GlobalandLocalInversions {
    public static void main(String args[]){
        int []nums ={1,2,0};
        System.out.println(isIdealPermutation(nums));
    }
    public static boolean isIdealPermutation(int[] nums) {
        int global =0;
        int local =0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[i+1]){
                global++;
            }
            if(nums[i]>nums[i+1]){
                local++;
            }
        }
        if(global==local){
            return true;
        }
        return false;
    }
}
