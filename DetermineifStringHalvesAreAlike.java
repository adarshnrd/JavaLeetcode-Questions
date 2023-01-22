package com.company;

import java.util.ArrayList;

public class DetermineifStringHalvesAreAlike {
public static void main(String args[]){
String s ="AbCdfGh";
    System.out.println(halvesAreAlike(s));
}
    public static boolean halvesAreAlike(String s) {

        String alpha ="aAeEiIoOuU";
        int half =s.length()/2;
        int counta =0;
        int countb =0;
        half =half-1;
        for(int i=0;i<s.length();i++){
            String ab =s.charAt(i)+"";
            if(alpha.contains(ab)&&i<=half){
                counta++;
            }
            if(alpha.contains(ab) && i>half){
                countb++;
            }
        }
        return counta==countb;
//
//        int count =0;
//        String astr ="";
//
//        for(int i=0;i<half;i++){
//            String e =s.charAt(i)+"";
//            if(alpha.contains(e)){
//                astr+=e+"";
//                count++;
//            }
//        }
//        String bstr ="";
//        int bcount =0;
//        for(int i=half;i<s.length();i++){
//            String e =s.charAt(i)+"";
//            if(alpha.contains(e)){
//                bstr+=e+"";
//                bcount++;
//            }
//        }
//        int truecount =0;
//    if(count!=bcount){
//    return false;
//    }else {
//        return true;
//    }
    }
}
