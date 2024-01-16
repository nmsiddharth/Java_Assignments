package com.Set_3;

import java.util.Arrays;

public class ArraysAreDisjointOrNot {

	public static void check() {
		int arr1[] = {11, 1, 13, 21, 3, 7};
		int arr2[] = {11, 3, 7, 1};
	     
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		boolean flag = true;
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr2[i]==arr1[j]) {
					break;
				}
				if(j==arr1.length-1) {
					flag=false;
				}
			}
		}
		if(flag==true) {
			System.out.println("Arr2 is Subset of Arr1");
		}else {
			System.out.println("Arr2 is not Subset of Arr1");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
