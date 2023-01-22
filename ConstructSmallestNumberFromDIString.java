package com.company;

import java.util.ArrayList;

public class ConstructSmallestNumberFromDIString {
    public static void main(String args[]){
        String a ="IIIDIDDD";
        System.out.println(smallestNumber(a));
    }
        public static String smallestNumber(String pattern) {

            int I =0;
         int D =0;

         for(int i=0;i<pattern.length();i++){

             if(pattern.charAt(i)=='I'){
                 I++;
             }
             else {
                 D++;
             }
         }
            ArrayList<Integer> list =new ArrayList<>();

            for(int i=1;i<=9;i++){
                list.add(i);
            }


return "";
        }
}
