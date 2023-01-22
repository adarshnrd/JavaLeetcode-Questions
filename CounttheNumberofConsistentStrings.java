package com.company;

import java.util.ArrayList;
import java.util.HashSet;

//not done yet
public class CounttheNumberofConsistentStrings {
    public static void main(String args[]){
        String allowed = "abc";
        String []words = {"ab","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed,words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for(int i=0;i< words.length;i++){
                if(all(words[i],allowed)){
                    count++;
            }
        }
    return count;
      }
      public static boolean all(String a,String allowed){
        for(int i=0;i<a.length();i++){
            String ag= a.charAt(i)+"";
            if(allowed.contains(ag)){

            }
            else{
                return false;
            }
        }
        return true;
      }
}