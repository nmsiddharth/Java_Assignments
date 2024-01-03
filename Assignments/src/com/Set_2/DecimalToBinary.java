package com.Set_2;

import java.util.Scanner;

public class DecimalToBinary {

    public static void convertToBinary(int num) {
        int binary = 0;
        int place = 1;

        while (num > 0) {
            int remainder = num % 2;
            binary = binary + remainder * place;
            place = place * 10;
            num = num / 2;
        }

        System.out.println("Binary Representation: " + binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Input");
        int num = sc.nextInt();
        convertToBinary(num);
    }
}
