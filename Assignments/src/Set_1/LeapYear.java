package Set_1;

import java.util.Scanner;

class LY{
	public String check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = sc.nextInt();
		
		if((year%400 == 0) || ((year%100 != 0) && (year%4 == 0)) ) {
			return "Entered Year is leap year";
		}
		return "Entered Year is not leap year"; 
	}
}
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LY obj = new LY();
		String result = obj.check();
		System.out.println(result);

	}

}
