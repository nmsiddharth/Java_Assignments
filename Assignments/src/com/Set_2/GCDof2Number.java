package com.Set_2;

import java.util.Scanner;

public class GCDof2Number {

	public static void getGCD() {
		int gcd =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter a Second Number");
		int num2 = sc.nextInt();
		
		for(int i=1;i<=num1 && i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCDof2Number.getGCD();
	}

}
