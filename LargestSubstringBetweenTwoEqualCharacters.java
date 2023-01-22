package com.company;
public class LargestSubstringBetweenTwoEqualCharacters {
    public static void main(String args[]){
String s ="tdygtxrvxjnwksqhxuxtrv";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
    public static int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        for(int i=0;i<s.length();i++){
            int count =maxlength(s,i,s.charAt(i));
            if(count>max){
                max =count;
            }
        }
        return max;
    }
    public static int maxlength(String s,int i,char a){
        int max =-1;
        int count=0;
        boolean b =false;
        i++;
        for(;i<s.length();i++){
            if(a!=s.charAt(i)){
                count++;
            }
            else {
                max =count;
                b =true;
                count++;
            }
        }
        if(!b){
        max =-1;
        }
        return max;
    }
}
