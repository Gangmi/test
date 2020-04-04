package e_method;

public class Ex_01_흐름 {
	
	static void method() { // 이것이 함수의 기본 틀이다. + 메소드를 메인함수 위에서 선언해도 jvm은 main부터 시작 한다.
		System.out.println("method 실행");
	}

	
	public static void main(String[] args) { // 메인함수 얘도 일종의 메소드 메인 함수가 static 이어야 부를 수 있다. 지역변수다.
		// void = 아무것도 없다.
		System.out.println("main 시작");
		method(); // 이 메소드가 실행 되는 시점에 제어권을 위에 메소드로 넘긴다. -> 19라인으로 점프(아니면 있는 곳으로) 그리고 다시 부른곳으로 돌아온다.
		System.out.println("main 끝");
	} // 메인이 끝나는 시점에 jvm에 끝났다고 알려 줌 , 밑에 메소드를 만들었어도 실행을 안 함.

}






/*
 * 명명규칙, 문자+숫자+_+$ 초합가능 길이제한이 없고 첫 글자에 숫자만 아니면 됨 대 소문자 구별 예약어(keyword)는 안 됨
 * 
 * 
 * 
 * 권장사항. - 클래스명의 첫 글자는 대문자로 시작.->명사 - 변수와 메소드 명의 첫 글자는 소문자.->동사. - 라벨명은 전부 대문자로.
 * - 패키지명은 전부 소문자로.
 * 
 */
