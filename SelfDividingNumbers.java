package com.company;

import java.util.*;

public class SelfDividingNumbers {
    public static void main (String args[]){
int left=10;
int right =22;
        System.out.println(selfDividingNumbers(left,right));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list =new ArrayList<>();

        for(int i=left;i<=right;i++){
            boolean a =numb(i);
            if(a){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean numb(int i){
        int j =i;
        while(i>0){
            int ld =i%10;

            if(ld!=0 && j%ld==0){

            }
            else{
                return false;
            }
            i/=10;
        }
        return true;
    }
}
