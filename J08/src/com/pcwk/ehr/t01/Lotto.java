package com.pcwk.ehr.t01;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		boolean[] used=new boolean[45];
		
		int[]numbers =new int[6];
		
		
		for(int i=0;i<numbers.length;i++) {
			//System.out.println(numbers[i]);
			int randNumber;
			
			do {
				randNumber = (int)(Math.random()*45)+1;
			}while(used[randNumber]);//// 이미 선택된 숫자인 경우 다시 선택합니다.
			
			numbers[i] = randNumber;
			used[randNumber] = true;//선택된 숫자
		}
		
		Arrays.sort(numbers);
		
		for(int number: numbers) {
			System.out.print(number+" ");
		}

	}

}















