package com.Set_2;

import java.util.Scanner;

public class AreaOfCircle {

	public static double Area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Radius");
	    int number = sc.nextInt();
	    
	    return Math.PI * Math.pow(number, 2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AreaOfCircle.Area());
	}

}
