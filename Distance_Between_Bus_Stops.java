package com.company;

public class Distance_Between_Bus_Stops {
    public static void main(String args[]){
int []distance ={14,13,4,7,10,17,8,3,2,13};
int start =9;
int destination =2;
System.out.println(distanceBetweenBusStops(distance,start,destination));
    }
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int ans =0;
        int sum =0;
        int second =0;
        if(start>destination){

            for(int i=start-1;i>=destination;i--){
                sum+=distance[i];
            }

            int index =start;
            while (index!=destination){
                if(index==distance.length){
                    index =0;
                }
                second+=distance[index];
                index++;
                if(index==distance.length){
                    index =0;
                }
            }
           ans =Math.min(sum,second);
        }
        else{
            for(int i=start;i<destination;i++){
                sum+=distance[i];
            }
            int index =destination;
            while (index!=start){
                if(index==distance.length){
                    index =0;
                }
                second+=distance[index];
                index++;
                if(index==distance.length){
                    index =0;
                }
            }
            ans =Math.min(sum,second);
        }

        return ans ;
    }
}
/*
int mstart =0;
        int sum =0;
        if(start>destination){

            for(int i=mstart;i<destination;i++){
                sum+=distance[i];
            }

        }
        else{

            for(int i=start;i<destination;i++){
                sum+=distance[i];
            }
        }

        int second =0;

        if(start>destination){
            for(int i=start;i>=0;i--){
                second +=distance[i];
            }
        }
        else{
            for(int i=distance.length-1;i>=destination;i--){
                second+=distance[i];
            }
        }

        int ans =Math.min(sum,second);
        return ans;
 */
