package com.company;

import java.util.HashSet;

public class CountNumberofDistinctIntegersAfterReverseOperations {
    public static void main(String args[]){
    int nums[] ={1,13,10,12,31};
    System.out.println(countDistinctIntegers(nums));
    }
    public static int countDistinctIntegers(int[] nums) {

        int arr[] =new int[nums.length*2];
        int a =0;

        for(int i=0;i<nums.length;i++){
            arr[a]=nums[i];
            a++;
        }
        for(int i=0;i<nums.length;i++){
            int b =reversedigit(nums[i]);
            arr[a] =b;
            a++;
        }
        HashSet<Integer> hs =new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        return hs.size();
    }

    public static int reversedigit(int n){
        int ans =0;
        while(n>0){
            int ld =n%10;
            ans =ans*10+ld;
            n /=10;
        }
        return ans;
    }
}
