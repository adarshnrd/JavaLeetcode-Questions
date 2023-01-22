package com.company;
//done in o(N*n) but it wont work.
public class ContinuousSubarraySum {
    public static void main(String args[]) {
        int nums[] = {1,3,6,0,9,6,9};
        int k = 7;
        System.out.println(checkSubarraySum(nums, k));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        int sum=0;
        if(nums.length<2){
            return false;
        }
        int arr[]=new int[nums.length];
        arr[0]=nums[0];


        for(int i=1;i<nums.length;i++){
            arr[i]+=nums[i]+arr[i-1];
            if(nums[i-1]==0 && nums[i]==0){
                return true;
            }
        }

        for(int i=1;i<nums.length;i++){
            if(arr[i]%k==0&&arr[i]!=0){
                return true;
            }
        }
        int sufix []=new int[nums.length];
        sufix[0]=nums[nums.length-1];
        int a =1;
        for(int i=nums.length-2;i>=0;i--){
            sufix[a]+=nums[i]+sufix[a-1];
            a++;
        }

        for(int i=0;i<nums.length;i++){
            if(sufix[i]%k==0&&sufix[i]!=0){
                return true;
            }
        }
        return false;
    }
}
        /*
        int sum =0;
        int totalsum =nums[0]+nums[1];
        int count= 0;
        for(int i=0;i<nums.length-1;i++){
            sum =nums[i]+nums[i+1];
            if(count>=2){
                totalsum+=nums[i];
            }
            if(sum%k==0|| totalsum%k==0&&nums[i]!=0){
                return true;
            }
            if(i==nums.length-2){
                totalsum +=nums[i+1];
                if(totalsum%k==0){
                    return true;
                }
            }
        count++;
        }
        return false;
    }
}
*/