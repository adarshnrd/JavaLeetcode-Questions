package com.company;

public class Revese_integer {
    public static void main(String [] args){
        int x =1534236469;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        int sum=0;
        int rem;
        boolean isNegative= x < 0 ?true:false;
        if(isNegative){
            x =x*-1;
        }
        while(x>0){
            if(sum>Integer.MAX_VALUE/10) return 0;
            if(sum<Integer.MIN_VALUE/10) return 0;
            rem =x%10;
            sum =sum*10+rem;
            x =x/10;



        }


        x =sum;
        return isNegative ==true? x*-1 :x;

    }
}


