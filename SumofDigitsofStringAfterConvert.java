package com.company;

public class SumofDigitsofStringAfterConvert {
    public static void main(String args[]){
String s ="iiii";
int k =1;
        System.out.println(getLucky(s,k));
    }
    public  static int getLucky(String s, int k) {
        String alpha ="1abcdefghijklmnopqrstuvwxyz";
       String number ="";
        for(int i=0;i<s.length();i++){
            int a = alpha.indexOf(s.charAt(i));
           number+=a;
        }

        while (k-->0){
                    number = getnumber(number);
        }
    int ans =Integer.parseInt(number);
        return ans;
    }
    public  static String getnumber(String num) {
        int ans = 0;
        for(int i=0;i<num.length();i++){
            ans+=num.charAt(i)-'0';
        }

        return String.valueOf(ans);
    }
}
