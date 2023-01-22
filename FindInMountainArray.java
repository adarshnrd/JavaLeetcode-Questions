package com.company;

public class FindInMountainArray {
    public static void main(String args[]){
    int arr[]={1,2,3,4,5,3,1};
    int target =2;
        System.out.println(search(arr,target));
    }
    public static int search(int[]arr,int target){
        int peak = peakIndexMontain(arr);
        int first= OrderAgnosticBs(arr,target,0,peak);
        if(first!=-1){
            return first;
        }
        return OrderAgnosticBs(arr,target,peak+1,arr.length-1);
    }

    public static int peakIndexMontain(int[]arr){
        int start =0;
        int end =arr.length-1;

        while (start<end){
            int mid =start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end =mid;
            }
            else{
                start =mid+1;
            }
        }
        return start;
    }
    public static int OrderAgnosticBs(int arr[],int target,int start,int end){
        boolean isAsc =arr[start]<arr[end];
        while(start<=end){
            int mid =start+(end-start)/2;

            if(target ==arr[mid]){
                return mid;
            }
            if(isAsc){
             if(target<arr[mid]){
                 end =mid-1;
             }
             else{
                 start =mid+1;
             }
            }
            else {
                if(target>arr[mid]){
                    end =mid-1;
                }
                else{
                    start =mid+1;
                }
            }
        }
        return -1;
    }
}
