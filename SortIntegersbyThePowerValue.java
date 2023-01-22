package com.company;
import java.util.*;

public class SortIntegersbyThePowerValue {
    public static void main(String args[]){
        int lo =144;
        int hi =163;
        int k =5;
        System.out.println(getKth(lo,hi,k));
    }
    public static int getKth(int lo, int hi, int k) {
        LinkedHashMap<Integer,Integer>hm =new LinkedHashMap<>();
        for(int i =lo ;i<=hi;i++){
            int a= i;

            int count =0;
            while(a!=1){
                if(a%2==0){
                    a =a/2;
                    count++;
                }
                else{
                    a = (3*a)+1;
                    count++;
                }
            }
            hm.put(i,count);
      }
         List<Map.Entry<Integer,Integer>>list =new ArrayList<>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });

        int aeb =list.get(k-1).getKey();
        return aeb;
    }
}
