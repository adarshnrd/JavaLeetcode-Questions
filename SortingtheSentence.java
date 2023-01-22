package com.company;

import java.util.ArrayList;

public class SortingtheSentence {
    public static void main(String args[]){
        String s ="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        //ArrayList<String>list =new ArrayList<>();
        int word =wordcount(s);
        String list[] =new String[word];
        int am=0;
        int start =0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                String a =s.charAt(i)+"";
                int j =Integer.parseInt(String.valueOf(a));
                list[j-1]=s.substring(start,i).trim();
                //list.add(j-1,s.substring(start,i));
                start=i+1;
            }
        }
        String ab ="";
        for(String we:list){
            ab+=we+" ";
        }
        return ab.trim();
    }
    public static int wordcount(String s){
        s+=" ";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
}
