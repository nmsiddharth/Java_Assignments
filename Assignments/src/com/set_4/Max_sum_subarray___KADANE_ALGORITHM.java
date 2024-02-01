package com.set_4;

public class Max_sum_subarray___KADANE_ALGORITHM {

	public static void check() {
		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		
		int maxSum = Integer.MIN_VALUE;
		int sum = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(sum>=0) {
				sum += arr[i];
			}else {
				sum = arr[i];
			}
			if(maxSum<sum) {
				maxSum = sum;
			}
		}
		System.out.println(maxSum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
