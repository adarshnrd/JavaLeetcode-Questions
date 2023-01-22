package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class SumofAbsoluteDifferencesinaSortedArray {
    public static void main(String args[]){
int arr[] ={2,3,5};
        System.out.println(Arrays.toString(getSumAbsoluteDifferences(arr)));
    }
    public static int[] getSumAbsoluteDifferences(int[] nums) {

        ArrayList<Integer> list =new ArrayList<Integer>();
        int sum =0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){

                int mainsum =0;
                if(nums[i]==nums[j]){

                }
                else{
                    mainsum =Math.abs(nums[i]-nums[j]);
                    sum+=mainsum;
                }
            }
            list.add(sum);
            sum =0;
        }

        int arr[] =new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] =list.get(i);
        }
        return arr;
    }
}
