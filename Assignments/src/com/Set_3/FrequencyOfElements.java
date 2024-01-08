package com.Set_3;

import java.util.Scanner;

public class FrequencyOfElements {

	public static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		int arr [] = new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int count =0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

}
