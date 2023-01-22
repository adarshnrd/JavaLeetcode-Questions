package com.company;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddtoArrayFormofInteger {
    public static void main(String args[]){
        int nums[]={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k =516;
        System.out.println(addToArrayForm(nums,k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list =new ArrayList<>();

        String a ="";
        for(int i=0;i<num.length;i++){
            a =a+num[i]+"";
        }
        BigInteger c,d ,e;
       c =new BigInteger(a);
       d =new BigInteger(String.valueOf(k));
       e =c.add(d);

        a =e+"";
        for(int i =0;i<a.length();i++){
            list.add(Integer.parseInt(String.valueOf(a.charAt(i))));
        }
        return list;
    }
}
        /*
        long b =number(num);
        long c =b+k;
        ArrayList<Integer> list =new ArrayList<>();

        while (c>0){
            long ld = c%10;
            list.add((int) ld);
            c/=10;
        }
    Collections.reverse(list);
        return list;
    }

    public static long number(int []num){

        long a =0;

        for(int i=0;i<num.length;i++){
            long b =num[i];
            a =a*10+b;
        }
        return a;
    }
}*/