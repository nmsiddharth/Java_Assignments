package com.Set_1;

import java.util.Scanner;

public class PrimeNumberInGivenrange {

	public static void getPrime(int a , int b) {
		
		for(int i=a;i<=b;i++) {
			boolean isPrime = check(i);
			if(isPrime) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean check(int num) {
		boolean isPrime = true;
		 for(int i=2;i<=num/2;i++) {
		    	if(num%i==0) {
		    		isPrime = false;
		    		break;
		    	}
		    }
		 return isPrime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Number");
	    int number1 = sc.nextInt();
	    System.out.println("Enter End Number");
	    int number2 = sc.nextInt();
	    
	    getPrime(number1, number2);
	}

}
