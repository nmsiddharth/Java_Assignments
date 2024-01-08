package com.Set_3;

import java.util.Scanner;

public class SumOfElementsInArray {

	public static int check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		int arr [] = new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			 sum = sum +arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumOfElementsInArray.check());

	}

}
