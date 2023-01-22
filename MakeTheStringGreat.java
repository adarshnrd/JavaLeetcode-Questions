package com.company;

public class MakeTheStringGreat {
    public static void main(String args[]) {
        String as = "jeSsEJ";
        System.out.println(makeGood(as));
    }

    public static String makeGood(String s) {


        for (int i = 0; i < s.length(); i++) {
            s =rm(s);
            s =rm(s);
            s =rm(s);
            s =rm(s);
            s =rm(s);
            s =rm(s);
            s =rm(s);
            s =rm(s);
            s =rm(s);
            s =rm(s);
        }

        return s;
    }
    public  static String rm(String s){

        for(int j =0;j<s.length()-1;j++){
            if(s.charAt(j)-97==s.charAt(j+1)-65||s.charAt(j)-65==s.charAt(j+1)-97){
                String ar = s.charAt(j) +""+s.charAt(j+1);
            s = s.replace(ar,"");
            }
        }
return  s;
    }
}
//97 122 small
//65 90 upper