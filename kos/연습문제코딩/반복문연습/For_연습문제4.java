package 반복문연습;

import java.util.Scanner;

public class For_연습문제4 {

	public static void main(String[] args) {
		/*
		 * 문제4 ) 자연수 n 을 입력 받아  
		 *     1
		 *   1 2
		 * 1 2 3
		 *  과같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.   
		 *   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 *   풀이
		 *   
		 *   스캐너를 통해서 값을 입력 받고 저장한 뒤에
		 *   
		 *   먼저 
		 *   1
		 *   12
		 *   123 
		 *   을 출력하는 프로그램을 짠다.
		 *   
		 *   입력 받은 자연수 n 에 따라서
		 *   총 n번 반복 되어야 하고
		 *   1번 실행 될 때 마다 값이 늘어나야 한다.
		 *   그리고 공백을 주는 for 구문을 더한다.
		 *    
		 *   
		 *   
		 *   
		 */
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		//입력 받은 자연수 n에 대해 n번 반복 되는 프로그램
		for(int i=0; i<=N; i++) {
			for(int c =0 ; c<=(N-i); c++ ) {  // 공백을 준다. 왜 이렇게 하냐? 맨 위에서 총 n-1개의 공백이 필요하고
				System.out.print("  ");	      // 이 for 반복문이 한 번 실행 될 때 마다 하나씩 공백이 생기기 때문이다.
				
				 
				
			}
			for(int j=1; j<=i ; j++) { // 위에있는 for 구문의 변수가 N 값에 따라서 변하니까 아래에 j 역시 i가 늘어나는 만큼만 늘어나면,
									   // N번째 숫자까지 순서에 따라서 나열 할 수 있다.
				System.out.print(j + " ");
			}
			System.out.println();
		}
	
		
		
	
		 

	}

}
