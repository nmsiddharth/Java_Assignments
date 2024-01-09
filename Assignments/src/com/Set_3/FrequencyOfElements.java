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
		
		int freq[] = new int[arr.length];
		int visited = -1;
		
		
		for(int i=0;i<arr.length;i++) {
			int count =1;                    //count declared inside for loop bcoz it resets for every new element
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited) {
				freq[i]=count;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(freq[i]!=visited) {
				System.out.println("Frequency of "+arr[i]+" : "+freq[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

}
