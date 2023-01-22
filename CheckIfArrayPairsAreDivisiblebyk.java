package com.company;
//not completely successful
public class CheckIfArrayPairsAreDivisiblebyk {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6};
        int target = 10;
        System.out.println(canArrange(arr, target));

    }
    public static boolean canArrange(int[] arr, int k) {
        for(int i=0;i<=arr.length/2;i++){
            int f =arr[i];
            int l =arr[arr.length-1-i];
            int sum =f+l;

            if((sum%k)==0){
                return true;
            }

            for(int j=1;j<arr.length-1;j++){
                if(((arr[i]+arr[j])%k)==0){
                    return true;
                }
                if(((arr[i]+arr[j+1])%k)==0){
                    return true;
                }
            }

        }

        return false;
    }
}

    /*
    public static boolean canArrange(int[] arr, int k) {

        for(int i=0;i<=arr.length/2;i++){
            int f =arr[i];
            int j =arr[arr.length-1-i];
            int sum =f+j;

            if((sum%k)==0){
                return true;
            }

        }

        return false;
    }
}
*/