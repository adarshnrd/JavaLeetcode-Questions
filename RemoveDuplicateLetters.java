package com.company;
//not done yet
import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicateLetters {
    public static void main(String args[]) {
        String s = "cbacdcbc";
        System.out.println(removeDuplicateLetters(s));
    }

    public static String removeDuplicateLetters(String s) {
        HashSet<String> set =new HashSet<>();

        for(int i=0;i<s.length();i++){
            set.add(String.valueOf(s.charAt(i)));
        }
        String a ="";
        for(String i:set){
            a+=i;
        }
        return a;
    }
}
