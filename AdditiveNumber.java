package com.company;
//not done yet

public class AdditiveNumber {
    public static void main(String args[]){
String a ="112358";
        System.out.println(isAdditiveNumber(a));
    }
    public static boolean isAdditiveNumber(String nums) {
        int num []=new int[nums.length()];

        for(int i =0;i<nums.length();i++){
            num[i] =Integer.parseInt(String.valueOf(nums.charAt(i)));
        }
        int count =1;
        for(int i=0;i<num.length-2;i++){
            if(num[i]+num[i+1]==num[i+2]){
                count++;
            }
            else{
                count=0;
                break;
            }
        }
        if(count>1){
            return true;
        }
        return false;
    }
}
