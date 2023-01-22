package com.company;
//not done.
import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
    String s ="dog cat cat fish";
    String pattern ="abba";
        System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s) {

        HashMap<Character,String> hm= new HashMap<>();
        String arr[]=new String[pattern.length()];
        int start=0;
        s+=" ";
        int a =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                String ab =s.substring(start,i);
                arr[a]=ab.trim();
                a++;
                start=i+1;
            }
        }
        for(int i=0;i<arr.length;i++){
            hm.put(pattern.charAt(i),arr[i]);
        }
//
//        for(int i=0;i<arr.length;i++){
//            char aq  =pattern.charAt(i);
//            String abs =hm.get(aq);
//            char abs =hm.get("fish");
//        }
        return true;
    }
//    public static String word(String s){
//
//    }
}
