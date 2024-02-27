package com.Set_3;

public class Print_1To50_withoutUsingLoops {

	public static void print(int n) {
		
		if(n==0) {
			return;
		}
		print(n-1);               // prints in ascending order
		System.out.println(n);
//		print(n-1);				// prints in Descending order
		
		
	}
	public static void main(String[] args) {
		int n = 50;
		print(n);
	}

}
