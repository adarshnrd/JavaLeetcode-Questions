package com.company;
//done tle error

import java.util.*;

public class MinimumAbsoluteDifference {
    public static void main(String args[]){
        int arr[]={4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
            if(arr[i]-arr[j]<min && arr[i]-arr[j]>0){
                min =Math.abs(arr[i]-arr[j]);
            }
            }
        }

        List<List<Integer>> lp =new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if((arr[j]-arr[i])==min){
                    lp.add(Arrays.asList(arr[i],arr[j]));
                }
            }
        }
        //lp.add(Arrays.asList(min));
        return lp;
    }
}
