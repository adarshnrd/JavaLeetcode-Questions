package com.company;

public class CountEqualandDivisiblePairsinanArray {
    public static void main(String[] args) {
int nums[] ={3,1,2,2,2,1,3};
int k =2;
        System.out.println(countPairs(nums,k));
    }

    public static int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1+i; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    count++;

                }

            }
        }
        return count;
    }
}
