package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayInGivenOrder {
    public static void main(String args[]) {
    int [] nums ={0,1,2,3,4};
    int [] index ={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
        public static int[] createTargetArray(int[] nums, int[] index) {

            int target[] = new int[nums.length];
            ArrayList <Integer> list =new ArrayList<>();

            for(int i=0;i<nums.length;i++){
                list.add(index[i],nums[i]);
            }

            for(int i=0;i<nums.length;i++){
                target[i] =list.get(i);
            }
//
//            for (int i = 0; i <=nums.length - 1; i++) {
//
//                if(target[i]){
//                    target[i]=target[i+1];
//                }
//                target[index[i]] = nums[i];
//            }
            return target;
        }
    }