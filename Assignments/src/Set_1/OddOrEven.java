package Set_1;

import java.util.Scanner;

public class OddOrEven {
	public static String check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
	    int number = sc.nextInt();
	    

	    if(number%2==0) {
	    	return "Even Number";
	    }else {
	    	return "Odd Number";
	
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(OddOrEven.check());
	}

}
