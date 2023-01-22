package com.company;
import java.util.*;

public class StringMatchinginanArray {
    public static void main(String args[]){
String words[] ={"mass","as","hero","superhero"};
System.out.println(stringMatching(words));
    }
    public static List<String> stringMatching(String[] words) {
        List<String> list =new ArrayList<>();

        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(j!=i){
                    if(words[j].contains(words[i])){
                        list.add(words[i]);
                        break;
                    }
                }
            }
        }
        return list;
    }
}
