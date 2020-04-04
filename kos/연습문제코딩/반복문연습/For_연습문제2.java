package 반복문연습;

import java.util.Scanner;

public class For_연습문제2 {

	public static void main(String[] args) {
		
		/* 문제2) 문자열 처리하기 문자 N 을 입력 받아 N 이 소문자면 a부터 N 까지 인쇄하고
		 * 		 N이 대문자면 문자 N 부터 Z 까지 출력하라. 
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 *  풀이 
		 * N을 입력 받기 위한 통로를 열고 N 을 입력 받아 문자형 변수 char 에 저장한다.
		 * 이 문자의 범위가 소문자인지 대문자인지 판단하여 반복문을 사용해 출력한다.
		 * 
		 * 
		 *
		 */
		Scanner input = new Scanner (System.in);
		char N = input.next().charAt(0);
		
		if(N>='a' && N<='z') {
			for(char ch = 'a'; ch<=N; ch ++) {
				System.out.print(ch);
			}
		}else if(N>='A' && N<='Z') {
			for(char ch= N; ch<='Z'; ch++ ) {
				System.out.print(ch);
			}
		}else {
			System.out.println("Error");
		}
		

	}

}
