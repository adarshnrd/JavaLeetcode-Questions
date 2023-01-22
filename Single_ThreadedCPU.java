package com.company;
import java.util.*;
//not done

public class Single_ThreadedCPU {
    public static void main(String args[]){
int row[][] ={{1,2},
        {2,4},
        {3,2},
        {4,1}};
        System.out.println(Arrays.toString(getOrder(row)));
    }
    public static int[] getOrder(int[][] tasks) {

        LinkedHashMap<Integer,Integer> hm =new LinkedHashMap<>();

        for(int i=0;i<tasks.length;i++){
            hm.put(i,tasks[i][1]);
        }
        List<Map.Entry<Integer,Integer>>list =new ArrayList<>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });

    int ans[] =new int[tasks.length];
    int a= 0;

    for(Map.Entry<Integer, Integer> i:list){
        ans[a]=i.getKey();
        a++;
    }
    return ans;
    }
}
