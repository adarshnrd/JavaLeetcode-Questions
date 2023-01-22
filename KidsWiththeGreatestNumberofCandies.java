package com.company;
import java.util.*;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String args[]){
        int arr[] ={2,3,5,1,3};
        int extra =3;
        System.out.println(kidsWithCandies(arr,extra));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list =  new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++)
            if(candies[i]>max)
                max=candies[i];

        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
                list.add(true);
            else
                list.add(false);
        }
        return list;

    }
}
        /*
        ArrayList<Boolean> list =new ArrayList<>();
        int max =0;

        for(int i=0;i<candies.length;i++){

            if(max<=candies[i]+extraCandies){
                max =candies[i]+extraCandies;
                list.add(true);
            }
            else{
                list.add(false);
            }
        }

        return list;
    }
}
*/