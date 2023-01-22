package com.company;

import java.util.*;

public class DecodetheMessage {
    public static void main(String args[]){
    String key ="the quick brown fox jumps over the lazy dog";
    String message ="vkbs bs t suepuv";
    System.out.println(decodeMessage(key,message));
    }
    public static String decodeMessage(String key, String message) {
        char alpha [] =new char[26];
        int a =0;
        for(char i ='a';i<='z';i++){
            alpha[a] =i;
            a++;
        }
        LinkedHashSet<Character> list =new LinkedHashSet<>();

        for(int i=0;i<key.length();i++){
            if(key.charAt(i)== ' '){
            }
            else{
                list.add(key.charAt(i));
            }
        }
        String run ="";
        for(char j: list){
            run+=j;
        }
        String ans ="";
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)== ' '){
        ans +=" ";
            }else {
                char ae =message.charAt(i);
                int ab =run.indexOf(ae);
                ans+=alpha[ab];
            }
        }

        return ans;
    }
}