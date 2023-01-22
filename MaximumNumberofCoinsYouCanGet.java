package com.company;

import java.util.Arrays;

public class MaximumNumberofCoinsYouCanGet {
    public static void main(String args[]){
int piles[]={9,8,7,6,5,1,2,3,4};
        System.out.println(maxCoins(piles));
    }
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans = 0;
        int alice =0;
        int me=0;
        int bob =0;
        int start=0;

        int end =piles.length/3;
        for(int i=piles.length-1;i>=end;i--){
            alice +=piles[i];
            i--;
            me +=piles[i];


            bob+=piles[start];
            start++;
        }

        return me;
    }
    }

