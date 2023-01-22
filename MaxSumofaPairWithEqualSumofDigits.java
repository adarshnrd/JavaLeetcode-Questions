package com.company;
//will try later
public class MaxSumofaPairWithEqualSumofDigits {
    public static void main(String[] args) {
        int arr[] ={18,43,36,13,7};
        System.out.println(maximumSum(arr));
    }
    public static int maximumSum(int[] nums) {

     return 0;
    }

    public static int sum (int i){
        int j =i;
        int sum =0;
        while (j<0){
            int temp =i%10;
            sum =temp+sum;
        }
        return sum;
    }
}
