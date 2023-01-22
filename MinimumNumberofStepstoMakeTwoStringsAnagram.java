package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class MinimumNumberofStepstoMakeTwoStringsAnagram {
    public static void main(String args[]) {
        String s = "bab";
        String t = "aba";
        System.out.println(minSteps(s, t));
    }

    public static int minSteps(String s, String t) {

        int count =0;
        ArrayList<Character> ls =new ArrayList<>();

        for(int i=0;i<t.length();i++)
        {
            ls.add(t.charAt(i));
        }
        int start =0;
        int end =s.length()-1;

        while (start<end){
            char a =s.charAt(start);
            char b =s.charAt(end);
            if(ls.contains(a)){
                ls.remove(ls.indexOf(a));
            }
            if(ls.contains(b)){
                ls.remove(ls.indexOf(b));
                end--;
            }
            start++;

        }


        return ls.size();

    }
}

        /*

        int count =0;
        ArrayList<Character> ls =new ArrayList<>();

        for(int i=0;i<t.length();i++)
        {
        ls.add(t.charAt(i));
        }
        int start =0;
        int end =s.length()-1;

        while (start<=end ){
    char a =s.charAt(start);
    char b =s.charAt(end);
    if(ls.contains(a)){
        ls.remove(ls.indexOf(a));

    }
    if(ls.contains(b)){
        ls.remove(ls.indexOf(b));

    }
    start++;
    end--;
        }

//        for(int i=0;i<s.length();i++){
//            char a =s.charAt(i);
//            if(ls.contains(a)){
//                ls.remove(ls.indexOf(a));
//            }else{
//                count++;
//            }
//        }
return ls.size();
    }
}*/