package com.company;

public class LengthofLastWord {
    public static void main(String[] args) {
        String ans =
                "   fly me   to   the moon  ";
        int a = ans.length() - 1;
        System.out.println(lengthOfLastWord(ans));
    }
    public static int lengthOfLastWord(String s) {

        int add =0;
       String S =s.trim();
        for(int i =S.length()-1;i>=0;i--){
            if(S.charAt(i)==' '){
                break;
            }
            else{
                add++;
            }

        }
        return add;
    }
}