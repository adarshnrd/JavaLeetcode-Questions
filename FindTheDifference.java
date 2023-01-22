package com.company;

public class FindTheDifference {
    public static void main(String args[]){
        String s ="abcde";
        String t ="abcded";
        System.out.println(findTheDifference(s,t));
    }
    public static char findTheDifference(String s, String t) {

        char arr[] =new char[s.length()+t.length()];
        int q =s.length();

        for(int i=0;i<s.length();i++){
            arr[i] =s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            arr[q] =t.charAt(i);
            q++;
        }
char ans =arr[0];
       for (int i=1;i<arr.length;i++){
           ans ^=arr[i];
       }
return  ans;
    }
}
