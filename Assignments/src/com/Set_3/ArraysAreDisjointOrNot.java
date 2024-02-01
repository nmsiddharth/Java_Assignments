package com.Set_3;

import java.util.Arrays;

public class ArraysAreDisjointOrNot {

	public static void check() {
		   int arr1[] = { 15, 14, 91,9, 1 };
		      int arr2[] = { 24, 5, 21, 85 };
		
		
		boolean flag = false;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					flag=true;
					break;
				}
			}
		}
		if (flag == true) {
		    System.out.println("The arrays are not disjoint");
		} else {
		    System.out.println("The arrays are disjoint");
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
