package com.company;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
int nums []={1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count = nums[i];
                }
            }
            if(count>0){
                break;
            }
        }
        return count;
    }
}

