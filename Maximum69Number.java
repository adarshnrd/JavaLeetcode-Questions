package com.company;

public class Maximum69Number {
    public static void main(String args[]){
        int num =6669;
        System.out.println(maximum69Number(num));
    }
    public static int maximum69Number (int num) {

            String a =num+"";
            int arr[] =new int [a.length()];

            for(int i=0;i<a.length();i++){
                arr[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
            }
            int ans =0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==6){
                    arr[i] =9;
                    break;
                }
            }
            for(int i:arr){
                ans=ans*10+i;
            }

            return ans;
        }
}
