package com.company;

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int nums[] ={00,1,45,50,-1243,12};
        System.out.println(findNumbers(nums));
        System.out.println(digits(nums[4]));
    }
    public static int findNumbers(int[] nums) {
    int count=0;
        for(int i:nums){
            if(even(i)){
            count++;    
            }
        }
return count;
    }
   static int digits(int nums){//to find no.of digits in element
        if(nums<0){
            nums =nums*-1;
        }
        return (int)(Math.log10(nums))+1;
    }
    private static boolean even(int nums) {

        return digits(nums)%2==0;
    }

//    private static boolean even(int nums) {
//        if(nums<0){
//            nums =nums*-1;
//        }
//    String a =nums+"";
//    int b =a.trim().length();
//    if(b%2==0){
//        return true;
////    }
//    return false;
//    }

}
