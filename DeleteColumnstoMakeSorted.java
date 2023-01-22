package com.company;

public class DeleteColumnstoMakeSorted {
    public static void main(String args[]){
        String arr[]={"rrjk","furt","guzm"};
        System.out.println(minDeletionSize(arr));
    }
    public static int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0;i<strs[0].length();i++){
            boolean a = delete(strs,i);
            if(!a){
                count++;
            }
        }
        return count;
    }
    public static boolean delete(String []strs,int index){

        for(int i=0;i<strs.length-1;i++){
            if(strs[i].charAt(index)<=strs[i+1].charAt(index)){

            }else{
                return false;
            }
        }
        return true;
    }
}
