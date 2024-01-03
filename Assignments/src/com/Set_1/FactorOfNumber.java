package com.Set_1;

import java.util.Scanner;

public class FactorOfNumber {

	public static void getFactor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = sc.nextInt();
		
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				System.out.print(i+ ", ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorOfNumber.getFactor();

	}

}
