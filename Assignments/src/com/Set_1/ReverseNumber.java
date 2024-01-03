package com.Set_1;

import java.util.Scanner;

public class ReverseNumber {

	public static int check() {
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		while(num>0) {
			int rem = num%10;
			rev = rev*10 + rem;
			num = num/10; 
			
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ReverseNumber.check());
	}

}
