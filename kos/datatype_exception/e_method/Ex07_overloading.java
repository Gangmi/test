package e_method;

public class Ex07_overloading {

	public static void main(String[] args) {
		/*
		 * 원래 변수명을 같게하면 중복됐다고 에러가 난다.
		 * 하지만 함수에서
		 * 인자의 자료형 또는 갯수가 다른 동일한 함수들에서는  이것을 허용한다.
		 * 
		 * -return 형 만 다른것은 overloading 이 적용 되지 않는다.
		 * 
		 */
		//각각의 자료형에 변수의 값에다가 "화이팅!!"을 더할 것이다.
		String str = new String("홍길순");
		StringBuffer sb =new StringBuffer("홍길자");
		char[] ch = new char[] {'홍','길','이'};
		
		fighting(str);
		fighting(sb);
		fighting(ch);
		
		
	}
	static void fighting(String s) { // 각 fighting 의 자료형이 다르기때문에 인수의 자료형에 따라서 어디로 점프할지를 결정하고
									 //이것을 overloading이라고 한다.
									 // 자료형과 갯수가 같고 return만 다르다고 해서 이것을 다른 함수로 취급 하지는 않는다.
		System.out.println(s+" 화이팅!!");
		
	}
	static void fighting(StringBuffer s) {
		System.out.println(s.append(" 화이팅 !!"));// 
//		System.out.println(s+"화이팅!!"); 도 가능하다 , println이 괄호 안에 들어오는 자료를 문자열로 처리하기 때문
		
	
	}
	static void fighting(char[] ch) {
		StringBuffer cha= new StringBuffer(); // 이 상황에서는 StringBuffer가 나을 거 같음
		for(int i=0; i<ch.length; i++) {
			cha.append(ch[i]);
			
		}
		System.out.println(cha + "화이팅!!!!");
		
		
	}

}
