package com.Set_3;

import java.util.Arrays;

public class MinimumSumOfAbsDiffOfArray {

	public static int check() {
		 int arr[] = {5, 10, 1, 4, 8, 7};
		 int n = arr.length;
		 Arrays.sort(arr);
		 
		 int sum = 0;
		 sum += Math.abs(arr[0]-arr[1]);
		 sum += Math.abs(arr[n-1]-arr[n-2]);
		 
		 for(int i=1;i<n-1;i++) {
			 sum += Math.min(Math.abs(arr[i]-arr[i-1]), Math.abs(arr[i]-arr[i+1]));
		 }
		 return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check());

	}

}
