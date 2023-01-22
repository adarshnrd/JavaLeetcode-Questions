package com.company;

import java.util.*;

public class FindtheDifferenceofTwoArrays {
    public static void main(String args[]) {
        int nums1[] = {1, 2, 3};
        int nums2[] = {2,4,6};

        System.out.println(findDifference(nums1,nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer>hs =new HashSet<>();
        HashSet<Integer>hs2 =new HashSet<>();
        List<Integer>l1 =new ArrayList<>();
        List<Integer>l2 =new ArrayList<>();

        for(int i:nums1){
            hs.add(i);
        }
        for(int i:nums2){
            hs2.add(i);
        }
        for(int i:hs){
           if(hs2.contains(i)){

           }
           else{
               l1.add(i);
           }
        }

        for(int i:hs2){
            if(hs.contains(i)){

            }
            else{
                l2.add(i);
            }
        }
        list.add(l1);
        list.add(l2);

    return list;
    }
    }

        /*
        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer>hs =new HashSet<>();
        HashSet<Integer>hs2 =new HashSet<>();
        List<Integer>l1 =new ArrayList<>();
        List<Integer>l2 =new ArrayList<>();
        for(int i:nums1){
            hs.add(i);
        }
        for(int i:nums2){
            hs2.add(i);
        }
        int arr1[]=new int[hs.size()];
        int arr2[]=new int[hs2.size()];
        int b =0;
        for(Integer i:hs){
            arr1[b]=i;
            b++;
        }
        b=0;
        for(int i:hs2){
            arr2[b]=i;
            b++;
        }
        for(int i=0;i<arr1.length;i++){
            int count=0;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    count++;
                }
            }
            if(count==0){
                l1.add(arr1[i]);
            }
        }
        for(int i=0;i<arr2.length;i++){
            int count=0;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    count++;
                }
            }
            if(count==0){
                l2.add(arr2[i]);
            }
        }
        list.add(l1);
        list.add(l2);

        return list;
    }
}
*/