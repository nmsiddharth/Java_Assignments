package com.set_4;

public class MinOpeationsRequiredToMakeArrayalindrome {

	public static int check() {
		int[] arr = {1,4,5,9,1};
		int count = 0;
		int n = arr.length;
		
		for(int i =0, j=n-1; i<=j;) {
			if(arr[i]==arr[j]) {
				i++;
				j--;
				
			}else if(arr[i]>arr[j]) {
				j--;
				arr[j]+=arr[j+1];
				count++;
			}else {
				i++;
				arr[i]+=arr[1];
				count++;
			}
				
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check());

	}

}
