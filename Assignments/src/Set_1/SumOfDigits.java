package Set_1;

import java.util.Scanner;

public class SumOfDigits {
	
 public static int check() {
	 int sum = 0;
	 Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
	    int number = sc.nextInt();
	    
	  while(number>0) {
		  	int rem = number%10;
		  	sum = sum+rem;
		  	number = number/10;
	  }
	  return sum;
	    
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = SumOfDigits.check();
		System.out.println(result);
		
	}

}
