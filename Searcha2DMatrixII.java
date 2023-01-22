package com.company;

public class Searcha2DMatrixII {
    public static void main(String args[]){
    int arr[][]={{1,4,7,11,15},
            {1,4,7,11,15},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
    };
    int target =30;
    System.out.println(searchMatrix(arr,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        for(int row =0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                    if(matrix[row][col]==target){
                     return true;
                    }
            }
        }
        return false;
    }
}
