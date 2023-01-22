package com.company;


import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {-1,-1,-1,-1,1,1};
        int target = 2;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;

        while (start<end){
            if(nums[start]+nums[end]==target){
                return new int[]{start+1,end+1};
            }
            if(nums[start]+nums[end]>target){
                end--;
            }
            else {
                start++;
            }
        }
return new int[]{-1,-1};
    }
}

        //linear solution
          /*  int j = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{j + 1, i + 1};
                }
                if (i >= nums.length - 1) {
                  j++;
                  i = j;
                }
            }

            return new int[]{-1, -1};
        }
    }







        /*
        int j = 1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == nums.length - 1 || j == nums.length - 1) {
                i = -1;
                j++;
            }
            if (nums[i] + nums[j] == target) {
                return new int[]{i + 1, j + 1};
            }


            count++;

        }
        return new int[]{-1, -1};
    }
}

    /*
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i <= nums.length-1; i++) {
           for(int j =+i+1;j<=nums.length-1;j++){
               if(nums[i]+nums[j]==target ){
                   return new int[]{i,j};
               }
           }
        }

        return new int[]{-1,-1};
    }
}*/