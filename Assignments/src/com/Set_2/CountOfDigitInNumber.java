package com.Set_2;

import java.util.Scanner;

public class CountOfDigitInNumber {

	public static int check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		System.out.println("Enter Digit to check count");
		int d = sc.nextInt();
		int count = 0;
		while(num>0) {
			int rem = num%10;
			
			
			if(rem==d) {
				count++;
				
			}
			num = num/10;
		}
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CountOfDigitInNumber.check());

	}

}
