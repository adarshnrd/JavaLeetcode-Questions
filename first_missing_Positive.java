package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class first_missing_Positive {
    public static void main(String args[]) {
        int a[] = {1,2,3,5,6};
        System.out.println(firstMissingPositive(a));
    }
    public  static int firstMissingPositive(int[] nums) {
        int res =1;
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(nums[i]);
            }
        }
        Collections.sort(list);
        int count =0;
        for(int i=0;i<list.size();i++){
            if(res==list.get(i)){
                res++;
                count++;
                i =count-1;
            }
        }

        return res;
    }
}

    /*
    public static int firstMissingPositive(int[] nums) {
        int ans =1;
        Arrays.sort(nums);
        HashSet<Integer> list =new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(nums[i]);
            }
        }
      int arr[] =new int[list.size()];
        long q=0;

        // iterating over the hashset
        for(int ele:list){
            arr[(int) q++] = ele;
        }

        ArrayList <Integer> list1 =new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                list1.add(arr[i]);
            }
        }
        for(int i =0;i<list.size();i++){
            if(list1.get(i)==ans){
                ans++;
            }
           else if (list1.get(i)!=ans){
                return ans;
            }
        }

        return ans;
    }
}





/* Arrays.sort(nums);
        int ans = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(nums[i]);
            }
        }
        if (list.size() == 0) {
            return 1;
        }
        if (list.size() <= 1) {
            if (list.get(0) != ans) {
                return 1;
            } else if (list.get(0) == ans) {
                return ans + 1;
            }
        }
        int arr[] =new int[list.size()];
            for(int i=0;i<list.size();i++){
                arr[i] =list.get(i);
            }
            int temp =ans;

        for(int i=0;i<arr.length;i++){

        if(arr[i]==ans){
            ++ans;

        }
        else if(arr[i]!=i){
         return ans;
        }

        if(arr[i+1]==temp){
            i++;
        temp =ans;
        }

        }
        return ans;
    }
}
//        for(int i=0;i<=list.size()-1;i++){
//            int temp =ans;
//            if(list.size()-1<=i) {
//                return ++ans;
//            }
//            if(list.get(i)==ans){
//                ans++;
//            }
//            else if(list.get(i)!=ans){
//                return ans;
//            }
//            if(temp ==list.get(i+1)){
//                i++;
//            }
//
//            if(list.size()-1<=i) {
//                return ans;
//            }
//                if (temp == list.get(i + 1)) {
//                    i++;
//                }
//        }
//        return ans;
//
//    }
//    }
        /*Arrays.sort(nums);
        int ans =1;
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(nums[i]);
            }
        }
        if(list.size()<1){
            return ans;
        }
        for(int j=0;j<1;j++){
            if(list.get(j)!=1){
                return ans;
            }
        }
        for(int i=0;i<=list.size()-1;i++){
            int temp =ans;
            if(list.get(i)==ans) {
                ans++;
            }
            else if(list.get(i)!=ans){
                return ans;
            }
            if(list.get(i)==temp && list.get(i+1)==temp){
                i+=2;
            }
        }
        return ans;
    }
}
        /*

    }
}

/*
        public static int firstMissingPositive(int[] nums) {
            Arrays.sort(nums);
            int ans =1;
            // -1 1 3 4

            for(int i=0;i<nums.length;i++){

            }

            return ans;
        }
    }
/*
for(int i=0;i<nums.length;i++){
                for (int num : nums) {
                    if (num == ans) {
                        ans++;
                        break;

                    }
                }
* */


    /*

        public static int firstMissingPositive(int[] nums) {
            Arrays.sort(nums);
            int a[] =new int[nums.length];

            for(int i =0;i<nums.length;i++){
                if(nums[i]>0){
                    a[i] =nums[i];
                }
            }
            Arrays.sort(a);
            int ans =1;
            for(int i=0;i<a.length;i++){
                if(ans == a[i]){
                    ans++;
                }
                else{
                    break;
                }

            }
            return ans;
        }
    }

*/