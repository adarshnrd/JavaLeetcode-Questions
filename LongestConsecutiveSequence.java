package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String args[]){
    int arr[] ={0,-1};
    System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {

        if(nums.length<1){
            return 0;
        }

        HashSet<Integer>hs =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int arr[] =new int[hs.size()];
        int a=0;

        for(int i:hs){
            arr[a]=i;
            a++;
        }

        int count =1;
        int maxcount=0;
        Arrays.sort(arr);
        if(arr.length<2){
            return 1;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1==arr[i+1]){
                count++;
            }
            if(count>maxcount){
                maxcount=count;
            }
            if(arr[i]+1!=arr[i+1]){
                count=1;
            }
        }

        return maxcount;
    }
}
