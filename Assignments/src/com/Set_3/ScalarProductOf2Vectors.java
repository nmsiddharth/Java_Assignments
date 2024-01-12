package com.Set_3;

import java.util.Arrays;
import java.util.Collections;

public class ScalarProductOf2Vectors {

	public static int check() {
		int arr1[] = {10,30,40,20};
		Integer arr2[] = {2,4,5,1};
		Arrays.sort(arr1);
		Arrays.sort(arr2, Collections.reverseOrder());
		
		int sum = 0;
		for(int i=0;i<arr1.length;i++) {
			sum += arr1[i]*arr2[i]; 
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = check();
		System.out.println(result);

	}

}
