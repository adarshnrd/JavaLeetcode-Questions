package com.company;

import java.util.Arrays;

public class ElementAppearingMoreThan25InSortedArray {
    public static void main(String args[]){
        int arr[] ={15,15,21,21,32,32,33,33,33,34,35};
        System.out.println(findSpecialInteger(arr));
    }
    public static int findSpecialInteger(int[] arr) {

        if(arr.length<=1){
            return arr[0];
        }
        int count =1;
        int max =0;
        int nu =0;

        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else {
                count=1;
            }

            if(count>max){
                max =count;
                nu =arr[i];
            }
        }
        return nu;
    }
}
