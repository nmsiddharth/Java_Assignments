package com.Set_2;

import java.util.Scanner;

public class RootsOfQuadraticEquation {

    public static void check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a = ");
        double a = sc.nextDouble();
        System.out.println("Enter b = ");
        double b = sc.nextDouble();
        System.out.println("Enter c = ");
        double c = sc.nextDouble();
        double x1 = 0;
        double x2 = 0;
        double d = b * b - 4 * a * c;

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and different. Root 1 = " + x1 + " and Root 2 = " + x2);
        } else if (d == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("Roots are real and same. Root = " + x1);
        } else {
        	 double real = -b / (2 * a);
             double imaginary = Math.sqrt(-d) / (2 * a);
             System.out.format("root1 = %.2f+%.2fi", real, imaginary);
             System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
        sc.close(); // Close the scanner to avoid resource leakage
    }

    public static void main(String[] args) {
        check();
    }
}
