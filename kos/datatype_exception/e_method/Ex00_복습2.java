package e_method;

import java.util.Scanner;

public class Ex00_복습2 {
	static int jumsu;

	public static void main(String[] args) {
		String result =func();
		// 여기서 합격 여부를 출력하려면?
		System.out.println("결과 :" + result);
		
		method();
	}

	/** 
	 * method1
	 *  	- 점수를 입력받아 합격여부 확인하는 메소드
	 */
	static  String func() {
		Scanner in = new Scanner(System.in);		
		jumsu = in.nextInt();
		if( jumsu >= 80) return "합격";
		else return "불합격";
	}
	
	/**
	 * 점수를 넘겨받아 성적을 구하는 메소드
	 * @return 
	 */
	static void method() { 
		if(jumsu>=90) {// 점수는 이미 선언 되어있다 멤버변수로
			System.out.println("A학점");		
		}else if(jumsu>=80) {
			System.out.println("B학점");
		}else if(jumsu>=70) {
			System.out.println("C학점");
		}else if(jumsu>=60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
		//switch case 문으로도 표현이 가능하다. break를 빼 먹지 말것.
		
		
	
	}

}
