package com.company;

import java.util.Arrays;

public class DuplicateZeroes {
    public static void main(String args[]) {
        int arr[] = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        int j = 0;
        int nums[] = new int[arr.length];
        int s = arr.length;
        for (int i = 0; i < s; i++) {
            if (arr[i] == 0) {
                nums[j] = 0;
                j++;

                if (j == s) {
                    break;
                }
                nums[j] = 0;
                j++;
            } else {
                nums[j] = arr[i];
                j++;
            }
            if (j == s) {
                break;
            }

        }
        for (int i = 0; i < s; i++) {
            arr[i] = nums[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
