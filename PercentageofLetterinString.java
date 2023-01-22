package com.company;

public class PercentageofLetterinString {
    public static void main(String args[]){
String s ="foobar";
char letter ='o';
        System.out.println(percentageLetter(s,letter));
    }
    public static int percentageLetter(String s, char letter) {

        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== letter){
                count++;
            }
        }
        int a =count*100/s.length();
        return a;
    }
}
