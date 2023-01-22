package com.company;
import java.util.ArrayList;
public class palindrome_of_integer {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int end = x;//x is suppose to be start
        int sum = 0, r;
        while(x > 0) {
            r = x % 10;
            sum = sum*10 + r;
            x = x/10;
        }
        if(sum == end) return true;
        else return false;
    }
}