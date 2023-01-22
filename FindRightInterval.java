package com.company;
//not done
import java.util.ArrayList;
import java.util.Arrays;

public class FindRightInterval {
    public static void main(String args[]){
int arr[][] ={{1,2}};
        System.out.println(Arrays.toString(findRightInterval(arr)));
    }
    public static int[] findRightInterval(int[][] intervals) {
        ArrayList<Integer> list =new ArrayList<>();

        int a=0;
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals[i].length-1;j++){
                list.add(intervals[i][j]-intervals[i][j+1]);
            }
        }
        int arr[] =new int[list.size()];
        for(int i:list){
            arr[a] =i;
            a++;
        }
        return arr;
    }
}
