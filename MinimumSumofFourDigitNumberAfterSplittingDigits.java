package com.company;
import java.util.Arrays;

public class MinimumSumofFourDigitNumberAfterSplittingDigits {
    public static void main(String args[]) {
int num =2687;
        System.out.println(minimumSum(num));
    }
    public static int minimumSum(int num) {
            //solving with arrays
        String a =String.valueOf(num);
        int arr[]=new int[a.length()];
        int i=0;
        while (num>0){
            int ld =num%10;
            arr[i]=ld;
            i++;
            num/=10;
        }
        Arrays.sort(arr);
        int ab =arr[0]*10+arr[a.length()-1];
        int cd =arr[1]*10+arr[a.length()-2];
        return ab+cd;
    }
}
        /*
        int a =sortno(num);
        return a;
    }
    public static int sortno(int num){
        int a =num%10;
        num/=10;
        int b =num%10;              //2687
        num/=10;
        int c =num%10;
        num/=10;
        int d =num%10;

        int mina=Math.min(a,b);//7
        int minb=Math.min(c,d);//2
        int maxa=Math.max(a,b);//8
        int maxb=Math.max(c,d);//6

        int lowest=Math.min(mina,minb);

        int l =Math.min(maxa,maxb);
        int bb =Math.max(mina,minb);
        int second =Math.min(l,bb);
        int third =Math.max(l,bb);

        int forth=Math.max(maxa,maxb);

        int aa =lowest*10+forth;
        int qq=second*10+third;
        return aa+qq;
    }
}
*/