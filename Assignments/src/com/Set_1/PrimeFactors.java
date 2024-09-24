package com.Set_1;

import java.util.Scanner;

public class PrimeFactors {

	public static void getPrime(int num) {
		for(int i=2;i<=num;i++) {
			while(num%i==0) {
				num = num/i;
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		getPrime(num);

	}

}
