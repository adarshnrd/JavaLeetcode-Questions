package com.company;
import java.util.*;

public class NextGreaterElementI {
    public static void main(String args[]){
        int nums1[] ={4};
        int nums2[]={1,3,4,2,5};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        ArrayList<Integer>list =new ArrayList<Integer>();
        int j =0;// this is for nums1
        int count=0;
        for(int i=0;i<nums2.length;i++){//this is for nums2
            if(nums1[j]==nums2[i]){
                for(int a =i; a<nums2.length;a++){
                    if(nums1[j]<nums2[a]){
                        count=nums2[a];
                        break;
                    }
                }
                if(count==0){
                    list.add(-1);
                    j++;
                }
                else{
                    list.add(count);
                    count=0;
                    j++;
                }

            }
            if(i>=nums2.length-1){
                i=-1;
            }
            if(j==nums1.length){
                break;
            }

        }
            int ans[]=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
            return ans;
    }
}
