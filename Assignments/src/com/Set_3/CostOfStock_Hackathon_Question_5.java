package com.Set_3;

public class CostOfStock_Hackathon_Question_5 {

	public static void  check() {
		int[] arr = {100,180,260,310,40,535,695};
		
		int smallest = arr[0];
		for(int data:arr) {
			if(smallest>data) {
				smallest=data;
			}
		}
		
	int largest = arr[arr.length-1];
		
		for(int data:arr) {
			if(largest<data) {
				largest = data;
			}
		}
		int result = largest-smallest;
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
