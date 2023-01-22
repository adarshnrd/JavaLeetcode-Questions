package com.company;
//not done

import java.util.Collections;
import java.util.HashSet;

public class IsomorphicStrings {
    public static void main(String args[]){
        String s ="bbbaaaba";
        String t ="aaabbbba";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        String a ="";
        String b ="";
      //  HashSet<String> hs =new HashSet<>(Collections.singleton(t));
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                a+=""+1;
            }else{
                a+=""+0;
            }
        }

        for(int i=0;i<t.length()-1;i++){
            if(t.charAt(i)==t.charAt(i+1)){
                b+=""+1;
            }else{
                b+=""+0;
            }
        }
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}
