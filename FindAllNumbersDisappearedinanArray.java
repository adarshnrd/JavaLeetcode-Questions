package com.company;

import java.util.*;
//not done yet

public class FindAllNumbersDisappearedinanArray {
    public static void main(String args[]){
        int arr[] ={4,3,2,7,8,2,3,1};
            System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct =nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
    List<Integer>list =new ArrayList<>();

        for(int j =0;j<nums.length;j++){
            if(nums[j]!=j+1){
                list.add(j+1);
            }
        }

       return list;
    }
    public static void swap(int[]arr,int first,int second){
        int temp =arr[first];
        arr[first] =arr[second];
        arr[second] =temp;
    }
}



















//        int x = 1;
//
//        for(int i=0;i<nums.length;i++){
//        boolean flag=false;
//         for(int j =0;j< nums.length;j++){
//          if(nums[j]==x){
//              x++;
//              flag =true;
//              break;
//          }
//         }
//         if(flag==false){
//             list.add(x);
//             x++;
//         }
//        }
//        return list;
//    }
//    }
