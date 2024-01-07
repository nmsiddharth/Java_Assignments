package com.Set_2;

import java.util.Scanner;

public class SumOf2PrimeNumbers {

	public static boolean checkPrime(int num) {
		boolean flag = true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
		}
		return flag;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Number");
	    int number = sc.nextInt();
	    boolean primePair = false;
	    
	    for(int i=2;i<=number;i++) {
	    	if(checkPrime(i)) {
	    		int otherNum = number - i;
	    		if(checkPrime(otherNum)) {
	    			System.out.println(i +" "+ otherNum );
	    			primePair = true;
	    		}
	    	}
	    }
	    if(primePair==false) {
	    	System.out.println("No such pair exists");
	    }
	}

}
