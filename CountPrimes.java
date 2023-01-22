package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class CountPrimes {
    public static void main(String args[]) {
        int n = 100;
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        int countPrime = 0;
        boolean isPrime[] = sieveOfEratosthenes(n);
        for (int i = 2; i < n; i++) {
            if (isPrime[i] == true) {
                countPrime++;
            }
        }
        return countPrime;
    }

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }
}
        /*   int counter =0;
        int count =0;
        for(int j=2;j<=n;j++){
            counter=0;
            for(int i=1;i<=j;i++){
                if(j%i==0){
                    counter++;
                }
            }
            if(counter==2)
                count++;
        }
        return count;
    }
}
    /*
    TATII SOLUTION

    public static int countPrimes(int n) {
        int a =2;
        int b=3;
        int c =5;
        int d =7;

        if(n<=2){
            return 0;
        }
        if(n<=3){
            return 1;
        }
        if(n<=5){
            return 2;
        }
        if(n<=7){
            return 3;
        }

        int count= 0;
        for(int i=9;i<n;i++){
            if(i%a!=0 && i%b!=0 && i%c!=0 && i%d!=0){
                count++;
            }
        }
        return count+4;
    }
}*/

