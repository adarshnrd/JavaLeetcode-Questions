package com.company;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int accounts[][]={{1,2,3},{3,2,1},{1,5,5}};
//            for(int[] i:accounts){
//                System.out.println(Arrays.toString(i));
//            }
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {

        int max =0;
        for(int person =0;person<accounts.length;person++){
            int sum =0;
            for(int bank =0;bank<accounts[person].length;bank++){
                sum =sum+ accounts[person][bank];
            }
            if(sum>max){
                max =sum;
            }
        }
return max;
    }
}
