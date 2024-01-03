package com.Set_1;

import java.util.Scanner;

public class SumOfNumbersInGivenRange {
	public static int check() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Number");
	    int number1 = sc.nextInt();
	    System.out.println("Enter End Number");
	    int number2 = sc.nextInt();
	    
	    for(int i=number1;i<number2;i++) {
	    	sum = sum+i;
	    }
	    return sum;
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = SumOfNumbersInGivenRange.check();
		System.out.println(result);
	}

}
