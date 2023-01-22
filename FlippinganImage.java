package com.company;

import java.util.Arrays;

public class FlippinganImage {
    public static void main(String args[]){
    //int []arr[] ={{1,1,0},{1,0,1},{0,0,0}};
    int []arr[] ={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        flipAndInvertImage(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }

    public static int[][] flipAndInvertImage(int[][] image) {

      for(int i=0;i<image.length;i++){
              reverse(image[i]);

      }

        for(int i=0;i<image.length;i++){
            for(int j =0;j<image[i].length;j++){
                if(image[i][j]==1){
                    image[i][j]=0;
                }
                else {
                    image[i][j]=1;
                }
            }
        }

return image;
    }

    static void reverse(int []arr){
        int s =0;
        int e =arr.length-1;
        while(s<e){
        int temp =arr[s];
        arr[s] =arr[e];
        arr[e] =temp;
        s++;
        e--;
        }
    }
}
