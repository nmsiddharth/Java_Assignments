package com.Set_1;

import java.util.Scanner;

public class NthTermFiboacciSeries {

	public static void check() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int f= 0;
		int s = 1;
		int t=0;
		
		for(int i=2;i<=num;i++) {
			t = f+s;
			f =s;
			s=t;
			
		}
		System.out.println(t);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NthTermFiboacciSeries.check();

	}

}
