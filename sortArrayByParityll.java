package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class sortArrayByParityll {
    public static void main(String args[]) {
        int nums[] = {4, 2, 5, 7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    public static int[] sortArrayByParityII(int[] nums) {

        int arr[] = new int[nums.length / 2];
        int arr1[] = new int[nums.length / 2];

        int arrs = 0;
        int arrs1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[arrs] = nums[i];
                arrs++;
            } else {
                arr1[arrs1] = nums[i];
                arrs1++;
            }
        }
        ArrayList<Integer>list =new ArrayList<>();
        for (int i = 0; i < nums.length / 2; i++) {
            list.add(arr[i]);
            list.add(arr1[i]);
        }
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }

        return nums;
    }
}
