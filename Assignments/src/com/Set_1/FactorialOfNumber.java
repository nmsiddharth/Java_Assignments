package com.Set_1;

import java.util.Scanner;

class Fact{
	public int check() {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = sc.nextInt();
		
		for(int i=1;i<=number;i++) {
			fact = fact*i;
		}
		return fact;
	}
}
public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fact obj = new Fact();
		int result = obj.check();
		System.out.println(result);
		

	}

}
