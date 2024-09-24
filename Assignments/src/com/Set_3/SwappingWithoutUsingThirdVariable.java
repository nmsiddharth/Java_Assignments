package com.Set_3;

public class SwappingWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		b = a+b;
		a = b-a;
		b=b-a;
		System.out.println(a+" "+b);

	}

}
