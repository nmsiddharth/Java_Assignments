package com.set_4;

public class FactorialOfLargerNumber {

	public static void getFactorial(int larger) {
		int fact = 1;
		
		for(int i=1;i<=larger;i++) {
			fact *= i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		int[] arr = {4,3,6,2,5};
		int large = arr.length-1;
		for(int data:arr) {
			if(large<data) {
				large=data;
			}
		}
		getFactorial(large);

	}

}
