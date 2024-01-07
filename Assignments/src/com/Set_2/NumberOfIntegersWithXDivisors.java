package com.Set_2;

import java.util.Scanner;

public class NumberOfIntegersWithXDivisors {

	public static int getDiv(int n) {
		int count =0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
	}
	
		public static void check(int num, int x) {
			
			int c = 0;
			for(int i=1;i<=num;i++) {
				if(getDiv(i)== x) {
					System.out.println("Integers are :"+i);
					c++;
				}
				
			}
			System.out.println("Total Numbers having "+x+" divisors is = "+c);
			
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		System.out.println("Enter X :");
		int x = sc.nextInt();
		
		NumberOfIntegersWithXDivisors.check(num, x);

	}

}
