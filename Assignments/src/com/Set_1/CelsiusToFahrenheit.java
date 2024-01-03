package com.Set_1;

import java.util.Scanner;

class Temp{
	
	public float check() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Celsius temperature");
	int celsius = sc.nextInt();
	
	return (celsius * 9/5) + 32 ;
}
}
public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp obj = new Temp();
		float result = obj.check();
		System.out.println(result+" F");
		

	}

}
