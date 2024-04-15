package com.pcwk.quiz;

public class Q2 {
    // 버블 정렬 메소드
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // 인접한 요소들을 비교하여 정렬
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    //내용 출력
    static void disp(int[] arr) {
		for(int number: arr) {
			System.out.print(number+" ");
		}
    }
    
	public static void main(String[] args) {
		int MAX_NUM = 50;
		boolean[] used=new boolean[MAX_NUM];
		
		int[]numbers =new int[6];
		
		for(int i=0;i<numbers.length;i++) {//숫자 6개 출력
			//System.out.println(numbers[i]);
			int randNumber;
			
			do {
				randNumber = (int)(Math.random()*MAX_NUM);//0<=randNumber <50
			}while(used[randNumber]);//// 이미 선택된 숫자인 경우 다시 선택합니다.
			
			numbers[i] = randNumber+1;
			used[randNumber] = true;//선택된 숫자
		}
		
		//소트전
		disp(numbers);
		System.out.println();
        //버블소트
		bubbleSort(numbers);
		System.out.println();
		//소트후
		disp(numbers);		


	}

}
