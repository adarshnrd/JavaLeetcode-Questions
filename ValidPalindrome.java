package com.company;

public class ValidPalindrome {
    public static void main(String args[]){
        String a ="A man, a plan, a canal: Panama";
        //String a ="0P";
        System.out.println(isPalindrome(a));
    }
    public static boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        String b ="";
        for(int i =0;i<a.length();i++){
            if(a.charAt(i)==' '){

            }

            else if((a.charAt(i)>='a'&& a.charAt(i)<='z') || (a.charAt(i)>='0'&& a.charAt(i)<='9')){
                b+=a.charAt(i);
            }
        }
        String c =reverse(b);
        if(b.equals(c)){
            return true;
        }

        return false;

    }
    public static String reverse(String a){
        String abs ="";

        for(int i=a.length()-1;i>=0;i--){
            abs+=a.charAt(i);
        }


        return abs;
    }
}
