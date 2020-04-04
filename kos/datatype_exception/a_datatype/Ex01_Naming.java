package a_datatype;

/* 주석 :
 *  컴파일 하지 않는 문장*/ 


// 주석 한 줄 짜리 주석
/** 주석 */

//위의 세개는 모두 주석이다.

public class Ex01_Naming {
	/**
	 *		자료형 
	 *		1- 기본형
	 *				논리형 :boolean
	 *				문자형 :char(2) 약 2억 - 문자하나
	 *				정수형 : int(4), / long(8)
	 *				실수형 : double(8)
	 * 		2- 참조형
	 * 				배열 / 클래스
	 */
	public static void main(String[] args) {

		// 1. 변수선언 : 메모리에 영역 확보하기
				// (1) 문자형 변수  ch 선언하기
		char ch;
		char ch2;
		//char 2ch; ㅡ 안 되는 것
	 
		
				// (2) 정수형 변수 abcdefz 선언하기
		long abcdefz; // 4byte
		
				
				// (3) 실수형 변수 Ch 선언하기
		double Ch; // 소문자를 쓰면 위의 ch와 겹치기 때문에 대문자로 표시.
		
		
	
		// 2. 변수에 값 대입하기
		ch = '꽝'; // 문자 하나는 작은 따옴표
		abcdefz = 10000000000L; // long형을 표현하기 위해서는 위에서 long을 선언 했더라도 밑에서 숫자 뒤에 L을 붙여주어야 한다.
		Ch = 3.6;
		//뒤에 있는 것을 앞에 있는것에 대입하는 것이다.
		
		
		// 3. 논리형 변수 b 선언하고 true 값 대입하기(지정하기)
		boolean b;
		b= true;
		
		
	
		
	}

}
