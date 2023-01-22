package com.company;
//not done have to do.
import java.util.ArrayList;

public class CalculateDigitSumofaString {
    public static void main(String args[]){
    String a ="1234";
    int k =2;
    System.out.println(digitSum(a,k));

    }
    public static String digitSum(String s, int k) {
        String ab ="";
        int a =0;
        int count =0;
        while (k<s.length()){
            for(int i=0;i<s.length();i++){
               a += s.charAt(i)-'0';
               count++;
               if(count==k){
                   ab+=a+"";
                   a=0;
                   count=0;
               }
               if(s.length()-1==i&& count!=0){
                   ab+=a+"";
                   a=0;
                   count =0;
               }
            }
            s =ab;
            ab="";
        }

return s;
    }
}
        //        ArrayList<String> list =new ArrayList<>();
//        String ab ="";
//        for(int i=0;i<s.length();i++){
//            ab +=s.charAt(i);
//            if(ab.length()==3){
//                list.add(ab);
//                ab ="";
//            }
//            if(i==s.length()-1){
//                list.add(ab);
//            }
//
//        }
//        int a =sum(list.get(0));
//return "";
//    }
//    public static int  sum(String ab){
//        int sum =0;
//        for(int i=0;i<ab.length();i++){
//            sum+=ab.charAt(i)-'0';
//        }
//
//return sum;
//    }
//}
