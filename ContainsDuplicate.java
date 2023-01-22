package com.company;

public class ContainsDuplicate {
    public static void main(String[] args) {
int []nums ={1,2,3,4};
        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {

        for(int i =0;i<nums.length-1;i++){

            if(nums[i]==nums[i+1]){
                return true;
            }


//            for(int j =i+1;j<nums.length;j++){
//                if(nums[i]==nums[j]){
//                    return true;
//                }
//            }

        }
        return false;
    }
}
