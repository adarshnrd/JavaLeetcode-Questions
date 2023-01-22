package com.company;

import java.util.HashSet;

public class IntersectionofTwoArrays {
    public static void main(String args[]){
int nums1 []={1,2,2,1};
int nums2 []={2,2};
        System.out.println(intersection(nums1,nums2));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {

//        Hashset<Integer> set=new Hashset();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
        int arr[] =new int[set.size()];
       int j =0;
     for(int i :set){
         arr[j] =i;
         j++;
     }
        return arr;
    }
}
