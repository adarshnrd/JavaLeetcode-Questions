package com.company;

public class ShuffleString {
    public static void main(String args[]){
    String s ="codeleet";
    int arr[]={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,arr));
    }
    public static String restoreString(String s, int[] indices) {
        String j ="";
        char arr[] =new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[indices[i]] =s.charAt(i);
        }
        j =String.valueOf(arr);
        return j;
    }
}
