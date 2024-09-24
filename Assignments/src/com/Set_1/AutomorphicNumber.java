package com.Set_1;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void check(int num) {
		int square = num*num;
		System.out.println("Square of "+num +" = "+square);
		String n = String.valueOf(num);
		String sq = String.valueOf(square);
		
		
		if(sq.endsWith(n)) {
			System.out.println(num+" is Automorphic number");
		}else {
			System.out.println(num+" is not Automorphic number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		check(num);
		
	}

}
