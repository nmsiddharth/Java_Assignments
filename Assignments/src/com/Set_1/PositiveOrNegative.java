package com.Set_1;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
	    int number = sc.nextInt();
	    

	    if(number>0) {
	    	System.out.println("Positive number");
	    }else {
	    	System.out.println("Negative number");
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveOrNegative.check();
	}

}
