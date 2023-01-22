package com.company;
import java.util.*;
//not done yet one complete solution down but long testcase dont work
public class LC_3Sum {
    public static void main(String args[]){
int nums[] ={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static  List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();

        int k =2;
        for(int i=0;i<nums.length;i++){
            for(int j =i+1;j< nums.length;j++) {
                if(k>=nums.length-1){
                    k=2;
                    break;
                }
                if((i!=j && i!=k && j!=k )&& (nums[i]+nums[j]+nums[k]==0)){
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));

                }
            }
        }



        if(list.size()<2){
            return list;
        }

        for(int i =0;i<list.size();i++){
            Collections.sort(list.get(i));
        }

 Set<List<Integer>> res =new HashSet<>();

        for(int i =0;i<list.size();i++){
            res.add( list.get(i));
        }


return new ArrayList<>(res);
//return new ArrayList<>(res);
    }
}
/*
 public static  List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
       // Set<List<Integer>> list  = new HashSet<>();
        int swaped =0;
        for(int i=0;i<nums.length;i++){
            for(int j=1+i;j<nums.length;j++){
                for(int k =2+i;k<nums.length;k++){
                    if((i!=j && i!=k && j!=k )&& (nums[i]+nums[j]+nums[k]==0)){
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    break;
                    }
                }

            }
        }
        if(list.size()<2){
            return list;
        }

        for(int i =0;i<list.size();i++){
            Collections.sort(list.get(i));
        }

 Set<List<Integer>> res =new HashSet<>();

        for(int i =0;i<list.size();i++){
            res.add( list.get(i));
        }


return new ArrayList<>(res);
//return new ArrayList<>(res);
    }
 */