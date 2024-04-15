package com.pcwk.quiz;

public class Qtmp3 {

	public static void main(String[] args) {

		int n = 1;
		int sum = 0;
		int totalSum = 0;

		while (n <= 10) {

			sum = 0;
			int i = 1;

			while (i <= n) {
				System.out.print(i + ",");
				sum = sum + i;
				i++;
			}
			System.out.print(" " + sum);
			System.out.println();
			totalSum = totalSum + sum;
			n++;

		}
		System.out.println("최종합:" + totalSum);
	}
}