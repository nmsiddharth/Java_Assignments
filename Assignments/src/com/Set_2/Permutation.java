package com.Set_2;

import java.util.Scanner;

public class Permutation {

    public static int getFactorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int getPermutation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of Persons");
        int number = sc.nextInt();
        System.out.println("Enter number of seats");
        int r = sc.nextInt();
        int temp = number -r;

        return getFactorial(number) / getFactorial(temp);
    }

    public static void main(String[] args) {
        System.out.println(getPermutation());
    }
}
