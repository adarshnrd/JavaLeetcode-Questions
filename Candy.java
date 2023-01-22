package com.company;
//done but question was something else
//
import java.util.Arrays;

public class Candy {
    public static void main(String args[]) {
        int nums[] = {1,2,2};
        System.out.println(candy(nums));
    }

    public static int candy(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        int cur = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                if (nums[i] == 0) {
                    sum += 1;
                    cur = sum;
                }
            } else if (nums[i] < nums[i + 1]) {
                    if (nums[i] == cur) {
                        sum += cur + 1;
                        cur = sum;
                    } else if (nums[i] != cur) {
                        sum += nums[i];
                        cur = sum;
                    }
                } else if (nums[i] == nums[i + 1]) {
                    if (nums[i] == nums[i + 1] && nums[i] == cur) {
                        sum += cur + 1;
                        cur = sum;
                    } else if (nums[i] == nums[i + 1] && nums[i] != cur) {
                        sum += nums[i];
                        cur = sum;
                    }
                }
                if (i==nums.length-2) {
                    if (nums[i] == cur) {
                        sum = cur + 1;
                        cur = sum;
                    } else {
                        sum += nums[i + 1];
                        cur = sum;
                    }
                }
            }

        return sum;
    }
}
