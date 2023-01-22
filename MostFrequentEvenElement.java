package com.company;
//not done
import java.util.Arrays;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int nums[] ={29,47,21,41,13,37,25,7};
        System.out.println(mostFrequentEven(nums));
    }
    public static int mostFrequentEven(int[] nums) {

        int count =1;
        int max =-1;
        int lastcount =0;
        if(nums.length<2 && nums[0]%2==0){
            return nums[0];
        }else if(nums.length<2 && nums[0]%2!=0){
            return -1;
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1] && nums[i]%2==0){
                count++;
            }
            else {
                count=1;
            }
            if((lastcount<count && nums[i]%2==0 ) &&( max<=nums[i])){
                max =nums[i];
                lastcount =count;
            }
        }
        if(lastcount ==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]%2==0 && nums[i]<max){
                    max =nums[i];
                }
            }

        }

        if(lastcount ==1 && max ==-1){
            return -1;
        }
        return max;


    }
}
       /* int count =1;
        int max =-1;
        int lastcount =0;
        if(nums.length<2){
            return nums[0];
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1] && nums[i]%2==0){
                count++;
            }
            else {
                count=1;
            }
            if((lastcount<count && count>1) &&( max<=nums[i])){
                max =nums[i];
                lastcount =count;
            }
        }

        if(max==-1 ){
            return -1;
        }
        return max;

    }
}
        /*
        int count=0;
        int maxcount=0;
        int index =0;
        int countm =0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1] && nums[i]%2==0){
                count++;
                countm++;
            }

            if(count>maxcount){
             maxcount =count;
             index =nums[i];
            }
            if(nums[i]!=nums[i+1]){
                count=0;
            }
        }
        int b =Integer.MAX_VALUE;
        if(countm==0){
            count =0;
            for(int i=0;i<nums.length;i++){
                int min =nums[i];
                if(nums[i]%2==0){
                    min =nums[i];
                    count++;
                }
                if(min<b){
                    b=min;
                    index =i;
                }
                if(nums.length-1<=i){
                    if(count>0){
                        return nums[index];
                    }
                }
            }
        }
        if(countm==0){
            return -1;
        }
        return index;
    }
}
*/