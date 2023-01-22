package com.company;
//2 solution the best solution on leet code;
public class TruncateSentence {
    public static void main(String args[]){
String s ="Hello how are you Contestant";
int k =4;
        System.out.println(truncateSentence(s,k));
    }
    public static String truncateSentence(String s, int k) {
        s =s+" ";
        String arr[]=new String[s.length()];
        int count= 0;
        int start =0;
        int arrcount =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                arr[arrcount]=s.substring(start,count);
                arrcount++;
                start =count+1;
            }
            count++;
        }
        String ab ="";

        for(int i =0;i<k;i++){
        if(i >= k-1){
            ab+=arr[i].trim();
        }
        else {
            ab += arr[i] + " ";
        }
        }
        return ab;
    }
}
