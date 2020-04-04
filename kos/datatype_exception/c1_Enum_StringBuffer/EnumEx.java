package c1_Enum_StringBuffer;


import java.util.Scanner;

enum Size{ //읽는 것을 편하게 만들기 위해서. 이런 문구가 나오면 출력해준다.
	SMALL,	
	MEDIUM, 
	LARGE, 
	EXTRA_LARGE
	
}

public class EnumEx {
	public static void main(String[] args) {
		
		// Small : 1,  Medium : 2, Large : 3 이라고 지정하고  switch 구동
		// 다른 개발부에서는 1이 무엇인지 확인 해야 함.
				
		Size size = Size.LARGE;	//size라는 인스턴스를 만들고  그 인스턴스의 값이 enum에서 지정한 값이라면  size의 값을 스위치 한다.
		
		switch( size ) { // 원래는 문자나 정수만 되는데... 
		case SMALL 		: System.out.println("작은거"); break;
		case MEDIUM 	: System.out.println("중간거"); break;
		case LARGE 		: System.out.println("큰거"); break;
		case EXTRA_LARGE : System.out.println("완전큰거"); break;
		}
		
		// 화면을 클릭한다고 가상해야 이해
		
	}
}
