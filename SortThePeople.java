package com.company;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class SortThePeople {
    public static void main(String  args[]){

    }
    public String[] sortPeople(String[] names, int[] heights) {

        TreeMap<Integer,String> tmap = new TreeMap<>();
        //treemap implement sortedMap so its sort the map in ascending order.

        for(int i=0;i<names.length;i++){
            //put both names array and height array int map .
            //key as height array
            //value as names array
            tmap.put(heights[i],names[i]);
        }

        //create new array to Store the value from hashmap.
        String ans[] =new String [names.length];
        int a=0; // for using indexing
        for(Map.Entry e: tmap.entrySet()){
            ans[a] =(String) e.getValue(); // only to get value from the map.
            a++;
        }
        int i =0;
        int end =ans.length-1;
        while( i<end){
            swap(ans,i,end);
            i++;
            end--;
        }
        return ans;
    }
    public void swap(String []arr, int i1,int i2){
        String  temp =arr[i1];
        arr[i1] =arr[i2];
        arr[i2] =temp;
    }
}

