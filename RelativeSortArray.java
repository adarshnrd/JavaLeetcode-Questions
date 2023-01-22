package com.company;

import java.util.*;

public class RelativeSortArray {
    public static void main(String args[]){
        int arr1[]={2,3,1,3,2,4,6,7,9,2,19};
        int arr2[]={2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        int nums[] =new int[arr1.length];
        LinkedHashSet<Integer> hs =new LinkedHashSet<>();
        for(int i:arr1){
        hs.add(i);
        }

        int index =0;

        for(int i=0;i<arr2.length;i++){
            int a =count(arr1,arr2[i]);
            while(a-->0){
                nums[index]=arr2[i];
                index++;
            }

            if(hs.contains(arr2[i])){
                hs.remove(arr2[i]);
            }
        }
     for(int i:hs){
         int ab =count(arr1,i);
         int a =i;
         while(ab-->0){
             nums[index]=a;
             index++;
         }
     }
        return nums;
    }
    public static int count(int arr[],int n){

        int count=0;
        for(int i=0 ;i<arr.length;i++){
            if( n==arr[i]){
                count++;
            }
        }

        return count;
    }
}
