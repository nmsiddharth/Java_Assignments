package com.Set_3;

public class SymmetricPairs {

	public static void check() {
		int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
		
		System.out.println("Symmetric pairs are : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]) {
					System.out.print("("+arr[i][0]+"," +arr[i][1]+")");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

}
