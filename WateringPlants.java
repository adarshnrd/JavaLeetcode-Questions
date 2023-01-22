package com.company;

public class WateringPlants {
    public static void main(String args[]){
    int []plants={2,2,3,3};
    int capacity =5;
        System.out.println(wateringPlants(plants,capacity));
    }
    public static int wateringPlants(int[] plants, int capacity) {
        int steps =0;
        int capren =capacity;
        for(int i=0;i<plants.length;i++){
            if(capacity<plants[i]){
                int a = (i)*2;
                steps+=a;
                capacity =capren;
            }
                capacity -= plants[i];
                steps++;
        }
        return steps;
    }
}
