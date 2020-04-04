package e_method;

public class Ex_01_흐름2_static없이_쓰는방법 {
	
	 void method()  { // static을 안쓰게 만드는 방법도 있다.
		 
		System.out.println("method 실행");
	}

	
	public static void main(String[] args) { 
		// void = 아무것도 없다.
		System.out.println("main 시작");
		Ex_01_흐름2_static없이_쓰는방법 ex =new Ex_01_흐름2_static없이_쓰는방법(); //메모리에 이 파일의 클래스를 올려버리면 , static이 없어도 호출이 가능 하다.
		ex.method(); //클래스를 메모리에 올려서 그 클래스에 method를 가져 오는 것 이기 때문에 가능 하다.
		System.out.println("main 끝");
	} 
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
