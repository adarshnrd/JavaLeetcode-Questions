package com.company;
import java.util.*;

public class merge2array {
    public static void main(String args[]) {
        int arr1[] ={1,2,3,0,0,0};
        int m =arr1.length;
        int arr2[] ={2,5,6};
        int n =arr2.length;

        merge(arr1,m,arr2,n);


    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length =m+n;
        int arr[] =new int[length];
        for(int i=0;i<m;i++){
            arr[i] =nums1[i];
        }
        int l =length-n;
        int a =0;
        for(int i =l;i<=length-1;i++){
            arr[i] =nums2[a];
            a++;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

        /*      int arr1[] ={1,3,4,5};
        int arr2[] ={2,4,5};

        int length =arr1.length+arr2.length;
        //System.out.println(length);

        int arrs[] =new int[length];

       for(int i =0;i<arr1.length;i++){
           arrs[i] =arr1[i];
       }
       int l =length-arr2.length;
        int a =0;
    for(int i =l;i<=length-1;i++){

    arrs[i] =arr2[a];
    a++;
}
        System.out.println(Arrays.toString(arrs));

    }
}
*/