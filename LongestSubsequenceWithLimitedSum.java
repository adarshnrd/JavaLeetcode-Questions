package com.company;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    public static void main(String[] args) {
        int []nums={4,5,2,1};
        int []q ={3,10,21};
        System.out.println(Arrays.toString(answerQueries(nums,q)));
    }
    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int arr[] =new int[queries.length];

        for(int i=0;i<queries.length;i++){
            arr[i] =elemtcout(nums,queries[i]);
        }
        return arr;
    }
    public static int elemtcout(int[] nums,int j){

        int count =0;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            if(count==j){
                break;
            }
            if(count<j){
                count+=nums[i];
                sum++;
            }
            if(count>j){
                count-=nums[i];
                sum--;
            }
        }
        return sum;
    }
}
