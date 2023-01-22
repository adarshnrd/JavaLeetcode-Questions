package com.company;

public class PlusOne {
    public static void main(String args[]){
        int digitss[] ={9,8,7,6,5,4,3,2,1,0};
    arr(digitss);
    }
    static int[] arr(int [] digits){
        long num =0;
        for(int i =0;i<digits.length;i++){
            num =num*10+digits[i];
        }
        num =num+1;
        long nums =num;
        int count =0;
        while (nums>0){
            count++;
            nums/=10;
        }
        int newdigit[] =new int[count];
        int j;
        for( j =count-1;j>=0;j--){
            int last = (int) (num%10);
            newdigit[j] = last;
            num /=10;
        }

        return newdigit;
    }
}

