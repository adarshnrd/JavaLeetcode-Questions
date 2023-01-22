package com.company;

public class FirstUniqueCharacterinaString {
    public static void main(String args[]) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        boolean a =false;
        for(int i=0;i<s.length();i++){
            a = findindex(i,s.charAt(i)+"",s);
            if(a){
                return i;
            }
        }
return -1;
    }
public static boolean findindex(int i,String a,String s){
int index =0;
int secondindex =-1;
index = s.indexOf(a,0);
secondindex =s.indexOf(a,index+1);
if(secondindex==-1){
    return true;
}
return false;
    }
}