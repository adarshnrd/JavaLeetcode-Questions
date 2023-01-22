package com.company;
//not done yet;
import java.util.Arrays;

public class SmallestRangeII {
    public static void main(String args[]){
int nums[] ={7,8,8,9,10};
int k =5;
        System.out.println(smallestRangeII(nums,k));
    }
    public static int smallestRangeII(int[] nums, int k) {
        int max =0;
        int min =0;

        for(int i=0;i<nums.length;i++){
            max =Math.max(nums[i],max);
        }
        for(int i=0;i<nums.length;i++){

        }
        return max;
    }
}
       /* int max =0;
        int maxindex =0;
        int min =Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){

            if(nums[i]>max){
                max =nums[i];
                maxindex =i;
            }
            min =Math.min(nums[i],min);
        }

        for(int i =0;i<nums.length;i++){
            if(i ==maxindex){
                nums[i] =max-k;
            }
            else{
                nums[i] =nums[i]+k;
            }
        }
        Arrays.sort(nums);
        max =nums.length-1;
        min =nums.length-2;
        return max-min;


    }
}
*/