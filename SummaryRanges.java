package com.company;

import java.util.*;

public class SummaryRanges {
    public static void main(String args[])
    {
        int nums[] ={1,2};
        System.out.println(summaryRanges(nums));

    }
    public static List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();
        if(nums.length<1){
            return list;
        }
        if(nums.length<2){
            list.add(nums[0]+"");
        }
        int count = 0;
        int start = 0;

        for(int i=0;i<nums.length-1;i++){
//["0","2->4","6","8->9"]
            if(nums[i]+1 == nums[i+1]){
                count++;
            }
            else if(nums[i]+1!=nums[i+1]&& count<1){
                list.add(""+nums[i]);
                start =i+1;
                count=0;
            }
            else{
                list.add(""+nums[start]+"->"+nums[i]);
                start =i+1;
                count =0;
            }
            if(i==nums.length-2){
                if(nums[i]+1==nums[i+1]){
                    list.add(""+nums[start]+"->"+nums[i+1]);
                }
                else{
                    list.add(""+nums[i+1]);
                }
            }


        }
        return list;

    }
}