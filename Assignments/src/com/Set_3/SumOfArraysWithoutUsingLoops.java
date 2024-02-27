package com.Set_3;

public class SumOfArraysWithoutUsingLoops {

	public static int print(int[] arr,int n) {

		if(n==-1) {
			return 0;
		}
		int sum = print(arr, n-1);
		sum = sum+arr[n];
			return sum;
	
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int n = arr.length-1;
		int sum = 	print(arr, n);
		System.out.println(sum);

	}

}
