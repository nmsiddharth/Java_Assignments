package com.Set_5;

public class Replace_substring_in_a_String {

    public static void main(String[] args) {
        String strOriginal = "Hello world";
        String strOld = strOriginal.substring(0,5);
        String replace = "Java";

        String newStr = strOriginal.replaceAll(strOld, replace);
        System.out.println(newStr);
        //System.out.println(strOld);
    }
}
