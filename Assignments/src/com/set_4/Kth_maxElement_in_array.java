package com.set_4;

public class Kth_maxElement_in_array {
	public static void check() {
		int[] arr = {3,2,6,4,1};
		int largest = arr[arr.length-1];
		
		for(int data:arr) {
			if(largest<data) {
				largest = data;
			}
		}
		
		int secondLargest =arr[arr.length-1];
		
		for(int i=arr.length-2;i>=0;i--) {
			if(secondLargest<arr[i] && arr[i]<largest) {
				secondLargest = arr[i];
			}
		}
		
		int thirdLargest = arr[arr.length-1];	
				for(int i= arr.length-3;i>=0;i--) {
					if(thirdLargest<arr[i] && arr[i]<secondLargest && arr[i]<largest) {
						thirdLargest = arr[i];
					}
				}
				
	System.out.println(thirdLargest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
