package com.company;
// THE OP SOLUTION

import java.util.ArrayList;
import java.util.Arrays;

public class ShuffletheArray {
    public static void main(String args[]){
        int arr[] ={2,5,1,3,4,7};
        int n =arr.length/2;
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
    public static int[] shuffle(int[] nums, int n) {
   int x[] =new int[n];
   int y[] =new int[n];

    for(int i =0;i<n; i++){
        x[i] =nums[i];
        y[i] =nums[n+i];
    }

    for(int i =0;i<n;i++){
    nums[i+i] =x[i];
    nums[i+i+1] =y[i];
    }
    return nums;
    }
}
/*
more effiecent code
 public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
            int j = 0;
            for(int i = 0 ; i < 2*n; i += 2){
                    ans[i] = nums[j];
                    ans[i+1] = nums[j+n];
                    j++;
            }
        return ans;
    }
 */