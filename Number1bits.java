package com.company;

public class Number1bits {
    public static void main(String args[]){
        int n =429496729;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
       int count=0;
       while (n!=0){
           n =n&(n-1);
           count++;
       }
       return count;
    }
}
