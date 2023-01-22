package com.company;

public class ReverseVowelsofaString {
    public static void main(String args[]){
        String s ="leetcode";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        String vol = "aeiouAEIOU";
        int start = 0;
        int end = s.length() - 1;

        char arr[] = s.toCharArray();

        while (start<=end){
            String a =arr[start]+"";
            if(vol.contains(a)){
                int lastindex =last(arr,vol,end);
                if(lastindex==-1){
                    break;
                }
                swap(arr,start,lastindex);
                end=lastindex-1;
            }
            start++;
        }
        String ans = "";
        for(char i:arr){
            ans+=i;
        }
        return ans;
    }
    public static void swap(char arry[],int s,int e){
        char temp =arry[s];
        arry[s] =arry[e];
        arry[e] = temp;
    }
    public static int last(char arr[],String vol,int end){
        int inde =-1;

        for(int i=end;i>=0;i--){
            String a =arr[i]+"";
            if(vol.contains(a)){
                return i;
            }
        }
        return inde;
    }
}
        /*
        while (start<=end){
            if(vol.contains(s.charAt(start)+"")){
                int lindex =index(s,end,vol);
                if(lindex==-1){
                    return s;
                }
                String ls = String.valueOf(s.charAt(lindex));
                s =swap(s,lindex,start);
                end =lindex-1;
            }
            start++;
        }
return s;
    }
    public static int index (String s,int end,String vol){
        for(int i=end;i>=0;i--){
            if(vol.contains(s.charAt(i)+"")){
                return i;
            }

        }
        return -1;
    }
    public static String swap(String s,int lindex,int start){
        String a =s.charAt(start)+"";//start e
        String b =s.charAt(lindex)+"";//last 0
        String as =s;
//helle hello
         for(int i=start;i<lindex;i++){
             if((s.charAt(i)+"").equals(a)){
                 as =s.replace(a,b);
                 break;
             }
         }
         for(int i=lindex;i>=0;i--){
           if((s.charAt(i)+"").equals(b))  {
               as =as.replace(b,a);
           }
         }

         return as;
    }
}*/