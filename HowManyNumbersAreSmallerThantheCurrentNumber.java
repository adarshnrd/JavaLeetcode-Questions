package com.company;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String args[]){
    int arr[] ={7,7,7,7,7};
System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        //O(N) solution.
        int count =0;
        int arr[]=new int[nums.length];
        int j =0;
        for(int i =0;i< nums.length;i++){
            if(j>=nums.length){
                break;
            }
            if(nums[j]>nums[i]){
                count++;
            }
            if(i == nums.length-1){
                i=-1;
                arr[j] =count;
                j++;
                count =0;
            }
        }
       return arr;
    }

}
/*  O(N2) //O of n square solution.
	int count =0;
    int arr[]=new int[nums.length];

    for(int i=0;i<nums.length;i++){
        for(int j=0;j<=nums.length-1;j++){
            if(nums[i]>nums[j]){
                count++;
            }

        }
        arr[i]=count;
        count=0;
    }
    return arr;
}
 */