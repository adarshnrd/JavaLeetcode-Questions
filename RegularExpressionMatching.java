package com.company;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        String s ="ab";
        String o =".*";
        System.out.println(isMatch(s,o));
    }
    public static boolean isMatch(String s, String p) {

        boolean a =s.matches(p);

        return a;
    }
}
