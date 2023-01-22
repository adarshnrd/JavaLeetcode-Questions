package com.company;
import java.util.*;

public class SingleNumberIII {
    public static void main(String args[]){
        int nums[] ={0,1,2,2};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
    public static  int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list =new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            if(nums[i]!=nums[i+1]){
                list.add(nums[i]);
            }
            if(nums[i]==nums[i+1]){
                i++;
                if(i==nums.length-1){
                    break;
                }
            }
            if(i+1>=nums.length-1 && nums[i+1]!=nums[i]){
                list.add(nums[i+1]);
                break;
            }

        }

        int arr[] =new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
