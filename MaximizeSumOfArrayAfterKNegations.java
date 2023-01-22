package com.company;
import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {
    public static void main(String args[]){
int inde []={-4,-3,-2};
int k= 6;
        System.out.println(largestSumAfterKNegations(inde,k));
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        int sum =0;
        Arrays.sort(nums);

        int index =0;
        int min =Integer.MAX_VALUE;

        if(k>nums.length) {
            for(int i=0;i<k;i++) {
                int z = 0;
                if (i == k - 1) {
                    for (int j = 0; j < nums.length; j++) {
                        if (min > nums[j]) {
                            min = nums[j];
                            index = j;
                        }
                    }
                    nums[index] = -nums[index];
                    break;
                }
                if (nums[z] < 0) {
                    nums[z] = -nums[z];
                    index++;
                    z++;
                } else {
                    nums[index] = -nums[index];
                }
            }
            for(int i:nums){
                sum+=i;
            }
            return sum;
        }

        for(int i=0;i<k;i++){
            if(i==k-1){
                for(int j=0;j<nums.length;j++){
                  if(min>nums[j]){
                      min=nums[j];
                      index=j;
                  }
                }
                nums[index]=-nums[index];
                break;
            }
            if(nums[i]<0){
                nums[i]=-nums[i];
                index++;
            }else{
                nums[index]=-nums[index];
            }

        }


        for(int i:nums){
            sum+=i;
        }
        return sum;
    }
}
