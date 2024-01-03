package com.Set_2;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static String check(int num) {
		int rem =0;
		String hex ="";
		char hexChar[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
		
		while(num>0) {
			 rem = num%16;
			 hex = hexChar[rem] + hex;
			 num = num/16;
		}
		return hex;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Decimal Input");
	        int num = sc.nextInt();
	       System.out.println( check( num));
	}

}
