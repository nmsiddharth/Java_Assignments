package com.Set_1;

import java.util.Scanner;

public class AbundantNumber {
	public static String getFact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				
				sum = sum+i;
			}
		}
		if(sum>temp) {
			return temp+" is Abundant Number";   // sum of its proper divisors is greater than the given number
		}
		else {
			return temp+" is not Abundant Number";
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(AbundantNumber.getFact());
	}

}
