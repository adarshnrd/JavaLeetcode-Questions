package com.company;
//not done yet
public class SubarraySumEqualK {
    public static void main(String args[]){
        int num[]={1};
        int k =1;
        System.out.println(subarraySum(num,k));
    }
    public static int subarraySum(int[] nums, int k) {

        int count=0;
        int sum =0;
        if(nums.length<2){
            if(nums[0]==k){
                count++;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            sum =nums[i]+nums[i+1];
            if(sum == k || nums[i+1]==k){
                count++;
            }
            else{
                for(int j =i+2;j<nums.length;j++){
                    sum+=nums[j];
                    if(sum==k){
                        count++;
                        break;
                    }
                }
            }
        }
        return count;


    }
}
