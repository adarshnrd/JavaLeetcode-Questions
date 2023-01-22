package com.company;

import java.util.Arrays;

public class MaximumBagsWithFullCapacityofRocks {
    public static void main(String args[]){
    int capacity[] ={91,54,63,99,24,45,78};
    int rocks[] ={35,32,45,98,6,1,25};
    int additonalrocks =2;
    System.out.println(maximumBags(capacity,rocks,additonalrocks));
    }
    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {

        int difference[] =new int[capacity.length];
        for(int i=0;i<capacity.length;i++){
            difference[i] =capacity[i]-rocks[i];
        }
        Arrays.sort(difference);
        int count =0;
        for(int i=0;i<difference.length;i++){
            if(difference[i]==0){
                count++;
            }
            else{

                if(additionalRocks>difference[i]){
                    count++;
                    additionalRocks -=difference[i];
                }

            }
        }

   return count;
    }
}
