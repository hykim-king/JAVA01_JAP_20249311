package com.pcwk.ehr.ed04;

public class Q05 {

	public static void main(String[] args) {
		String str= "12345";
		
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			System.out.printf("%c%n",ch);//char -> 숫자
			int num = ch - '0';
			//49 - 48
			//50 - 48
			//System.out.printf("%d%n",num);
			sum +=num;
		}
		
		System.out.println("sum="+sum);

	}

}
//1
//2
//3
//4
//5
//sum=15