package com.company;

import java.util.Arrays;
//not good for all testcase solution down below in comments
public class MakeArrayZerobySubtractingEqualAmounts {
    public static void main(String args[]){
       // int arr[] ={1,5,0,3,5};
        int arr[] ={58,88,77};
        System.out.println(minimumOperations(arr));

    }
    public static int minimumOperations(int[] nums) {
        int count =0;
        int zeros =0;
        Arrays.sort(nums);
        int x =0;
        if(nums[0]< 1){
             x =1;
        }
        else if (nums[0]>2){
             x =nums[0]-1;
        }

        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums.length;j++){
                if(nums[j]<=0){
                    zeros++;
                }else {
                    nums[j] = nums[j] - x;
                }
            }

            if(zeros>=nums.length-1){
                break;
            }
            count++;
            zeros=0;
            x++;


        }
        return count;
    }
}




/*
class Solution {
    public int minimumOperations(int[] nums)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] > 0){
                hs.add(nums[i]);
            }
        }
        return hs.size();
    }
}*/






//        int arr[]=new int[nums.length];
//
//        for(int i=0;i<nums.length;i++){
//            arr[i]=nums[i];
//        }
//        Arrays.sort(arr);
//        Arrays.sort(nums);
//        int count =0;
//        for(int i=0;i<nums.length;i++){
//            for(int j=0+i;j<nums.length;j++){
//            if(nums[i]<=0){
//                break;
//            }
//                nums[j]= nums[j]-arr[i];
//                count++;
//            }
//           // count++;
//        }
//
//        return count;
//    }
//}
/*
if(nums[i]==0){
                    break;
                }
 */