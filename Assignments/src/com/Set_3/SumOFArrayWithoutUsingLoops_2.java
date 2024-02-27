package com.Set_3;

public class SumOFArrayWithoutUsingLoops_2 {
	static int sum=0;
   public static int printSum(int[] arr,int n) {
	   if(n==0) return sum;
	   sum=sum+arr[n-1];
	  return  printSum(arr, n-1);
   }
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		System.out.println(printSum(arr, arr.length));

	}

}
