package com.Set_3;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallestInArray {

	public static String check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		return "Smallest Element = "+arr[0] +" Largest Element = "+ arr[arr.length-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LargestAndSmallestInArray.check());
	}

}
