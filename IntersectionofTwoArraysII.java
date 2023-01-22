package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
int nums1[]={1,2,2,1};//1122
int nums2[]={1,2};//12
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int i =0;
        int j=0;
        while (i<nums1.length && j<nums2.length ){

            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int a =0;
        int arr[] =new int[list.size()];
        while (a!=list.size()){
            arr[a]=list.get(a);
            a++;
        }
        return arr;
    }
}


//        int count =0;
//        for(int i =0;i<nums1.length;i++){
//            for(int j=0;j<nums2.length;j++){
//                if(nums1[i]==nums2[j]){
//                    list.add(nums1[i]);
//                    count++;
//                    break;
//                }
//            }
//
//            if((nums1.length ==1 || nums2.length ==1)&& count>=1){
//                break;
//            }
//        }
//        int arr[] =new int [list.size()];
//        int j=0;
//        for(int i:list){
//            arr[j] =i;
//            j++;
//        }
//
//        return arr;

