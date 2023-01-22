package com.company;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String args[]){
      int   nums1[] = {-1,0,0,3,3,3,0,0,0};
      int m =6;
      int nums2[] ={1,2,2};
      int n =3;
      merge(nums1,m,nums2,n);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int length =m+n;
        Arrays.sort(nums1);
        int c =nums1.length-m;
        int count =0;
        for(int i :nums1){
            if(i<0){
                count++;
            }
        }

        int a =0;
        for(int i =0;i<c+count;i++){
            if(nums1[i]==0){
                nums1[i] =nums2[a];
                a++;
            }

        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
/*op  solution
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for(int i = m; i < nums1.length;i++){
            nums1[i] = nums2[k++];
            if(k == nums2.length) break;
        }

        Arrays.sort(nums1);
    }
}
 */

/*
 public void merge(int[] nums1, int m, int[] nums2, int n) {
       int length =m+n;
        Arrays.sort(nums1);
        int c =nums1.length-m;
        int count =0;
         for(int i :nums1){
            if(i<0){
                count++;
            }
        }

        int a =0;
        for(int i =0;i<c+count;i++){
            if(nums1[i]==0){

                nums1[i] =nums2[a];
                a++;
            }

        }



        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

    }
*/