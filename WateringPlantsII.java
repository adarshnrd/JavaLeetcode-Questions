package com.company;
///done dona done
public class WateringPlantsII {
    public static void main(String args[]){
        int arr[] ={726,739,934,116,643,648,473,984,482,85,850,806,146,764,156,66,186,339,985,237,662,552,800,78,617,933,481,652,796,594,151,82,183,241,525,221,951,732,799,483,368,354,776,175,974,187,913,842};
        int capA =1439;
        int capB =1207;
        System.out.println(minimumRefill(arr,capA,capB));

    }
    public static int minimumRefill(int[] arr, int capacityA, int capacityB) {

        int alice =capacityA;
        int bob =capacityB;

        int start=0;
        int end =arr.length-1;
        int refil =0;

        while(start<=end){
            if(start==end){
                if(arr[start]>alice && arr[end]>bob){
                    refil++;
                }
                break;
            }
            if(arr[start]>alice){
                refil++;
                alice =capacityA;
            }
                alice-=arr[start];
                start++;
            if(arr[end]>bob){
                refil++;
                bob=capacityB;
            }
            bob -=arr[end];
            end--;
        }
        return refil;
    }
}
