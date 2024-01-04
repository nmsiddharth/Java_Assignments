package com.Set_2;

import java.util.Scanner;

public class HandShake {

	public static int check() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of Persons");
        int number = sc.nextInt();
        
        return ((number-1)*number)/2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(HandShake.check());
	}

}
