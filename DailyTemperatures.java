package com.company;
//TLe
public class DailyTemperatures {
    public static void main(String args[]){
        int tem[]={73,74,75,71,69,72,76,73};
        System.out.println(dailyTemperatures(tem));
    }
    public static int[] dailyTemperatures(int[] tem) {

        int arr[] =new int[tem.length];

        for(int i=0;i<tem.length;i++){
            for(int j=i+1;j<tem.length;j++){
                if(arr[i]<arr[j]){
                    arr[i]=j-i;
                    break;
                }
            }

        }
        return arr;
    }
}
