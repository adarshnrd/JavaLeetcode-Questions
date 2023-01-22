package com.company;
//not done
public class MinimumPathSum {
    public static void main(String args[]){
        int grid[][] ={{10,3,9},{1,5,11},{4,2,1}
        };
        System.out.println(minPathSum(grid));
    }
    public static int minPathSum(int[][] grid) {
        int sum =0;
        int second;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(i==0){
                    sum +=grid[i][j];
                }
                else{
                    sum+=grid[i][grid[j].length-1];
                    break;
                }
            }
        }
        int secondsum =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(i== grid.length-1){
                    secondsum +=grid[i][j];
                }
                else{
                    secondsum+=grid[i][j];
                    break;
                }
            }
        }

        return Math.min(sum,secondsum);
    }
}
