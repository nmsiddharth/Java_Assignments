package com.Set_3;

public class SecondSmallestElementWithoutSortingTechnique {

	public static void check() {
		int[] arr = {5,9,4,2,7};
		int smallest = arr[0];
		for(int data:arr) {
			if(smallest>data) {
				smallest=data;
			}
		}
		//System.out.println(smallest);
		int secondSmallest = arr[0];
		for(int i =1;i<arr.length-1;i++) {
			if(smallest < arr[i] && secondSmallest>arr[i]) {
				secondSmallest=arr[i];
			}
		}
		System.out.println(secondSmallest);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

}
