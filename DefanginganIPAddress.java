package com.company;

public class DefanginganIPAddress {
    public static void main(String args[]){

    }
    public static String defangIPaddr(String address) {

        String a =address.replace(".","[.]");
        return a;
    }
}
