package 반복문연습;

import java.util.Scanner;
import java.util.StringTokenizer;

public class while_연습문제1_짝수와홀수의갯수 {
	public static void main(String[] args) {
		/*
		 * 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오
		 *
		 *입력 예
		 *10 20 39 41
		 *
		 *짝수 2
		 *홀수 2
		 *
		 *ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 *풀이.
		 *Scanner를 통해 정수를 입력 받는데
		 *이 정수들을 하나의 토큰으로 처리하는 Scanner의 메소드도 가져올 것이다.
		 *
		 * 
		 * 
		 */
		Scanner input= new Scanner(System.in);
		String a = input.nextLine();
		StringTokenizer st= new StringTokenizer(a);
		int even =0;
		int odd =0;
		while(st.hasMoreTokens()) {
			String now=st.nextToken();
			int token = Integer.parseInt(now);
			
			if(token%2==0) {
				even++;
				
				
			}else {
				odd++;
			}
		}
		System.out.println(odd);
		System.out.println(even);
		
		
		
		
		
	}

}
