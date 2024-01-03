package com.Set_2;

import java.util.Scanner;

public class Quadrants {

	public static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("X = ");
		int x = sc.nextInt();
		System.out.println("Y = ");
		int y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("First");
		}else if(x<0 && y>0) {
			System.out.println("Second");
		}else if(x>0 && y<0) {
			System.out.println("Third");
		}else {
			System.out.println("Fourth");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

}
