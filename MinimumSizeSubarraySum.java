package com.company;

import java.util.Arrays;

public class MinimumSizeSubarraySum {
    public static void main(String args[]){
        int nums[] ={12,28,83,4,25,26,25,2,25,25,25,12};//1 2 2 3 3 4
        int target =213;
        System.out.println(minSubArrayLen(target,nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return 1;
            }
        }
        Arrays.sort(nums);//1,2,2,3,3,4
            int start =0;
            int end =nums.length-1;
            while (start<end){
                if(nums[start]+nums[end]==target){
                    return 2;
                }
                if(nums[start]+nums[end]>target){
                    end--;
                }
                if(nums[start]+nums[end]<target){
                    start++;
                }
            }

        start =nums.length-2;
        end =nums.length-1;
        int sum =nums[start]+nums[end];//2
        int count =2;
        //elements 1,1,1,1,1,1,1 5
        start--;
        while (sum!=target) {
        if(sum==target){
            return count;
        }
        if(sum>target){
            sum-=nums[start+1];
            count-=1;
        }

        if(sum<target){
            sum+=nums[start];
            start--;
            count++;
        }
            if(start==0 && sum<target || (start ==0 && sum>target)){
                break;
            }
            if(sum==target){
                return count;
            }

        }
        return 0;
    }
}
/*
if(sum ==target){
            return count;
        }
        if(sum<target){
            start--;
            sum+=nums[start];
            count++;
        }
        if(sum>target){
            end--;
            start =end-1;
            sum =nums[end]+nums[start];
            count =2;
        }
        if(start<0){
            break;
        }
            }

 */