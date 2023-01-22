package com.company;

public class CheckifNumberHasEqualDigitCountandDigitValue {
    public static void main(String args[]) {
        String a = "1210";
        System.out.println(digitCount(a));
    }

    public static boolean digitCount(String nums) {
        int arr[] = new int[nums.length()];

        for (int i = 0; i < nums.length(); i++) {
            int a = nums.charAt(i) - 48; //ascii value 0
            //or you can use to convert every value by
            // int a = Character.getNumericValue(i);
            // int a = nums.charAt(i)-'0';
            // int a = Integer.parseInt(String.valueOf(i));
            arr[i] = a;
        }
        for (int i = 0; i < arr.length; i++) {

            boolean a = tf(arr, arr[i], i);
            if (!a) {
                return false;
            }
        }

        return true;
    }

    public static boolean tf(int arr[], int fn, int sn) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sn == arr[i]) {
                count++;
            }
        }
        if (count == fn) {
            return true;
        }
        return false;

    }
}
