package b_operator;

import java.util.Scanner;

/**
 *  두 정수를 입력받아 사칙연산과 나머지 연산을 수행한 결과를 출력한다
 */

// 나머지 연산자 활용 - 홀/짝수 구하기

public class Ex03_Arithmetic {

	public static void main(String[] args) { 
		//		
		//		Scanner input = new Scanner(System.in);
		//		System.out.println("수를 입력 해 주세요 - >");
		//		int a = input.nextInt();
		//		System.out.println("수를 입력 해 주세요2 - >");
		//		int b = input.nextInt();
		//		
		//		int sum = a+b;
		//		int min = a-b;
		//		int multy = a*b;
		//		double divide = (double)a/b;
		//		double temp = a%b;
		//		
		//		System.out.println("합 :" +sum);
		//		System.out.println("차 :" +min);
		//		System.out.println("곱 :"+ multy);
		//		System.out.println("나누기 :"+ divide);
		//		System.out.println("나머지 :"+ temp);

		//나머지 연산자 활용 - 홀 / 짝수 구하기

		//(1)정수형 변수 su 선언
		//(2) scanner 선언
		//(3) 화면에 "정수를 입력하세요" 출력
		//(4) 입력 받은 정수를 su 변수에 저장


		//		
		//		Scanner input = new Scanner(System.in);// 스캐너는 이미 만들어 져 있는 것 java.util 에 있는..
		//		System.out.println("정수를 입력 하세요");
		//		int su = input.nextInt();
		//		//(5)입력받은 수가 홀수인지 짝수인지 구하고 싶다.
		//		if(su%2 == 0) { // su를 2로 나눴을 때 나머지가 0이라면, 이라는 뜻
		//			System.out.println("짝수");
		//			
		//		}else {
		//			System.out.println("홀수");
		//		}

		//(6) 입력받은 수가 3의 배수인지 아닌지 확인.

		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력 하세요");
		int su = input.nextInt();

		if(su%3 == 0) { 
			System.out.println("3의배수");

		}else {
			System.out.println("3의배수가 아님");
		}











	}

}
