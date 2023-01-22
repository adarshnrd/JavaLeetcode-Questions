package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Find_Max_Sum_CodeNinja {
    public static void main(String[] args) {
    int[] n ={1,2};
    int[] m ={2,3};

    //System.out.println(n[1]);

        ArrayList<Integer>list =new ArrayList<>();
        for(int i =0;i<=n.length-1;i++){
        int a =n[i];
        int b =m[i];
        int c =a+b;
        list.add(c);
        }
        int max = Collections.max(list);

        System.out.println(max);

    }
}
