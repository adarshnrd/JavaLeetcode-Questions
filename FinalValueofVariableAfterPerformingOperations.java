package com.company;

public class FinalValueofVariableAfterPerformingOperations {
    public static void main(String args[]){
    String a[]={"--X","X++","X++"};
    System.out.println(finalValueAfterOperations(a));
    }
    public static int finalValueAfterOperations(String[] operations) {

        int X =0;
        for(int i =0;i<operations.length;i++){
            if(operations[i].equals("X++")){
                X++;
            }
            if("++X".equals(operations[i])){
                ++X;
            }
            if("--X".equals(operations[i])){
                --X;
            }
            if("X--".equals(operations[i])){
                X--;
            }
        }

        return X;
    }
}
