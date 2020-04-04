package c_control;

import java.util.Scanner;

public class Test_3월18일_제어문_연습2 {

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
		 *  1 2 3 4 
		 *  8 7 6 5 
		 *  9 10 11 12 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		// n은 가로 m 은 세로로 하자.
		int add = 0; // add 를 0 으로 잡고 식이 시작 될 때 바로 더해주면서 출력하면 1이나옴. 반복하면 n 까지 뽑을 수 있음
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) { // 홀수열
				for (int j = 0; j < m; j++) {
					++add; 
					System.out.print(add);
					
				}
				add+=n; // 홀수 열이 끝 날 때 n 을 더해서 add 값이 n만큼 많은 상태로 시작하게 만들어줌
				
			} else {
				for (int k = 0; k < m; k++) { // 실행되면서 1씩 감소하고 그숫자는 사라지게
					int x=add; // 변수 x 를 잡아서 add를 잠시 저장하고 k값에 따라서 1씩 빼줌
							   // 이렇게 함으로서 add 값을 건드리지 않고 여기서만 k값만큼 빼 줄수 있음 k 의 범위가 m 이므로 
							   // 조건에도 부합
							// 만들어진 변수를 경우에 따라 가져오고 그걸 조건에 맞을때만 쓰는 접근방법이 필요 함.
					
					
					System.out.print(x-k);
						
				}
				
			}
			System.out.println();
			
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		

