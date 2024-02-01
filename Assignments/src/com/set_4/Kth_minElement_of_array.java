package com.set_4;

public class Kth_minElement_of_array {

	public static void check() {
		int[] arr = {3,2,6,4,1};
		
		int smallest = arr[0];
		
		for(int data:arr) {
			if(smallest>data) {
				smallest = data;
			}
		}
		int secondSmallest = arr[0];
		
		for(int i=1;i<arr.length-1;i++) {
			if(secondSmallest>arr[i] && arr[i]>smallest) {
				secondSmallest = arr[i];
			}
		}
		
		int thirdSmallest = arr[0];
		for(int i=2;i<arr.length-2;i++) {
			if(thirdSmallest>arr[i] && arr[i]>secondSmallest && arr[i]>smallest) {
				thirdSmallest = arr[i];
			}
		}
		System.out.println(thirdSmallest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
