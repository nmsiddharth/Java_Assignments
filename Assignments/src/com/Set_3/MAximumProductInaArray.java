package com.Set_3;

public class MAximumProductInaArray {

	public static int check() {
		int arr[] = { 10, -20, -30, 0, 70, -80, -20 };
		
		int left = 1;
		int right =1;
		int n = arr.length;
		int result = arr[0]; 
		
		for(int i=0;i<n;i++) {
			left = left ==0 ? 1:left;
			right = right == 0 ? 1:right;
			
			left *= arr[i];
			right *= arr[n-1-i];
			
			result = Math.max(result, Math.max(left, right));
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check());

	}

}
