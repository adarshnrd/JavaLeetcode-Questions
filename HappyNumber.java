package com.company;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String args[]){
        int n =19;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {

        HashSet<Integer>hs =new HashSet<>();
        while(true) {
            if (n == 1) {
                return true;
            }
            n = num(n);
            if (hs.contains(n)) {
                return false;
            }
            hs.add(n);
        }
    }
    public static int num(int n){
        int ans =0;
        while(n>0){
            int ld = n%10;
            ans+=(ld*ld);
            n/=10;
        }
        return ans;
    }
}

