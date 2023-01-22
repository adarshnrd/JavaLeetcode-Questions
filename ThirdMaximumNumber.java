package com.company;


import java.util.Arrays;
import java.util.HashSet;

public class ThirdMaximumNumber {

    public static void main(String args[]){

        int arr[]={8166,1064,8508,6255};
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int max =0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max =nums[i];
            }
        }
        if(nums.length<=2){
            return max;
        }

        HashSet<Integer> set =new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int arr[] =new int[set.size()];
        int j =0;
        for(int i:set){
            arr[j] =i;
            j++;
        }
        Arrays.sort(arr);
        if(arr.length<=2){
            return max;
        }

        return arr[arr.length-3];

    }
    }