package com.Set_2;

import java.util.Scanner;

public class BinaryToOctal {

	public static int getDecimal(int num) {
		
		//int temp = num;
		int i = 0;
		int decimal = 0;
		
		while(num>0) {
			int rem = num%10;
			   decimal += rem * Math.pow(2, i++);
			num = num/10;
		}
		return decimal;
	}
	
	public static void check(int num) {
		int temp = getDecimal(num);
		int octal =0;
		int place =1;
		while(temp>0) {
			int rem = temp % 8;
			octal = octal+rem*place;
			place*=10;
			temp = temp/8;
		}
		   System.out.println("Octal equivalent: " + octal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Input");
		int num = sc.nextInt();
		BinaryToOctal.check(num);

	}

}
