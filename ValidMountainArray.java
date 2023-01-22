package com.company;

public class ValidMountainArray {
    public static void main(String args[]){
        int arr[] ={9,8,7,6,5,4,3,2,1,0};
        System.out.println(validMountainArray(arr));
    }
    public static boolean validMountainArray(int[] arr) {

        int max =0;
        int maxindex =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
                maxindex =i;
            }
        }
        if(maxindex ==arr.length-1|| maxindex ==0){
            return false;
        }
        int count=0;
        for(int i=0;i<maxindex;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }else{
                return false;
            }
        }
        for(int i=maxindex;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
            else{
                return false;
            }
        }

        if(count==arr.length-1){
            return true;
        }
        return false;
    }
}
