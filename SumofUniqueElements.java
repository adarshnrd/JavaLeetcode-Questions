package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SumofUniqueElements {
    public static void main(String args[]){
        int []nums ={1,1,1,1,1,1};
        System.out.println(sumOfUnique(nums));

    }
    public static int sumOfUnique(int[] nums) {
        int sum =0;
        int count =0;
        int arr1[]=new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]==nums[j]){
                   count++;
               }
           }
           i =i+count;
           if(count<1){
               arr1[i]=nums[i];
               count=0;
           }
           count=0;
        }
        for (int i=0;i<arr1.length;i++){
            sum+=arr1[i];
        }

return sum;

//        HashSet <Integer> list=new HashSet<>();
//        for(int i=0;i<nums.length;i++){
//            list.add(nums[i]);
//        }
//        int sum =0;
//        Iterator<Integer> i =list.iterator();
//
//        while (i.hasNext()){
//            sum +=i.next();
//        }
//        return sum;
    }

}
