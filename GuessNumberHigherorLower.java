package com.company;

public class GuessNumberHigherorLower {
    public static void main(String args[]){
        int n =100;
        System.out.println(guessNumber(n));
    }
    public static int guessNumber(int n) {

        int start =1;
        int end =n;

        while(true){
            int mid =start+(end-start)/2;
            int a =guess(mid);
            if(a==(-1)){
                end=mid-1;
            }
            else if(a==1){
                start =mid+1;
            }
            else{
                return mid;
            }
        }
    }

    private static int guess(int mid) {
        int n =100;
        if(mid>n){
            return -1;
        }
        if(mid<n){
            return 1;
        }
        else {
            return 0;
        }

    }
}
