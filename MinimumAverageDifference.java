package com.company;


public class MinimumAverageDifference {
    public static void main(String args[]){
int arr[]={2,5,3,9,5,3};
        System.out.println(minimumAverageDifference(arr));
    }
    public static int minimumAverageDifference(int[] nums) {

        int ans[] = new int[nums.length];
        long answer = Integer.MAX_VALUE;
        long mainindex = 0;
        long totalsum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalsum += nums[i];
        }
        long firstsum=0;
        long second =totalsum;
        for(int i=0;i<nums.length;i++){
            firstsum += nums[i];
            long first=firstsum/(1+i);

            second -= nums[i];
            long se = 0;
            if(second==0){
                 se =Math.abs(first-second);
            }
            else {
                long seconds = second / (nums.length - i - 1);
                 se = Math.abs(first - seconds);
                //answer= Math.min(se,answer);
            }
                if(answer>se){
                answer=se;
                mainindex=i;
            }
        }

        return (int)mainindex;

    }
}
        /*
        for(int i=0;i<nums.length;i++){
            int first = firstpart(nums,i);
            int second = secondpart(nums,i);
            int se =Math.abs(first-second);
            //answer= Math.min(se,answer);
            if(answer>se){
                answer=se;
                mainindex=i;
            }
        }
        return mainindex;

    }
    public static int firstpart(int []nums,int count){
        count+=1;
        int sum =0;
        for(int i=0;i<count;i++){
            sum+=nums[i];
        }
        return sum/count;
    }
    public static int secondpart(int []nums,int ij){
        int sum =0;
        int count =0;
        for(int i=ij+1;i<nums.length;i++){
            sum+=nums[i];
            count++;
        }
        if(count==0){
            count=1;
        }
        return sum/count;
    }
}
*/