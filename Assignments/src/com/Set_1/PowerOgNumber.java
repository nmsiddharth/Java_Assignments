package com.Set_1;

import java.util.Scanner;

public class PowerOgNumber {

	public static int getPower() {
		int result =1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Base");
		int base = sc.nextInt();
		System.out.println("Enter Power");
		int power = sc.nextInt();
		
		for(int i=1;i<=power;i++) {
			 result = result*base;
		}
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PowerOgNumber.getPower());

	}

}
