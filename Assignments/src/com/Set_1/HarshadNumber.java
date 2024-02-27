package com.Set_1;

import java.util.Scanner;

public class HarshadNumber {

	public static String getDigits() {
		int digit = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int temp = num;
		
		while(num>0) {
			int rem = num%10;
			digit = digit +rem;
			num = num/10;
		}
		
		if(temp%digit==0) {
			return temp+" is Harshad Number";   // number divisible by sum of its digits
		}
		else {
			return temp+" is not Harshad Number";
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(HarshadNumber.getDigits());
		

	}

}
