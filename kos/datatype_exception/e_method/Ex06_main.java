package e_method;

public class Ex06_main {

	public static void main(String[] args) {  // 실행 할 당시에 들어온 argument 를 받는다. -> 정보같은것들을 받을 때 필요하다.
		
		
		//서버 접속
		System.out.println("서버접속");
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println("위의 정보로 서버에 접속");
	}

}
/*
 *직접 운영체제에서 자바를 실행 할 때
 *(1) 자바 컴파일(java-> class) // jvm이 읽게 하기 위해서 번역본을 만든다.
 *javac Hello.java 
 *(2) 자바 실행(Hello.class)
 *	java Hello -> 확장자를 뺀 파일 명을 기술 한다.
 * 이렇게 명령어를 쓴 순간에 Hello.class파일을 찾아서 실행한다.
 *
 *문자열을 입력하며 실행
 *java Ex06_main인자 를 실행한다고 할 때, 서버 ip, 서버계정 서버비밀번호 같은 정보를 실행하는 순간에 넣고 싶다면
 *
 *
 * 
 */

