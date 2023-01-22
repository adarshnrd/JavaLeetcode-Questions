package com.company;
import java.util.ArrayList;


public class KthDistinctStringinanArray {
    public static void main(String args[]) {
        String arr[] = {"aaa","aa","a"};
        int k = 1;
        System.out.println(kthDistinct(arr, k));
    }

    public static String kthDistinct(String[] arr, int k) {

        ArrayList<String>list =new ArrayList<>();
        for(int i=0;i<arr.length;i++){
        int count =count(arr,arr[i]);
        if(count<=1){
            list.add(arr[i]);
        }
        }
        if(k>list.size()){
            return "";
        }
        return list.get(k-1);
}
public static int count(String []arr,String a){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(a.equals(arr[i])){
                count++;
            }
        }
        return count;
}
}
//        ArrayList<String> list =new ArrayList<>();
//        String lastele = arr[arr.length-1];
//        boolean ab =true;
//        for(int i=0;i<arr.length;i++){
//            boolean a =containe(arr,i,arr[i]);
//            if(a){
//                list.add(arr[i]);
//            }
//            if(arr[i].equals(lastele)&& i<arr.length-1){
//                ab =false;
//            }
//            if(i==arr.length-1){
//                if(ab){
//                    list.add(lastele);
//                }
//            }
//
//        }
//        if(k>list.size()){
//            return "";
//        }
//        return list.get(k-1);
//    }
//    public static boolean containe(String [] arr,int i,String q){
//
//        for(int  j=i+1;j<arr.length;j++){
//            if(arr[j].equals(q)){
//                return false;
//            }
//        }
//        return true;
//    }
//}
