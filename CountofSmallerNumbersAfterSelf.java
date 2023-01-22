package com.company;
import java.util.*;
//not done.
public class CountofSmallerNumbersAfterSelf {
    public static void main(String args[]){
    int nums[]={5,2,6,1};
        System.out.println(countSmaller(nums));
    }
    public static List<Integer> countSmaller(int[] nums) {

            List<Integer>list =new ArrayList<>();
            int ans[] =new int [nums.length];
            int a=0;
            for(int i:nums){
                ans[a]=i;
                a++;
            }
            Arrays.sort(ans);

            for(int i=0;i<ans.length;i++){
                int target =nums[i];
                int anss[]=new int[ans.length-i];
                int b =0;
                for(int j=i;j<ans.length;j++){
                    anss[b] =ans[j];
                    b++;
                }
                list.add(BinarySearch(anss, target));
            }

        return list;
        }
        public static int BinarySearch(int []nums,int target){
        int start=0;
        int end =nums.length-1;

        while (start<=end){
            int mid =start+(end-start)/2;
            if(nums[mid] ==target){
                return mid;
            }
            if(target>nums[mid]){
                start=mid+1;
            }
            if(target<nums[mid]){
                end =mid-1;
            }
        }
        return -1;
        }
    }
