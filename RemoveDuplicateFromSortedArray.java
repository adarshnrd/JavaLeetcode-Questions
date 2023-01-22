package com.company;

public class RemoveDuplicateFromSortedArray {
    public static void main(String args[]){
int arr[] ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(RemoveDuplicates(arr));
    }
    public static int RemoveDuplicates(int[] nums) {
        int j =1;
        for(int i=0;i<nums.length-1;i++) {
            if (nums[i] ==nums[i+1]){
                continue;
            }
            nums[j]=nums[i+1];
            j++;
        }
        return j;
    }
    }
