package com.company;

import javax.management.StringValueExp;

public class StringtoIntegerAtoi {
    public static void main(String args[]){
        String s ="4193 with words";
        System.out.println(myAtoi(s));

    }
    public static int myAtoi(String s) {
       s =s.trim();
       int len =s.length();
        int a =0;
        String ans ="";
        StringBuilder n =new  StringBuilder();
        for(int i =0;i<len;i++){
     //   ans =s.matches(String.valueOf("\\d*".charAt(i)));
        ans =String.valueOf(s.charAt(i));
        if(ans.matches("[0-9]")){
            n.append( String.valueOf(ans.charAt(i)));
        }
        }
        a =Integer.parseInt(ans);
return a;
    }
}
