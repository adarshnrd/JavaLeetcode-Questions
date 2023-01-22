package com.company;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String args[]){
int []nums={0,0,1,2};
System.out.println(dominantIndex(nums));
    }
    public static int dominantIndex(int[] nums) {
        int max =0;
        int maxelement =0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]>maxelement){
                max =i;
                maxelement =nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]*nums[i]<maxelement && i!=max){
                return max;
            }

        }


        return -1;
    }
}
