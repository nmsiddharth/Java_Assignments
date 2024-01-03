package com.Set_1;

import java.util.Scanner;

public class PerfectNumber {

	public static int getFact(int num) {
		int sum = 0;
		for(int i=1;i<num/2;i++) {
			if(num%i==0) {
				
				sum = sum+i;
			}
		}
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		int result = PerfectNumber.getFact(num);
		

		if(num==result) {
			System.out.println(num+" is Perfect Number");
		}
		else {
			System.out.println(num+" is not Perfect Number");
		}
		

	}

}
