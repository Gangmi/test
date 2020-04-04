package e_method;

public class Ex03_2CallByRef {
	/**
	 *  메소드의 인자가 참조형인 경우
	 *  		-> 주소 복사됨
	 *  		call by reference 
	 *  원본과 복사본 둘다 같은 "주소" 가 복사 되는 것이기 때문에 , 복사본에서 값이 수정 되면 메모리 값이 바뀐다.
	 *  ** 스트링은 call by value reference  를 따지자면 call by reference 지만, 결과가 그렇게 나오지는 않는다.
	 *  
	 */
	
	public static void main(String[] args) { // 클래스와 배열은 참조형임
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("하이");
		add(a,b);
		System.out.println("A"+a + ", B = " +b); // 주소에 해당하는 값을 바꿔놨기 때문에 원본이 수정이 된다.
	}
	static void add(StringBuffer a ,StringBuffer b) { // parameter을 설정.
		//a+=b
		a.append(b);
		System.out.println("A"+a + ", B = " +b);
		
		
		
	}
	
	
}
