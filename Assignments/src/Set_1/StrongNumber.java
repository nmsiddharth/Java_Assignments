package Set_1;

import java.util.Scanner;

public class StrongNumber {

	public static int getFactorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		return fact;
		
	}
	
	public static int getStrong(int number) {
		int sum = 0;
		while(number>0) {
			int rem = number%10;
		int x = StrongNumber.getFactorial(rem);
			sum = sum + x;
			number = number/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		int temp = number;
		int strongResult = StrongNumber.getStrong(number);
		
		
		if(temp==strongResult) {
			System.out.println(temp+" is Strong Number");
		}
		else {
			System.out.println(temp+" is not Strong Number");
		}
		

	}

}
