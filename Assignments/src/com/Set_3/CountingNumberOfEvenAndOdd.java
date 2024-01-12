package com.Set_3;

public class CountingNumberOfEvenAndOdd {

	public static void check() {
		int arr[] = {1,2,3,4,5,6,7,8};
		int count =0;
		int temp = 0;
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				temp++;		
			}else {
				count++;
			}
		
		}
		System.out.println("Even numbers : "+ temp + " Odd numbers : "+ count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
