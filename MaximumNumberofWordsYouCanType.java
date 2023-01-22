package com.company;

import java.util.ArrayList;

public class MaximumNumberofWordsYouCanType {
    public static void main(String args[]){
        String text ="leet code";
        String bl ="e";
        System.out.println(canBeTypedWords(text,bl));
    }
    public static int canBeTypedWords(String text, String brokenLetters) {
        ArrayList<String> list =new ArrayList<>();
        text+=" ";
        int start=0;
        String wor ="";
        for(int i=0;i<text.length();i++){
            wor += text.charAt(i)+"";
            if(text.charAt(i)== ' '){
                list.add(wor.trim());
                wor="";
            }
        }
        for(int i=0;i<brokenLetters.length();i++){
            for(int j=0;j<list.size();j++){
                String ab =brokenLetters.charAt(i)+"";
                if(list.get(j).contains(ab)){
                    list.remove(list.get(j));
                    j=j-1;
                }
            }
        }
        return list.size();
    }
}
