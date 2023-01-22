package com.company;
//not done

import java.util.*;

public class FindKPairswithSmallestSums {
    public static void main(String args[]){
        int nums1[]={1,7,11};
        int nums2[]={2,4,6};

        int k =3;
        System.out.println(kSmallestPairs(nums1,nums2,k));

    }
    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                list.add(Collections.singletonList(nums1[i]));
                list.add(Collections.singletonList(nums2[i]));
            }
        }

return list;
    }
}
