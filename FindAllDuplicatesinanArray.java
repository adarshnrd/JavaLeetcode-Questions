package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicatesinanArray {
    public static void main(String args[]){

    }
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer>list = new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i<nums.length;i++){
        if(nums[i]==nums[i+1]){
            list.add(nums[i]);
        }
    }
return list;
    }
}
