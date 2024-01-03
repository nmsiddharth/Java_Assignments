package com.Set_2;

import java.util.Scanner;

public class DecimalToOctal {

	public static void check(int num) {
		int octal =0;
		int place =1;
		while(num>0) {
			int rem = num%8;
			octal = octal+rem*place;
			place = place*10;
			num = num /8;
		}
		 System.out.println("Octal Representation: " + octal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Decimal Input");
	        int num = sc.nextInt();
	        check( num);
	}

}
