package com.company;

import java.util.ArrayList;

//not done;
public class ReverseWordsinaString {
    public static void main(String args[]){
        String s ="a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
    s+=" ";
    ArrayList<String>list =new ArrayList<>();
    int start =0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
            list.add(s.substring(start,i));
            start =i+1;
        }
    }
    String ans = "";
    for(int i=list.size()-1;i>=0;i--){
        if(list.get(i)==""){

        }
        else {
        ans+=list.get(i)+" ";
    }
    }

return ans.trim();
    }
}
        /*
        ArrayList<String> list =new ArrayList<>();
        s+=" ";

        int index =0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                list.add(s.substring(index,i));
                index =i+1;
            }
        }
        String ans ="";
        for(int i =list.size()-1;i>=0;i--){
            if(list.get(i)==""){

            }else {
                ans += list.get(i) + " ";
            }
            }
        return ans;
    }
}

        /*
        String arr [] =new String[count];
        int start =0;
        int end =s.indexOf(" ");


        for(int i =0;i<arr.length;i++){
        //012345678912345
        //the sky is blue

            arr[i] =s.substring(start,end);
            start +=end-start+1;
            end =s.indexOf(" ",start);
            if(end==-1){
                end =s.length();
            }
        }
        int a =0;
        int b =arr.length-1;

    while (a<b){
    String temp = arr[a];
    arr[a] =arr[b];
    arr[b] =temp;
    a++;
    b--;
    }

    String ab ="";
    for(int i=0;i<arr.length;i++){
        ab +=arr[i]+" ";
    }

  return ab.trim();
    }

}
*/