package com.company;

import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String args[]){
String s ="tttree";
System.out.println(frequencySort(s));
    }
    public static  String frequencySort(String s) {
        HashMap<String,Integer> hm =new HashMap<>();

       while (s.length()>0) {
           int a = freq(s, s.charAt(0) + "");
           hm.put(s.charAt(0) + "", a);
           s = rem(s, s.charAt(0) + "");
       }
        String ans ="";
        List<Map.Entry<String,Integer>>list =new ArrayList<>(hm.entrySet());
       Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
           @Override
           public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               return o1.getValue()-o2.getValue();
           }
       });
        for(int i=list.size()-1;i>=0;i--){
            int a = list.get(i).getValue();
            String ab =list.get(i).getKey();
            while (a>0){
                ans+=ab;
                a--;
            }
        }


        return ans;
    }
    public static int freq(String s,String ch){
        int count=0;
        for(int i=0;i<s.length();i++){
            String af =s.charAt(i)+"";
            if(af.equals(ch)){
                count++;
            }
        }
return count;
    }
    public static String rem(String s,String ch ){
        s =s.replace(ch,"");
        return s;
    }
}
