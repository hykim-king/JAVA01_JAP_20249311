package com.pcwk.quiz;

import java.util.Arrays;
import java.util.Random;

public class Qtmp2 {

	public static void main(String[] args) {
		int[] lotto = new int[50];	
		
		for(int i = 0; i < lotto.length; i++) {		
			lotto[i]=i+1;
				
		}
		for(int i=0;i<=100;i++) {
			int num = (int)(Math.random()*50);
				int value = lotto[0];
				lotto[0] = lotto[num];
				lotto[num] = value;
				
		}
		
		for(int i=0;i<7;i++) {
			for(int j=0;j<6-i;j++) {
				if(lotto[j] < lotto[j+1]) {
					int tmp = lotto[j];					
					lotto[j] = lotto[j+1];
					lotto[j+1] = tmp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<6;i++)
			System.out.println(lotto[i]);
		
	}
}