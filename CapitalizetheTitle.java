package com.company;

public class CapitalizetheTitle {
    public static void main(String[] args) {
        String title = "i lo leetcode tHe titLe";
        System.out.println(capitalizeTitle(title));
    }

    public static String capitalizeTitle(String title) {
        title = title.toLowerCase();
        int start = 0;
        String ans = "";
        title += " ";

        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) == ' ') {
                String ab = title.substring(start, i);
                if (ab.length() > 2) {
                    ans += cap(title.substring(start, i) + " ");
                    start = i + 1;
                } else {
                    ab = ab.toLowerCase();
                    ans += ab + " ";
                    start = i + 1;
                }

            }
        }

        return ans.trim();
    }

    public static String cap(String s) {

        String a = s.charAt(0) + "";
        a = a.toUpperCase();
        String ans = a + s.substring(1, s.length());
        return ans;
    }
}