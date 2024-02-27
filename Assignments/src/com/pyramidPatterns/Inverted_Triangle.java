package com.pyramidPatterns;

public class Inverted_Triangle {

	public static void main(String[] args) {
int rows = 5;
		
		for(int i=rows;i>=1;i--) {
			for(int k =rows-i;k>=1;k--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}



	}

}
