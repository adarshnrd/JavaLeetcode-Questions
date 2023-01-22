package com.company;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = removeElement(nums, 3);
        System.out.println(k);
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count--;
                continue;
            }
            nums[i + count] = nums[i];
        }
        return nums.length + count;
    }
}