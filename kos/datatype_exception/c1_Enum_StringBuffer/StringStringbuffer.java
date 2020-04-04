package c1_Enum_StringBuffer;

public class StringStringbuffer {

	public static void main(String[] args) {
		//0.기본형
		int a =10;
		a+=5;
		System.out.println(a);
		
			
		//1.String =기본적으로 참조형 이다 
		String s = new String("안녕"); //원래는  new를 사용해야 하는데//
		
//		String s = "안녕"; // 문자열이 참조형이지만 기본형처럼 , new를 안 해도 쓸 수 있도록 해뒀다.
		
		s=s+"하세요"; // 원래는 연산도 안 되지만 String class 를 기본형 처럼 쓰기 위해서 이런 기능을 추가 했다.
		//새로 안녕하세요를 만들면 원래 heap에 있던 안녕에 추가하는게 아니라.
		//새로 안녕하세요를 만들고 String s 가 가지고있는 주소가 heap에 새로 만들어진 안녕하세요라는 안녕과는 다른 주소를 가리키게 된다.
		System.out.println(s);
		
		//c는 내가 원하는 시점에 trash를 수거 할 수 있지만,
		//자바는 그럴수가 없다.
		//하지만 그러기 위해서 StringBuffer 를 만들었다.
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		
		StringBuffer sb = new StringBuffer("행복한");
//		StringBuffer sb2 = "행복한"; ---> 이건 String이 아니기 때문에 new를 생략할 수 없다.
		
		
//		sb =sb +"목요일"; // 이것 역시 StringBuffer 이기 때문에 연산이 안된다.
		sb.append("목요일"); // Stringbuffer 클래스는 더하려면 append를 사용해야 한다.
							//아까 String 같은 경우에는 연산을 수행할 경우에 새로운 메모리를 잡아서 
							//연산을 진행하지만
							//StringBuffer는 원래 지정된 메모리에 추가/삭제를 하기때문에 속도와 효율성면에서 엄청난 차이가 있다.
		
	
		System.out.println(sb);
		
		
		
		
		
	}
	

}
