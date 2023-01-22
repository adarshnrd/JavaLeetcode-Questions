package com.company;

import java.util.ArrayList;

public class ReverseWordsinaStringIII {
    public static void main(String args[]){
String a ="Let's take LeetCode contest";
        System.out.println(reverseWords(a));
    }
    public static String reverseWords(String s) {
        s +=" ";
        ArrayList<String> list =new ArrayList<>();
        int start =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                list.add(s.substring(start,i));
                start =i+1;
            }
        }
        String ans ="";
        for(int i =0;i<list.size();i++){
            ans+=reverse(list.get(i))+" ";
        }

return ans.trim();
    }
    public static String  reverse(String a){
        String ab ="";
        for(int i=a.length()-1;i>=0;i--){
            ab +=a.charAt(i);
        }
        return ab;
    }
}
