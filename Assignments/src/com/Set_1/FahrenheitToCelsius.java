package com.Set_1;

import java.util.Scanner;

class Temperature {
    public float check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit temperature");
        float fahrenheit = sc.nextFloat(); // Use nextFloat() to read float input

        return (fahrenheit - 32) * 5 / 9;
    }
}

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Temperature obj = new Temperature();
        float result = obj.check();
        System.out.println(result + " C");
    }
}
