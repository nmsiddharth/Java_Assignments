package Set_1;

import java.util.Scanner;

public class PalindromeNumber {

	public static String check() {
		int rev = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int temp = num;
		while(num>0) {
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		if(temp==rev) {
			return temp+" is palindrome Number";
		}
		return temp+" is not palindrome Number";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PalindromeNumber.check());
	}

}
