package com.Set_2;

import java.util.Scanner;

public class BinaryToDecimal {

	public static double getDecimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Input");
		int num = sc.nextInt();
		int temp = num;
		int i = 0;
		double decimal = 0;
		
		while(num>0) {
			int rem = num%10;
			 decimal += rem*Math.pow(2, i++);
			num = num/10;
		}
		return decimal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BinaryToDecimal.getDecimal());
	}

}
