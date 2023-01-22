package com.company;
//not done;
import java.util.*;

public class FindCommonCharacters {
    public static void main(String args[]){
        String ans[]={"bella","label","roller"};
        System.out.println(commonChars(ans));
    }
    public static List<String> commonChars(String[] words) {

        List<String> ans =new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String a =words[i];
            int ab =yes(a,words);

        }

        return ans;
    }
    public static int yes(String a,String words[]){
      int count=0;
        char[] arr1 =a.toCharArray();
      for(int i=0;i<words.length;i++){
          char[] arr2 =words[i].toCharArray();
          for(int j =0;j<arr1.length;j++){
              for(int k=0;k< arr2.length;k++){
                  if(arr1[j]==arr2[k]){
                  count++;
                  }
              }
          }

      }
      return count++;
    }
}
