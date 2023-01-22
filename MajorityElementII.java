package com.company;
import java.util.*;

public class MajorityElementII {
    public static void main(String args[]){
int arr[] ={0,0,0};
        System.out.println(majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] nums) {

        List<Integer> list =new ArrayList<>();
        Arrays.sort(nums);
        int count =1;
        int n =nums.length/3;

        if(nums.length<=1){
            list.add(nums[0]);
            return list;
        }
        if(nums.length<=2){
            if(nums[0]!=nums[1]){
                list.add(nums[0]);
                list.add(nums[1]);
            }
            else{
                list.add(nums[0]);
            }
            return list;
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }

            else if(nums[i]!=nums[i+1]){
                if(count>n){
                    list.add(nums[i]);
                }
                count=1;
            }
            if(i>=nums.length-2){
                if(count>n){
                    list.add(nums[i]);
                }
            }

        }
        return list;
    }
}
