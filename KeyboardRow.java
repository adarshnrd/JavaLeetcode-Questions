package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class KeyboardRow {
    public static void main(String args[]){
        String []words={"Alaska","Hello","Dad","Peace"};
        System.out.println(
                Arrays.toString(findWords(words)));
    }
    public static String[] findWords(String[] words) {


        ArrayList<String> list =new ArrayList<>();

        for(int i=0;i<words.length;i++){
            String a =words[i];
            boolean ab =ans(a);
            if(ab){
                list.add(words[i]);
            }
        }
        String ans[] =new String[list.size()];
        int a=0;
        for(String i:list){
            ans[a]=i;
            a++;
        }
        return ans;
    }
    public static boolean ans(String a){
        String first ="qwertyuiop"+"QWERTYUIOP";
        String second ="asdfghjkl"+"ASDFGHJKL";
        String third ="zxcvbnm"+"ZXCVBNM";

        int count=0;
        String q =a.charAt(0)+"";

        if(first.contains(q)){
            count=1;
        }
        else if(second.contains(q)){
            count=2;
        }
        else if(third.contains(q)){
            count=3;
        }


        for(int i=0;i<a.length();i++){
            q =a.charAt(i)+"";
            int counts=0;
            if(first.contains(q)){
                counts=1;
            }
            else if(second.contains(q)){
                counts=2;
            }
            else if(third.contains(q)){
                counts=3;
            }

            if(count!=counts){
                break;
            }
            if(i==a.length()-1){
                return true;
            }

        }
        return false;
    }
}
