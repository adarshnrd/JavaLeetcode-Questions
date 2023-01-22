package com.company;
//not done yet

import java.util.Arrays;

public class SingleNumberII {
    public static void main(String args[]) {
        int nums[] = {30000,500,100,30000,100,30000,100};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int j = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {

            if (nums[j] == nums[i]) {
                i+=2;
                j+=3;
            } else if (nums[j]!=nums[i]) {
                return nums[j];
            }
        }
        return nums[nums.length - 1];
    }
    }
//      try{
//        Arrays.sort(nums);
//        int count =1;
//        int ans =0;
//        if(nums.length<2){
//            return nums[0];
//        }
//
//          for(int i=1;i<nums.length;i++){
//
//              if(nums[i-1]!=nums[i]&&nums[i]!=nums[i+1]){
//                  ans =nums[i];
//
//              }
//              else if(nums[i-1]!=nums[i] && nums[i-1]!=nums[i+1] ){
//                  return nums[i-1];
//              }
//
//          }
//          return ans;
//        }
//    catch (Exception e){
//          return nums[nums.length-1];
//    }
//    }
//
//}