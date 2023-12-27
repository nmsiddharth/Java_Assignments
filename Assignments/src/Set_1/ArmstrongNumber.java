package Set_1;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static String check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int sum = 0;
		int length = String.valueOf(num).length();
		int temp = num;
		while(num!=0) {
			int rem = num%10;
			sum = (int) (sum + Math.pow(rem, length));
			num = num/10;			
		}
		if(sum==temp) {
			return temp+" is Armstrong Number";
		}
		return temp+" is not Armstrong Number";
	}
	
//	public static String operate() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Lower Range");
//		int lower = sc.nextInt();
//		System.out.println("Enter the Higher Range");
//		int higher = sc.nextInt();
//		
//	for(int i=lower;i<higher;i++) {
//		int rem =
//	}
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ArmstrongNumber.check());
	}

}
