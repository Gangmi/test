package 반복문연습;

import java.util.Scanner;

public class For연습문제10 {

	public static void main(String[] args) {
		/*
		 * 사각형의 높이 n 과 너비 m 을 입력받은 후 n 행 m 열의 사각형 형태로 1부터 n*m 번 까지 
		 * 숫자가 차례 대로 출력되는 프로그램을 작성하시오.
		 * 너비 m
		 * 높이 n
		 * 정사각형
		 * nm 의범위는 100이하의 정수
		 * 숫자 사이는 공백
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * Scanner 를 통해 정수 n 과 m 을 받아서 저장 한다.
		 * n번 반복되는 코드를 작성하고
		 * 그 안에 1부터 n*m 까지 출력되는 코드를 작성
		 * n번째 줄 마다 줄바꿈을 해야하고 
		 * 더해지는 값은 저장해서 다음 값에 사용 해야 함
		 * 
		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("높이 n 값을 넣어 주세요 ->");
		int n = input.nextInt();

		System.out.println("넓이 m 값을 넣어 주세요 ->");
		int m = input.nextInt();
		int add = 0;
		for(int i=0; i<n ; i++) {
			for(int j= 1; j<=m; j++) {
				++add;
				
				System.out.print(add+" ");
				
			}
			System.out.println();
		}
		

	}

}
