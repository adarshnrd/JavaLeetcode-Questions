package com.company;
//not done
import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
    int nums[] = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }
    public static String largestNumber(int[] nums) {
        Arrays.sort(nums);
        String a ="";

        for(int i=0;i<nums.length;i++){
            a+=nums[i];
        }
        char[] ab =a.toCharArray();
        Arrays.sort(ab);
        String ac ="";
        for(int i=0;i<ab.length;i++){
            ac+=ab[ab.length-i-1];
        }
        return ac;
    }
}
