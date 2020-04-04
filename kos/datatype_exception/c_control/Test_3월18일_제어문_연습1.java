package c_control;

import java.util.Scanner;

public class Test_3월18일_제어문_연습1 {

	public static void main(String[] args) {
		/*
		 * 문제 
		 * 사각형의 높이 n 과 너비 m 을입력 받은 후 사각현 내부에 지그재그
		 * 형태로 1부터 n*m번 까지 숫자가 차례대로 출력되는 프로그램을 작성하시오.
		 * 사각형의 높이 n 과 너비 m (100 이하의 정수)
		 * 
		 * 숫자 사이는 공백으로 구분한다.
		 * 
		 * 
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * Scanner를 통해 높이 n과 너비 m 을 받아 저장한다.
		 * 높이 n 만큼 반복되는 코드를 만들고
		 * 거기서 홀수행에는 1증가
		 * 짝수행에는 1감소
		 * 
		 * 넓이 n 이 진행되는 동안 늘어나는 값을 저장하는 변수 지정 필요
		 * n 이후 공백이 n-1개 n-2개 n-x >=0 까지 생기는 코드가 필요 
		 *  첫줄부터 만들어야 함
		 *  1 2 3 4 i =1
		 *  8 7 6 5 i =2
		 *  9 10 11 12 i=3
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("높이를 입력 해 주세요");
		int n = input.nextInt();

		System.out.println(" 넓이를 입력 해 주세요");
		int m = input.nextInt();
		int ad = 0;
		
		for (int i = 1; i <= n; i++) {// i 값이 증가함에 따라서 행이 늘어나는 코드
			

			if (i % 2 == 1) { // 홀수일 경우
				for (int j = 0; j < m; j++) { //3번째 줄에 .. i = 3/ 현재 ad =4  9 10 11 12
					                          // 현재  add 값이 4야 그걸 곱해 i 랑? 
					++ad;
					System.out.print(ad+" ");
				}
			} else if (i % 2 == 0) {
				for (int k = 0; k <m ; k++) { // 행이 짝수 라면, 현재 i값이 2겠지..
					int evenval = i*m;
					System.out.print(evenval-k +" ");     //이 코드를 m번 반복해야 함 짝수줄은 i *m (i*m-1) (i*m)-2 m-3 m-m
					
					if(evenval-k == evenval) { // i*m 을 보존하려고 짝수층 행렬이 가로곱하기 세로일 때 값을 저장 해 놓는다. // 다음 홀수 열이 시작 될 때
						                       // 그 수를 가져다 쓰려고.
						ad=evenval;
					}
				
				}
				
			}
			System.out.println();
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}




