package com.company;

import java.util.Arrays;

public class ShortestDistanceToaCharacter {
    public static void main(String args[]){
        String s ="loveleetcode";
        char c ='e';
        System.out.println(Arrays.toString(shortestToChar(s,c)));
    }
    public static int[] shortestToChar(String s, char c) {
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=minnumber(s,c,i);

        }
        return arr;
    }
    public static int minnumber(String s,char c,int i) {
    int firstindex =s.indexOf(c+"");
    int secondindex =0;

    int start =i;
    if(i<=firstindex){
        int a =Math.abs(i-firstindex);
        return a;
    }else{
        firstindex =s.indexOf(c+"",i);
        while (true){
            if(s.charAt(start)==c){
                secondindex =start;
                break;
            }
            start--;
        }
        int a =Math.abs(i-firstindex);
        int sec =Math.abs(i-secondindex);
        if(a>sec){
            return sec;
        }
        else{
            return a;
        }
    }
    }
}


        /*
        String C =c+"";
        int firstindex =s.indexOf(C);

        int a =0;
        int start=i;
        int sec =0;

        if(i<=firstindex){
            a =Math.abs(i-firstindex);
            return a;
        }
        else{
            while(true){
                if(s.charAt(start)==c){
                    sec =start;
                    break;
                }
                start--;
            }
            int ab =s.indexOf(C,i);
            a =Math.abs(i-ab);
            sec =Math.abs(start-i);
            if(a>sec){
                return a;
            }
            else{
                return sec;
            }
        }

    }
}
*/