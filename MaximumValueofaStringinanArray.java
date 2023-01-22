package com.company;

public class MaximumValueofaStringinanArray {
    public static void main(String[] args) {
        String s[] ={"abced9","12345","bob","3","4",};
        System.out.println(maximumValue(s));
    }
    public static int maximumValue(String[] strs) {

        int max=0;
        String regex = "\\d+";
        for(int i=0;i<strs.length;i++){
            int ab =0;
            if(strs[i].matches( regex)){
                ab =Integer.parseInt(String.valueOf(strs[i]));
                if(ab>max){
                    max=Integer.parseInt(String.valueOf(strs[i]));
                }
            }
            else{
                int a =strs[i].length();

                if(a>max){
                    max =a;
                }
            }

        }
        return max;
    }
}
