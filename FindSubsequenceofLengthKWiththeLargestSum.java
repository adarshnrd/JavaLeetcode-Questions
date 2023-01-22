package com.company;
//not done.
import java.util.*;

public class FindSubsequenceofLengthKWiththeLargestSum {
    public static void main(String args[]){
    int nums[]={-1,-2,3,4};
    int k =3;
        System.out.println(Arrays.toString(maxSubsequence(nums,k)));
    }
    public static int[] maxSubsequence(int[] nums, int k) {
        HashMap<Integer,Integer>hm =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(i,nums[i]);
        }
        List<Map.Entry<Integer, Integer> > list = new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
        @Override
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
            return (o1.getValue()).compareTo(o2.getValue());
        }
    });
        int ans[] =new int[nums.length];
        int a =nums.length;
        for(Map.Entry<Integer,Integer>m:list){
            if(a<=k){
             int inde =m.getKey();
             ans[inde] =m.getValue();
            }
            a--;
        }
        int anss [] =new int[k];
        int sum =0;
        for(int i:ans){
            if(i!=0) {
                anss[sum] = i;
                sum++;
            }
        }
        return anss;
    }
}