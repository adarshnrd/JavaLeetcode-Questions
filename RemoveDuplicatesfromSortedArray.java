package com.company;
import java.util.ArrayList;
import java.util.Arrays;
public class RemoveDuplicatesfromSortedArray {
    public static void main(String [] args){
        int[] nums = {1,2,1};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int unique =0;
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i =0;i<nums.length-1;i++){
        if(nums[i]!=nums[i+1]){
            list.add(nums[i]);
        }else {
            i++;
        }

        }
        return unique;
              }
    }

