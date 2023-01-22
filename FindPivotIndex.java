package com.company;
//not done
public class FindPivotIndex {
    public static void main(String args[]){
int nums[] ={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        int right =nums.length-1;
        int left  =0;

        int rsum =0;
        int lsum =0;

        while(left<right){
            lsum+=nums[left];
            left++;
            if(rsum==lsum){
                return right;
            }
            rsum+=nums[right];
            right--;
            if(rsum==lsum){
                return right;
            }
        }
        if(rsum==lsum){
            return right;
        }
        return -1;
    }
}
