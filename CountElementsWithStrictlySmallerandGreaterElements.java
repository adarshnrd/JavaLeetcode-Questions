package com.company;

public class CountElementsWithStrictlySmallerandGreaterElements {
    public static void main(String args[]){
    int nums[] ={-89,39,39,-89,39,39};
        System.out.println(countElements(nums));
    }
    public static int countElements(int[] nums) {
        //2,7,11,15
        int count=0;
        int dc =0;
        int curr=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]<nums[j])
                {
                    curr=1;
                }
                if(nums[i]>nums[j]){
                    dc=1;
                }

            }
            if(curr==1 && dc ==1){
                count++;
            }
            curr=0;
            dc=0;
        }

        return count;
    }
}
