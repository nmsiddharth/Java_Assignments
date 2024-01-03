package com.Set_2;

import java.util.Scanner;

public class LCMof2Numbers {

	public static int getGCD(int num1,int num2) {
		int gcd =1;
		
		
		for(int i=1;i<=num1 && i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	public static int getLCM(int num1,int num2) {
		return num1*num2/getGCD(num1,num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter a Second Number");
		int num2 = sc.nextInt();
		System.out.println(LCMof2Numbers.getLCM(num1,num2));
	}

}
