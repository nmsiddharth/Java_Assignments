package Set_1;

import java.util.Scanner;

public class FriendlyNumber {

	public static int getFriendly(int n) {
		int sum = 0;
		
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum = sum+i;
			}
		}
		return sum;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		int temp1 = FriendlyNumber.getFriendly(num1);
		int temp2 = FriendlyNumber.getFriendly(num2);
		
		if((double) temp1/num1 == (double) temp2/num2) {     // Double is used because the ratios might not be integers in general.                  
			                                                                
			System.out.println(num1 +" and "+ num2 +" are Friendly Number");
		}else {
			System.out.println(num1 +" and "+ num2 +" are not Friendly Number");
		}
	}

}
