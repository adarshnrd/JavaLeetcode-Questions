package com.company;

import java.util.Arrays;

public class setMatch {
    public static void main(String args[]){
        //int nums[] ={1,5,3,2,2,7,6,4,8,9};
        int nums[] ={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int index=0;
        int number=0;
        int anss[]=new int[nums.length];
        int changed []=cha(anss,nums);


        Arrays.sort(nums);
        int j =1;
        for(int i=0;i<nums.length;i++){
            if(j!=changed[i]){
                number=j;
                break;
            }
            j++;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                index =nums[i];
                break;
            }
        }
        int ans[] =new int[2];
        ans [0]=index;
        ans[1]=number;
        return ans;

    }
    public static int[] cha(int arr[],int nums[]) {
    for(int i=0;i<nums.length;i++){
        arr[nums[i]-1]=nums[i];
    }
    return arr;
    }
}
