package com.Set_2;

import java.util.Scanner;

public class Add2Fractions {

    public static void check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Numerator");
        int n1 = sc.nextInt();
        System.out.println("Enter a First Denominator");
        int d1 = sc.nextInt();
        System.out.println("Enter a Second Numerator");
        int n2 = sc.nextInt();
        System.out.println("Enter a Second Denominator");
        int d2 = sc.nextInt();
        int sum = 0;
        int d = 0;
        int min = 0;

        if (d1 == d2) {
            sum = n1 + n2;
            d = d1;
        } else {
            d = d1 * d2;
            n1 = n1 * d2;
            n2 = n2 * d1;
            sum = n1 + n2;
            min = Math.min(sum, d);

            for (int i = 2; i <= min; i++) {
                if (sum % i == 0 && d % i == 0) {
                    sum = sum / i;
                    d = d / i;
                }
            }
        }
        if (sum % d == 0) {
            sum = sum / d;
            System.out.println(sum);
        } else {
            System.out.println(sum + " / " + d);
        }
    }

    public static void main(String[] args) {
        Add2Fractions.check();
    }
}
