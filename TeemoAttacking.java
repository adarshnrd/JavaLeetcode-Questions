package com.company;
//done but tle.
import java.util.HashSet;

public class TeemoAttacking {
    public static void main(String args[]){
        int ts[] ={1,4,7};
        int duration =2;
        System.out.println(findPoisonedDuration(ts,duration));
    }
    public static int findPoisonedDuration(int[] ts, int duration) {
        HashSet<Integer> hs =new HashSet<>();

        for(int i=0;i<ts.length;i++){

            for(int j=0;j<duration;j++){
                int num =ts[i];
                int a =0;
                hs.add(num+a);
                a++;
            }

        }
        return hs.size();
    }
}
