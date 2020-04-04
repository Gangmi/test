package e_method;

import java.util.Scanner;

public class Ex02_연습 {

	public static void main(String[] args) {
		/*
		 * (문제 1) 영문자를 입력하여 이 문자가 소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오. 함수명 :
		 * checkLower 인자 : char 리턴(반환) : boolean
		 * 
		 *
		 * 
		 */
		//문자입력을 받는다
		Scanner input = new Scanner(System.in);
		System.out.println("문자를 입력 해 주세요");
		char ch = input.next().charAt(0); // 문자형을 받아올 순 없다 기억하자.
		
		
		
		
		
		
		
		
		//함수 호출
		boolean result =checkLower(ch); // 함수에서 나온 결과값을 boolean result 에 저장한다.
		//출력
		if(result)System.out.println("소문자"); //boolean 형이라서 비교가 필요가 없다.

		else{
			System.out.println("소문자 아님."); 
		}
		

	}
	static boolean checkLower(char ch) { //우리가 받은 문자열을 문자로 변환해서 함수에 대입한다. 문자형으로 받은 변수를 ch라는 문자형 변수를 선언한다는 뜻 
										 //인수를 넘겨 인자로 받는다.
		//넘겨 받은 인자 값이 소문자라면 return true
		if(ch>='a'&&ch<='z') { // 아스키코드에서 알파벳 소문자의 값이 더 크다.
			return true;
			
			//아니면 return false;
		}else { // else if를 할 경우에는 그것을 제외한 나머지를 어떻게 할 지 결정 해 줘야 한다.
			
			return false;
		}
		
		
		
	}

}
