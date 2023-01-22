package com.company;

public class MultiplyStrings {
    public static void main(String args[]){
    String a ="123";
    String b ="456";
        System.out.println(multiply(a,b));
    }
    public static String multiply(String num1, String num2) {
        Integer a = Integer.parseInt(num1);
        Integer b =Integer.parseInt(num2);
        String c =""+a*b;
        return c;
    }
}
/* main code
import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
    BigInteger q,w;
        q =new BigInteger(num1);
        w =new BigInteger(num2);
        return q.multiply(w).toString();
    }
}
*/
