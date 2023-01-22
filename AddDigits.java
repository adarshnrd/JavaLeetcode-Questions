package com.company;

public class AddDigits {
    public static void main(String args[]){
        int num =38;
        System.out.println(addDigits(num));
    }
    public static int addDigits(int num) {
        int ans =0;
        if(num<=9){
            return num;
        }
        while(num>9){
            int sum  =0;
            while(num>0){
                int ld =num%10;
                sum +=ld;
                num/=10;
                ans =sum;
            }
            num =sum;
        }
        return ans;
    }
}
