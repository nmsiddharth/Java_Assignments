package Set_1;

import java.util.Scanner;

public class GreatestOf2 {
	public static String check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
	    int number1 = sc.nextInt();
	    System.out.println("Enter Second Number");
	    int number2 = sc.nextInt();
	    
	    if(number1>number2) {
	    	return number1+" is Greatest Number";
	    }
	    	return number2+" is Greatest Number";
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = GreatestOf2.check();
		System.out.println(result);
	}

}
