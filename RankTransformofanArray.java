package com.company;
//tle
import java.util.*;

public class RankTransformofanArray {
    public static void main(String args[]){
        int arr[] ={40,10,20,30};
      //  System.out.println(Arrays.toString(arrayRankTransform(arr)));
        int a =26%3;
        System.out.println(a);
    }
    public static int[] arrayRankTransform(int[] arr) {
        int ans[] =new int[arr.length];
        TreeSet<Integer> hs =new TreeSet<>();
        for(int i:arr){
            hs.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>(hs);
        for(int i=0;i<arr.length;i++){
            int a =list.indexOf(arr[i]);
            ans[i]=a+1;
        }
        return ans;
    }
}
