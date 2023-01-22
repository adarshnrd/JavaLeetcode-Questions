package com.company;

import java.util.*;

public class TopKElements {
    public static void main(String args[]){
        int nums[] ={1,1,1,1,1,1,2,3,3};
        int k =2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
        public static int[] topKFrequent(int[] nums, int k) {
        LinkedHashSet<Integer>hs =new LinkedHashSet<>();
        for(int i:nums){
            hs.add(i);
        }

            HashMap<Integer,Integer>hm =new HashMap<>();
            for(int i:hs){
                int j =count(nums,i);
                hm.put(i,j);
            }
            List<Map.Entry<Integer,Integer>>list =new ArrayList<>(hm.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o1.getValue()-o2.getValue();
                }
            });
            int ans[]=new int[hm.size()];

            int ab =0;
            for(Map.Entry<Integer, Integer> i:list)
            {
            ans[ab] =i.getKey();
            ab++;
            }
            int anss []=new int[k];
            int val =ans.length-1;
            for(int i =0;i<k;i++){
                anss[i] =ans[val];
                val--;
            }

            return anss;
    }
    public static int count(int []nums,int k){
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                count++;
            }
        }
        return count;
    }
}

        /*

            LinkedHashSet<Integer> hs =new LinkedHashSet<>();
            for(int i:nums){
                hs.add(i);
            }
            ArrayList<Integer>list =new ArrayList<>();

            list.addAll(hs);
            int ans[]=new int[hs.size()];
            ArrayList<Integer>list2 =new ArrayList<>(hs.size());

            for(int i=0;i<hs.size();i++){
                ans[i]=frequency(nums,list.get(i));
                list2.add(frequency(nums,list.get(i)));
            }

            int anss[]=new int [k];
            int lastmax =0;
            for(int i=0;i<k;i++){
                int ab =maxindex(ans,lastmax);
                int index =list2.indexOf(ab);
                lastmax =ab;
               anss[i]=list.get(index);
            }
            return anss;
        }
        public static int frequency(int[] nums ,int k){
            int count =0;
            for(int i=0;i<nums.length;i++){
                if(k==nums[i]){
                    count++;
                }
            }
            return count;
        }
        public static int maxindex(int[]ans,int lastmax){
            int max =0;

            for(int i=0;i<ans.length;i++){
                if(ans[i]>max && lastmax!=ans[i]){
                    max =ans[i];
                }
            }
            return max;
        }
    }
*/