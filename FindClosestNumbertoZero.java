package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class FindClosestNumbertoZero {
    public static void main(String args[]){
        int arr[] ={-4,-2,1,4,8};
        System.out.println(findClosestNumber(arr));
    }
    public static int findClosestNumber(int[] nums) {

        ArrayList<Integer>list =new ArrayList<>();
        ArrayList<Integer>negative =new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(nums[i]);
            }
            else {
                negative.add(nums[i]);
            }
            if(nums[i]==0){
                return 0;
            }
        }
        Collections.sort(list);
        Collections.sort(negative);

        if(list.size()==0){
            return negative.get(negative.size()-1);
        }
        if(negative.size()==0){
            return list.get(0);
        }

        int ans = list.get(0);
        int sub = negative.get(negative.size()-1)*-1;

        // int native =negative.get(negative.size()-1)*-1;
        int a =Math.min(ans,sub);
        if(a==sub && ans==sub){
            return ans;
        }
        if(a==sub ){
            return sub*-1;
        }
        else
            return ans;

    }
}
