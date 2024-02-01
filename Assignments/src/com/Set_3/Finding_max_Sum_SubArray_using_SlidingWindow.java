package com.Set_3;

public class Finding_max_Sum_SubArray_using_SlidingWindow {

	public static void main(String[] args) {
		int[] arr = {2,9,31,-4,21,7};
		int k=3;  // size of window(Given)
		int wSum = 0;
		int mSum = Integer.MIN_VALUE;
		
		// To find 1st window sum
		for(int i=0;i<k;i++) {
			wSum += arr[i];
		}
		
		for(int i=k;i<arr.length;i++) {
			wSum = wSum - arr[i-k] + arr[i];
			mSum = Math.max(mSum, wSum);
		}
		System.out.println(mSum);
		

	}

	private static int Max(int wSum, int mSum) {
		// TODO Auto-generated method stub
		return 0;
	}

}
