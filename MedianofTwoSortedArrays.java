package com.company;

import java.util.*;
public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int []nums1 = {1,2};
       int [] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double a=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        double e = list.size();
        double start =0;
        double end = e;
        double mid =start+(end-start)/2;
        if(e<2){
            return list.get(0);
        }
        if(e%3==0){

            return list.get((int) mid);
        }
        double ab =list.get((int)mid);
        double cb =list.get((int)mid-1);
        double ans =(ab+cb)/2;
        return ans;
    }
}
