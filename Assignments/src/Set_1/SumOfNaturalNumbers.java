package Set_1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void check() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
	    int number = sc.nextInt();
	    
		for(int i=1;i<=number;i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNaturalNumbers.check();

	}

}
