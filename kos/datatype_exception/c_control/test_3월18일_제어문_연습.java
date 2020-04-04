package c_control;

import java.util.Scanner;

public class test_3월18일_제어문_연습 {

	public static void main(String[] args) {
		/*
		 * 정사각형의 한 변의 길이 n을 입력받은 후 
		 * n x n 로 된 정사각형 형태로 숫자를 출력하는 프로그램
		 * 위에서 아래로 진행하고 바로 오른쪽 위에서 아래로 진행하는 방법
		 * 4
		 * 
		 * 1 5 9  13
		 * 2 6 10 14
		 * 3 7 11 15 
		 * 4 8 12 16
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 *  풀이
		 *  1부터 n을 더한 수를 n만큼 출력하는 프로그램을 
		 *  n 번 반복하는 프로그램
		 *  예를 들어 4가 들어가면 1부터 n+4 씩 늘어난다.
		 *  좌표..? 
		 */
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for(int j=0 ; j<N; j++) {
			int O = j+1; // 이 변수가 초기화 되면서 위의 j 값과 합쳐진다. 그래서 다음 행의 처음 수가 1증가한다. -> 이게 포인트
			
			for(int i=0; i<N; i++) {
				
				System.out.printf(" " + O );
				O+=N;
				
			}
			System.out.println();
			
		}
		
		
	
		
		
		
		

	}

}
