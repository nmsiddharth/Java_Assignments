package com.Set_2;

import java.util.Scanner;

public class NumberToWords {

	public static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		if(num<0 || num>9999) {
			System.out.println("Invalid");
		}else {
			int a = num%10;           // last digit
			int b = num/10;
			int c = b%10;           // second last digit
			int g = num/100;
			int d = g%10;         // third last digit
			int e = num/1000;    // first digit
			
			String sD[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
			String ty[] = {"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
			String h = "Hundred";
			String th = "Thousand";
			
			if(num>0 && num<20) {
				System.out.println(sD[num]);
			}else if(num>19 && num<100) {
				System.out.println(ty[c]+ " "+ sD[a]);
			}else if(num>99 && num<1000) {
				System.out.println(sD[d]+" "+h+" "+ty[c]+" "+sD[a]);
			}else {
				System.out.println(sD[e]+" "+th+" "+sD[d]+" "+h+" "+ty[c]+" "+sD[a]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberToWords.check();
	}

}
