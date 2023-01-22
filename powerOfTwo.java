package com.company;

public class powerOfTwo {
    public static void main(String args[]){
int n=1073741824;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        int a = 2;
        long ab = 1073741824;
        if (n > ab) {
            while (n >= ab) {
                if (n == ab) {
                    return true;
                }
                ab = ab * 2;
            }
            return false;
        }
        return false;
    }
}
/*
 public static boolean isPowerOfTwo ( int n){
            if (n == 1)
                return true;
            else if (n % 2 != 0 || n == 0)
                return false;
            return isPowerOfTwo(n / 2);
        }
    }
 */
