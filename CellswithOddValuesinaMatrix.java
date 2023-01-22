package com.company;
//not done yet

public class CellswithOddValuesinaMatrix {
    public static void main(String args[]){
        int m =2;
        int n =3;
        int arr[][] ={{0,1},{1,1}};
        System.out.println(oddCells(m,n,arr));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int odd= 0;
        int arr[][] =new int [m][n];
        for(int i=0;i<indices[i].length;i++){
            for(int j =0;j<indices[i].length;j++){
                arr[i][j] +=indices[i][j];
            }
        }
//        for(int i =0;i<m;i++){
//           arr[i]=arr[i];
//        }
        return odd;
    }
}
