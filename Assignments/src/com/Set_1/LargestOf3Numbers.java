package com.Set_1;

import java.util.Scanner;

class DSA{
	public String operation() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter Third Number");
		int num3 = sc.nextInt();
		
		
		if(num1>num2 && num1>num3) {
			return num1+" is largest Number";
		}else if(num2>num1 && num2>num3) {
			return num2+" is largest Number";
		}else {
			return num3 +" is largest Number";
		}
	}
}
public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DSA obj = new DSA();
		String result = obj.operation();
		System.out.println(result);

	}

}
