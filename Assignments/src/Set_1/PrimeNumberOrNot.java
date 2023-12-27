package Set_1;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void check() {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Number");
	    int number = sc.nextInt();
	    
	    for(int i=2;i<=number/2;i++) {
	    	if(number%i==0) {
	    		flag = false;
	    	}
	    }
	    if(flag) {
	    	System.out.println("Prime Number");
	    }else {
	    	System.out.println(" Not a Prime Number");
	    }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberOrNot.check();

	}

}
