package com.Set_3;

import java.util.Scanner;

public class ReverseAnArray {

	public static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		int arr [] = new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
