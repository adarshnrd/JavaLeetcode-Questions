package com.company;

import java.util.ArrayList;

public class CheckifNumbersAreAscendinginaSentence {
    public static void main(String args[]){
String a ="hello world 5 x 5";
        System.out.println(areNumbersAscending(a));
    }
    public static boolean areNumbersAscending(String s) {
        // 48 - 57
        ArrayList<String> list =new ArrayList<>();

        s+=" ";
        int start= 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== ' '){
                list.add(s.substring(start,i));
                start =i+1;
            }
        }
        ArrayList<Integer> al =new ArrayList<>();
        for(int i=0;i<list.size();i++){
            String a =list.get(i);
            if(a.charAt(0)>=48&& a.charAt(0)<=57){
                al.add(Integer.parseInt(String.valueOf(list.get(i))));
            }
            else {}
        }

        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)<al.get(i+1)){

            }
            else{
                return false;
            }
        }
        return true;
    }
}
