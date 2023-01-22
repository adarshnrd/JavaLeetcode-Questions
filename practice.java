package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int a =10;
        int n =10/5;
        System.out.println(n);
    }
}
//        int x =1534236469;
//        int count =0;
//        while (x>0){
//            x=x/10;
//            count++;
//        }
//        System.out.println(count);
        /*
int x =121;
int y =x;
int sum =0;
int remider;

while (x>0){
    remider =x%10;
    sum =sum*10+remider;
    x=x/10;
}
if( sum==y ){
    System.out.println("true");
}
else
    System.out.println("false");


      /*  int number = 110101;
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }

        System.out.println(Arrays.toString(numbers));
*/
//
//    }
//}

        /*
        for(int i =0;i<nums.length-1;i++){
            for(int j =0;j<nums.length-1;j++) {
                if ((nums[i] + nums[j+1]) == target) {
                    return new int[]{i, i + 1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
    }
}

        int count =0;

        while (x>0){// to find how many numbers it has
            x =x/10;
            ++count;
        }

        int start = 0;// To start check from starting point
        int end = count;//check with end points

        int arr[] =new int [count];
        String temp =Integer.toString(x);
        for(int i =0;i<count;i++){
        arr[i] = temp.charAt(i) - '0';
        }



return true;
    }

}

static int  UniqueN0(int []nums){

        Arrays.sort(nums);
        int unique =0;
        for(int i=0; i< nums.length-1;i++)
            if (nums[i] == nums[i+1])
                unique =nums[i];
        else return nums[i+1];

         return nums[unique];
     }
*/