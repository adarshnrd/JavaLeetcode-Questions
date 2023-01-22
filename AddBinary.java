package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//need more work to do //not done for long values;
public class AddBinary {
    public static void main(String args[]){
//        String a ="1";
//        String b ="11";
//        char[] amp ={'a','b','c'};
//
//        ArrayList<Character>list =new ArrayList<>();
//        Collections.reverse(list);
//        System.out.println(addBinary(a,b));
        String a ="revav";
        System.out.println(repeatedCharacter(a));
    }
    public static String addBinary(String a, String b) {
        String aa = String.valueOf(Integer.parseInt(a, 2));
        String bb =String.valueOf(Integer.parseInt(b,2));
       // BigInteger c = BigInteger.valueOf(Integer.parseInt(aa)+Integer.parseInt(bb));
        Integer c =Integer.parseInt(aa)+Integer.parseInt(bb);
        String s =Integer.toBinaryString(c);
        String ads = String.valueOf(a.toCharArray());

        return s;
    }
    public void reverseString(char[] s) {
        int start =0;
        int end =s.length-1;
        while (start<=end){
            char temp =s[start];
            s[start] =s[end];
            s[end] =  temp;
            start++;
            end--;
        }
    }
    public static char repeatedCharacter(String s) {
    char arr[] =s.toCharArray() ;
    Arrays.sort(arr);

        for(int i =0;i<=s.length()-1;i++){
            if(arr[i]==arr[i+1]){
                return arr[i];
            }
        }

//        for(int i=0;i<s.length();i++){
//            for(int j =i+1;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    return s.charAt(j);
//                }
//            }
//        }
//        return s.charAt(0);
    return s.charAt(0);
    }
}
