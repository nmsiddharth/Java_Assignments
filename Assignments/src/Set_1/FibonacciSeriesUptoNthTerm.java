package Set_1;

import java.util.Scanner;

public class FibonacciSeriesUptoNthTerm {

	public static void check() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int t;
		System.out.print(a+", "+b+", ");
		for(int i=2;i<=num;i++) {
			t = a+b;
			a=b;
			b=t;
			System.out.print(t+", ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeriesUptoNthTerm.check();

	}

}
