package com.Set_1;

import java.util.Scanner;

public class DescendingOrderOfArray {

	public static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the elements");
		for(int s=0;s<size;s++) {
			arr[s]= sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			
		}
		
		for(int data:arr) {
			System.out.print(data+" ");
		}
		//return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DescendingOrderOfArray.check();

	}

}
