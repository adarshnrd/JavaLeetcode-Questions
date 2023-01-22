package com.company;
//not done yet

import java.util.Arrays;

public class NextGreaterElementII {
    public static void main(String args[]){
        int nums[] ={1,2,3,4,3,1};
        //int nums[]={5,4,3,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }

    public static int[] nextGreaterElements(int[] nums) {
        int arr[] =new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int nme =next(nums,i);
            arr[i]=nme;
        }
        return arr;
    }
    public static int next(int nums[],int start){
        int s =start+1;
        int index =-1;

        while (s!=start){
            if(s>=nums.length){
                s=0;
            }
            if(nums[s]>nums[start]){
                return nums[s];
            }
            s++;
            if(s>=nums.length){
                s=0;
            }
        }
        return index;
    }
}



        /*
        int maxvalue =nums[0];
        int ans [] =new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                count=0;
                if(nums[j]>nums[i]){
                    ans[i] =nums[j];
                    maxvalue =nums[j];
                    count++;
                    break;
                }
            }
            if(nums[i]==maxvalue){
                ans[i]=-1;
            }
            else{
                ans[i]=maxvalue;
            }
        }
        return ans;    }
}

        /* int cme =0;
        int max =nums[0];
        int a =0;
        int ans[]=new int[nums.length];

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                cme=nums[i];
            }
            else if(nums[i-1]>nums[i]){
                if(max ==nums[i-1]){
                    cme =-1;
                }
                else {
                    cme =max;
                }
            }
            if(cme>max){
                max =cme;
            }
            ans[a]=cme;
            a++;

            if(i==nums.length-1){
                if(nums[i]<nums[0]){
                    cme =nums[0];
                }else if(nums[i]==nums[0]){
                    cme =max;
                }
                else if (nums[i]>nums[0]&& nums[i]!=max) {
                cme =max;
                }
                else if (nums[i]==max) {
                    cme =-1;
                }
                ans[a] =cme;
                a++;
            }

        }
       return ans;
    }
}
        /*
        int cme =0;
        int max =0;
        int a =0;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                cme =nums[i+1];
            }else{
                if(nums[i]<max){
                    cme =max;
                }else{
                    cme =-1;
                }
            }
            if(cme>max) {
                max = cme;
            }
            ans[a]=cme;
            a++;
            if(i==nums.length-2){
                if(nums[0]>nums[nums.length-1])
                {
                    cme =nums[0];
                }else if(nums[nums.length-1]==max){
                    cme =-1;
                }
                else{
                    cme =max;
                }
                ans[a]=cme;
                a++;
            }
        }

        return ans;
    }
}
*/