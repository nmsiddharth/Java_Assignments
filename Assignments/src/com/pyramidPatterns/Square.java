package com.pyramidPatterns;

public class Square {

	public static void main(String[] args) {
		int rows = 5;
		int cols = 5;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
