package com.company;

public class SubtracttheProductandSumofDigitsofanInteger {
    public static void main(String[] args) {
        int a=234;
        System.out.println(subtractProductAndSum(a));
    }
    public static int subtractProductAndSum(int n) {
//        int product =multi(n);
//        int sum =sum(n);
//        return product-sum;
        int sum =0;
        int product =1;
        while (n>0){
          int ld =n%10;
          sum +=ld;
          product *=ld;
          n=n/10;
        }
        return product - sum;
    }
    static int multi(int n){
        int sum =1;
        while (n>0){
            int lastdigit =n%10;

            sum*=lastdigit;
            n=n/10;
        }
        return sum;
    }
    static int sum(int n){
        int sum=0;
        while (n>0){
            int lastdigit =n%10;
            sum+=lastdigit;
            n=n/10;
        }
        return sum;
    }

}
