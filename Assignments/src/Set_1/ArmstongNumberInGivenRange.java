package Set_1;

import java.util.Scanner;

public class ArmstongNumberInGivenRange {

	public static void getNum(int a, int b) {
		
		for(int i=a;i<=b;i++) {
			boolean flag = check(i);
			if(flag) {
				System.out.println(i);
			}
		}
		
	}
	public static boolean check(int num) {
		
		int sum = 0;
		int length = String.valueOf(num).length();
		int temp = num;
		while(num!=0) {
			int rem = num%10;
			sum = (int) (sum + Math.pow(rem, length));
			num = num/10;			
		}
		return sum==temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Number");
	    int number1 = sc.nextInt();
	    System.out.println("Enter End Number");
	    int number2 = sc.nextInt();
	    
	    getNum(number1, number2);
	}

}
