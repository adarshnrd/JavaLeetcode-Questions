package com.company;

public class MaximumNumberofWordsFoundinSentences {
    public static void main(String []args){
String []sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
    public static  int mostWordsFound(String[] sentences) {
        int count =1;
        int ans =0;
        for (String value : sentences) {
            for (int j = 0; j < value.length(); j++) {
                if (value.charAt(j) == ' ') {
                    count++;
                }
            }
            if (count > ans) {
                ans = count;
            }
            count = 1;
        }


return ans;
    }
}
