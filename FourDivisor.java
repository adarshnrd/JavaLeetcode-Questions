package com.company;
//not done tle.
public class FourDivisor {
    public static void main(String args[]) {
        int arr[] = {58778,10816,27393,86795};
        System.out.println(sumFourDivisors(arr));
    }
    public static int sumFourDivisors(int[] nums) {
        int sum = 0;
        int total =0;
        int count =1;

        for(int i=0;i<nums.length;i++){

            for(int j=1;j<=(nums[i]/2);j++){
                if(nums[i]%j==0){
                    count++;
                    total+=j;
                }
            }
            total +=nums[i];
            if(count==4){
                sum+=total;
                total=0;
            }
            total=0;
        }
        return sum;
    }
}
