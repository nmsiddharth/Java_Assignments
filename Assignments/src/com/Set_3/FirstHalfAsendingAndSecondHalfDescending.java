package com.Set_3;

import java.util.Scanner;

public class FirstHalfAsendingAndSecondHalfDescending {

	public static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		int arr [] = new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length/2;i++) {
			for(int j=i+1;j<arr.length/2;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=arr.length/2;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp1;
				}
			}
		}
		
		for(int data:arr) {
			System.out.println(data);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
