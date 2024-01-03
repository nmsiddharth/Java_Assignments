package com.Set_2;

import java.util.Scanner;

public class OctalToBinary {

	public static int getDecimal(int num) {
		
		int i = 0;
		int decimal = 0;
		
		while(num>0) {
			int rem = num%10;
			 decimal += rem*Math.pow(8, i++);
			num = num/10;
		}
		return decimal;
	}
	
	public static  void check(int num) {
		int temp = getDecimal(num);
		 String binary = "";
	       

	        while (temp > 0) {
	            int remainder = temp % 2;
	            binary = binary + remainder ;
	           // place = place * 10;
	            temp = temp / 2;
	        }
	        StringBuffer obj = new StringBuffer( binary);
	        obj.reverse();
	        System.out.println("Binary Representation: " + obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Octal Input");
		int num = sc.nextInt();
		check(num);
	}

}
