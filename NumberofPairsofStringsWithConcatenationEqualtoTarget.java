package com.company;
//done done done
public class NumberofPairsofStringsWithConcatenationEqualtoTarget {
    public static void main(String args[]) {
 String ada[] ={"777","7","77","77"};
    String tar ="7777";
        System.out.println(numOfPairs(ada,tar));
    }

    public static int numOfPairs(String[] nums, String target) {
        int count = 0;

  /*      for(int i =0;i<nums.length;i++){
             count+= counts(nums,target,i);
        }
        return count;
    }
    public static int counts(String[] nums,String target,int i){
        int start =i;
        int end =start+1;
        int count =0;

        while (end!=start){
            if(end==nums.length){
                end =0;
            }
            String ad =nums[start]+nums[end];
            if(ad.equals(target)){
                count++;
            }
            end++;
            if(end==nums.length){
                end =0;
            }
        }
        return count;
    }
}
  */
  for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j!=i) {
                if (j >= nums.length) {
                    j = 0;
                }
                String ad = nums[i] + nums[j];
                if (ad.equals(target)) {
                    count++;
                }
                j++;
                if (j >= nums.length ) {
                    j = 0;
                }
            }

        }
        return count;
    }
}