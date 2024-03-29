package com.pcwk.ehr.t01;

public class ScoreCalc {

	public static void main(String[] args) {
        // 학생 수와 문제 수를 설정합니다.
        final int NUM_STUDENTS = 5;
        final int NUM_QUESTIONS = 5;

        // 각 학생의 점수를 고정된 2차원 배열로 초기화합니다.
        int[][] scores = {
            {80, 75, 90, 85, 70}, // 학생 1의 점수
            {85, 90, 85, 80, 75}, // 학생 2의 점수
            {90, 95, 80, 85, 90}, // 학생 3의 점수
            {75, 80, 85, 90, 95}, // 학생 4의 점수
            {70, 85, 90, 95, 80}  // 학생 5의 점수
        };

        // 각 학생의 총점과 평균을 계산하여 출력합니다.
        for (int i = 0; i < NUM_STUDENTS; i++) {
            int totalScore = 0;
            for (int j = 0; j < NUM_QUESTIONS; j++) {
                totalScore += scores[i][j];
            }
            double averageScore = (double) totalScore / NUM_QUESTIONS;
            System.out.println("학생 " + (i + 1) + "의 총점: " + totalScore);
            System.out.println("학생 " + (i + 1) + "의 평균 점수: " + averageScore);
        }
    }
}
