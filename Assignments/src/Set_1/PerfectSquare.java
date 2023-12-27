package Set_1;

import java.util.Scanner;

public class PerfectSquare {

	public static void getPerfect() {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		for(int i=1;i<num;i++) {
			if(num/i==i) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println(num+" is Perfect Square");
		}
		else {
			System.out.println(num+" is not Perfect Square");

		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectSquare.getPerfect();
		
		
	}
}
