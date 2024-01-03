package com.Set_2;

import java.util.Scanner;

public class HexadecimalToDecimal {

    public static double getDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hexadecimal Input");
        String hex = sc.nextLine();
        int len = hex.length();
        int i = 0;
        double decimal = 0;

        while (len > 0) {
            char ch = hex.charAt(len - 1);
            int digit = Character.isDigit(ch) ? ch - '0' : 10 + ch - 'A';
            decimal += digit * Math.pow(16, i++);
            len--;
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(HexadecimalToDecimal.getDecimal());
    }
}
