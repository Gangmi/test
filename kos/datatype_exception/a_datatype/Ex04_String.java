package a_datatype;

/* [주의] 클래스명을 절대로 String 이라고 하면 안된다 */
/* 
 * String은 기본 데이타 타입이 아닌 참조형 데이타 타입이다.
 * 참조형은 new를 이용하여 객체를 생성해야 한다.
 */
public class Ex04_String {

	public static void main(String[] args) {
		
		
		//문자열을 char 에 넣어서는 안된다. ex) char A = "B"  이건 안 됨
		
		
		//메모리는 stack 과 heap 두 부분으로 나눠진다. stack은 기본형 힙은 참조형
		int k = 99;
		
		String a =new String ( "홍길동");
		String b =new String ( "홍길동");
		
		
		
		if (a == b) { //  참조형 
			System.out.println("동일");
			
		}else {
			System.out.println("다르다");
			
		}
		
		if ( a.equals(b)) { //  참조형 
			System.out.println("동일2");
			
		}else {
			System.out.println("다르다2");
			
		}
		//new 를 사용하지 않고 축약형을 사용하면 a 에서  홍길동이 있으므로 b 도 a 를 참조하게된다.
		//따라서 동일한 값을 같게 된다. 
		
		

		
		
		
		
	}

}
