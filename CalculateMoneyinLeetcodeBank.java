package com.company;

public class CalculateMoneyinLeetcodeBank {
    public static void main(String args[]){
        int n =10;
        System.out.println(totalMoney(n));
    }
    public static int totalMoney(int n) {

        int totalsum =0;
        int monday =1;
        int weekcount =0;

        int count =1;
        for(int i=1;i<=n;i++){
            if(weekcount==7){
                count++;
                monday =count;
                weekcount=0;
            }
            totalsum += monday;
            monday++;
            weekcount++;
        }
        return totalsum;
    }
}
