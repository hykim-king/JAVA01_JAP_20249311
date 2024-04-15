package com.pcwk.quiz;

import java.util.Arrays;

public class Qtmp5 {

	public static void main(String[] args) {
    	String data = "1,Alice,80,90,95|2,Bob,80,90,95|3,Charlie,80,90,95";
        String[] records = data.split("\\|");
        
        System.out.printf("%-5s %-10s %-5s %-5s %-5s %-5s %-5s\n", "번호",   "이름",   "국어",  "영어",  "수학",  "총점",  "평균");
        System.out.println("=============================================");
        
        for (String record : records) {
            String[] fields = record.split(",");
            int num = Integer.parseInt(fields[0]);
            String name = fields[1];
            
            int kor = Integer.parseInt(fields[2]);
            int eng = Integer.parseInt(fields[3]);
            int math = Integer.parseInt(fields[4]);
            int total = kor + eng + math;
            double average = (double)total / 3;
            System.out.printf("%-5d %-10s %-5d %-5d %-5d %-5d %.1f\n", num, name, kor, eng, math, total, average);
        }
    }
}
