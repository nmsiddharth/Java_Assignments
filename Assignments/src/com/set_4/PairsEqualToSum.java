package com.set_4;

public class PairsEqualToSum {

	public static void check() {
		int[] arr = {1,5,7,-1,-3,9};
		int sum = 6;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
	check();

	}

}
