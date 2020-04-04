package b_operator;

import java.util.Scanner;

public class Ex09_Samhang { // (조건) ? A : B  => 조건이 참이면 A 거짓이면 B 로 출력된다.
	

	public static void main(String[] args) {
		
		// a, b를 입력받아 두 수 중 큰 수를 출력
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 수를 입력->");
		int a = input.nextInt();
		System.out.print("두번째 수를 입력->");
		int b = input.nextInt();
		
		// 삼항연산자를 사용하면 간단한 조건문을 만들 수 있다.
		int max = (a>b) ? a:b; // 삼항연산자를 저장할 변수를 선언한다. a가 크면 뒤의 a 를 출력 그렇지 않으면 b를 출력
		
	
		System.out.println(max + "가 큰 수 ");
		
		
		
	}

}
