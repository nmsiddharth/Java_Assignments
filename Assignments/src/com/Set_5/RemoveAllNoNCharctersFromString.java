package com.Set_5;

public class RemoveAllNoNCharctersFromString {

	public static void check() {
		String str = "Cris2342tia23@no";
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<sb.length();) {
			 if (!((sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') || (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z'))){
				sb.deleteCharAt(i);
			}else {
				i++;
			}
		}
		System.out.println(sb);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

}
