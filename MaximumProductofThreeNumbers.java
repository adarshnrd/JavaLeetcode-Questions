package com.company;
///not done yet

import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
    int arr[]= {-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(arr));
    }
    public static int maximumProduct(int[] nums) {
        int count =0;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=nums[i]*-1;
                count++;
            }
        }
        Arrays.sort(nums);
                if(count == nums.length) {
                     sum = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]*-1;
                }
                else {
                     sum = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
                }
        return sum;
    }
}
