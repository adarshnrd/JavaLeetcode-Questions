package com.company;

public class DetectCapital {
    public static void main(String[] args) {
        String ab="Leetcode";
        System.out.println(detectCapitalUse(ab));
    }
    public static boolean detectCapitalUse(String word) {
    String isupp=word.toUpperCase();
    String islow=word.toLowerCase();

    if(word.equals(isupp)||word.equals(islow)){
        return true;
    }

    int count=0;
    int lowcount=0;
        if(word.charAt(0)>64&&word.charAt(0)<91){
            count++;
        }
    for(int i=1;i<word.length();i++){
        if(word.charAt(i)>64&&word.charAt(i)<91){
        return false;
        }
        else{
            lowcount++;
        }
    }
        return count == 1 && lowcount == word.length() - 1;
    }
}
