package com.company;

public class CheckifWordEqualsSummationofTwoWords {
    public static void main(String args[]){
//        int ab =(int)'a'-97;
//        int b = (int)'b'-97;
//        System.out.println(ab);
 String firstword ="acb";
 String secondword= "cba";
 String thirdword ="cdb";
        System.out.println(isSumEqual(firstword,secondword,thirdword));
    }
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        int sumw =0;

        for(int i=0;i<firstWord.length();i++){
            int z =(int)firstWord.charAt(i)-97;

                sumw =sumw*10+z;

        }
        int sumsec =0;
        for(int i=0;i<secondWord.length();i++){
            int z =(int)secondWord.charAt(i)-97;

                sumsec =sumsec*10+z;

        }
        int sumtar=0;
        for(int i=0;i<targetWord.length();i++){
            int z =(int)targetWord.charAt(i)-97;

                sumtar =sumtar*10+z;

        }

        if(sumw+sumsec==sumtar){
            return true;
        }
        return false;

    }
}
