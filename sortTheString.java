package com.company;

import java.util.Scanner;

public class sortTheString {
    public static void main (String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int test =sc.nextInt();

        while(test-->0){
            int j =sc.nextInt();
            String name =sc.next();

            int c =0;
            for(int i=0;i<j-1;i++){
                if(name.charAt(i)=='1' && name.charAt(i+1)=='0'){
                    c++;
                }
                System.out.println(c);
            }

        }

    }
}
