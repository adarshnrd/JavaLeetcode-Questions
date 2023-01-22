package com.company;
import java.util.Arrays;

public class RotateArray {
    public static void main(String args[]){
        int arr[] ={1,2};
        int k =5;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        int ans[]=new int[nums.length];

        if(k>nums.length){
            if(k>nums.length*2){
                k=k/nums.length-1;
            }
            else{
                k=k-nums.length;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(k==nums.length){
                ans[i]=nums[i];
            }
            else{
                ans[k]=nums[i];
                k++;
                if(k==nums.length){
                    k=0;
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i] =ans[i];
        }
    }
}

/*
        if(k>=nums.length){
            int arr1[] =new int [nums.length];
            int t =0;
            for(int i =nums.length-1;i>=0;i--){
                arr1[t]=nums[i];
                t++;
            }
            int e =0;
            for(int j:arr1){
                nums[e]=j;
                e++;
            }
        }
        int arr[] =new int[nums.length];
        int a =0;
        if(nums.length>2 && k<nums.length){
            for(int i=nums.length-k;i<nums.length;i++){
                arr[a] =nums[i];
                a++;
            }
            int arrs =k;

            for(int i=0;i<nums.length-k;i++){
                arr[arrs] =nums[i];
                arrs++;
            }

            int b =0;
            for(int i :arr){
                nums[b] =i;
                b++;
            }
        }
    }
}
*/