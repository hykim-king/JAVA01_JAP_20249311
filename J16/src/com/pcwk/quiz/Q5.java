package com.pcwk.quiz;

public class Q5 {

	public static void main(String[] args) {
		String data = "1,Alice,80,90,95|2,Bob,80,90,95|3,Charlie,80,90,95";
		
		int [][]score= {
				{80,90,95},
				{80,90,95},
				{80,90,95}
		};
	
		int korToral = 0;
		int engTotal = 0;
		int mathToal = 0;
		
		String space= "    ";
		System.out.printf("번호%s이름%s 국어%s영어%s수학%s총점%s평균%s\n" ,space,space,space,space,space,space,space);
		System.out.println("=============================================");
		
		String[] students = data.split("\\|");
		
		for(int i=0; i<score.length; i++) {
			int sum =0;
			double avg = 0.0d;
			
			
			String[] info = students[i].split(",");
			System.out.printf("%5s%7s", info[0], info[1]);
			
			korToral += score[i][0];
			engTotal += score[i][1];
			mathToal += score[i][2];
			
			System.out.printf("%5d", i+1);
			for(int j=0;j<score.length;j++) {
				sum += score[i][j];
				System.out.printf("%5d",score[i][j]);
			}
			avg = sum / (score[i].length * 1.0d);
			System.out.printf("%5d  %5.1f%n", sum,avg);
		}
		System.out.println("=============================================");
		System.out.printf("총점: %5d%5d%5d \n",korToral, engTotal,mathToal);
	}

}
