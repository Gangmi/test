package 반복문연습;

import java.util.Scanner;

public class For_연습문제9 {

	public static void main(String[] args) {
		/*
		 * 자연수 n을 입력 받아
		 *  ex) 
		 * 3일경우 
		 * 1 2 3 
		 *   4 5 
		 *     6 이 출력 되는 프로그램을 작성 하시오
		 * 
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 풀이 
		 * Sacnner 를 통해서 자연수 n을 입력 받는다. 
		 * 위에서 부터 n번 반복되는 코드를 작성하고
		 * 변수 add 를 잡아서 한 번 반복문이 실행 될 때 마다 
		 * 그 값이 add에 저장되어서 다음줄을 실행 할 때도 그 값이 유지 되게 
		 * 그리고 한 번 사이클이 돌면 n n-1 n-2 순으로 공백이 생기도록 만든다.
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int add = 0;
		for (int j = 1; j<=N; j++) {
			for(int c =1; c<j; c++) { // 첫번째 공백이 0 그다음 1 ...n 까지 증가. -> 첫번째는 실행이 안 돼야돼
				System.out.print("  ");
			}
			for (int i = 0; i <= N-j; i++) { // j값을 이용해서 1번 루프가 돌때마다 i값이 나올 수 있는 범위를 줄여서 for문이 사이클마다 한 번 씩 덜 실행 되게 하려고
				++add;
				if(add<10) {
					System.out.print(" "+add);
					
				}if(add>=10) {
					System.out.print(add);
				}
				
				}

			System.out.println();
			}
		}

	}


