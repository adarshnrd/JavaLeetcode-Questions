package com.company;

public class CheckiftheSentenceIsPangram {
    public static void main(String args[]) {
    String sentence = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyq" +
            "ujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String str) {
        boolean flag=false;
        for(char c='a';c<='z';c++){
        flag =check(c,str);
        if(flag==true){
            return true;
        }
            }
        return false;
        }
public static boolean check(char ch,String str){
        for(char c: str.toCharArray()){
            if(c == ch){
                return true;
            }
        }
        return false;
}
    }



















/*
    public boolean checkIfPangram(String str) {
        boolean flag= false;
        for(char ch='a';ch<='z';ch++){
            boolean pangram =check_pan(ch,str);
            if(pangram==false){
                flag =false;
                break;
            }
            else
                flag=true;
        }
return flag;
    }
    public boolean check_pan(char ch,String str){
            for(char c: str.toCharArray()){
                if(c ==ch)
                    return true;
            }
        return false;
    }
    }

*/