package com.company;

public class FindMinimuminRotatedSortedArrayII {
    public static void main(String args[]){
int nums [] ={1,2,3,5};
        System.out.println(findMin(nums));
    }
    public static  int findMin(int[] nums) {

        int min =nums[0];

        for(int i=0;i<nums.length;i++){

            if(min>nums[i]){
                min =nums[i];
            }
        }
        return min;
    }
}
