package com.company;
import java.util.*;

public class TheKWeakestRowsinaMatrix {
    public static void main(String args[]) {
        int arr[][] = {{1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int k = 3;

        System.out.println(Arrays.toString(kWeakestRows(arr, k)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {

        int arr[] = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            arr[i] = sum;
        }
        int ans[] = new int[k];

        int a = 0;
        while (k-- > 0) {
            int min = Integer.MAX_VALUE;
            int minindex = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minindex = i;
                }
            }
            arr[minindex] = Integer.MAX_VALUE;
            ans[a] = minindex;
            a++;
        }
        return ans;
    }
}
        /*
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(i,arr[i]);
        }
        List<Map.Entry<Integer,Integer>> list =new ArrayList<>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });

        int ans[]=new int[k];
        int a=0;
        for(int i=0;i<k;i++){
            ans[i] =list.get(i).getKey();
        }
        return ans;
    }
}
*/