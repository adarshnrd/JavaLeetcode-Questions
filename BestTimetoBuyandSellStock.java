package com.company;
//not done

public class BestTimetoBuyandSellStock {
    public static void main(String args[]){
    int arr[]={2,4,1};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] arr) {
        int min =Integer.MAX_VALUE;
        int index =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min =arr[i];
                index =i;
            }
        }
        int max =0;
        for(int i=index;i<arr.length;i++){
            if(arr[i]>min&&arr[i]>max){
                max =arr[i];
            }
        }
        if(max-min<0){
            return 0;
        }
        return max-min;
    }
}