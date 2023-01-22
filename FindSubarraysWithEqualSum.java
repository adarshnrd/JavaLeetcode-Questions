package com.company;

import java.util.ArrayList;

public class FindSubarraysWithEqualSum {
    public static void main(String args[]){
    int []nums={1,-4,5};
        System.out.println(findSubarrays(nums));
    }
    public static boolean findSubarrays(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i]+nums[i+1]==nums[j]+nums[j+1]){
                    return true;
                }
            }
        }
        return false;
    }
}
