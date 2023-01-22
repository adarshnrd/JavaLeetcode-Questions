package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int arr[] ={0,1,5,4,0,4,0,5};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> list =new ArrayList<>();

        int count =0;//2
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]!=0){
                list.add(nums[i]);
            }
            else if(nums[i]==0){
                count++;
            }
        }
            for(int i=0;i<nums.length-count;i++){
                nums[i] =list.get(i);
            }
           for(int i=0;i<count;i++){
               nums[nums.length-1-i] =0;
           }
    }
}
