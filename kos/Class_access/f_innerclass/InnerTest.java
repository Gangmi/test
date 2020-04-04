package f_innerclass;

class Outer {
	

	class Inner{ // 이렇게 안에 있는 클래스는 멤버로 취급한다. -> 이너 클래스안에 있는 클래스도 클래스이기 때문에 class파일이 만들어지는데, 이때
				// Outer$inner.class
				// 라고 만들어 진다. $ 가 쓰임.

	
		
		void naJabara() {
			System.out.println("잡아보슈~~");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {

		Outer O = new Outer();
		Outer.Inner in = O.new Inner(); // 클래스 안에 클래스를 불러 올 때는 o 안에 있는 inner라는 클래스의 객체를 생성하는 것이라고 생각 하는게 좋다.
//		in.naJabara(); //이렇게 해야 사용 할 수 있다.

		// 멤버 클래스는 멤버로 취급 되기때문에 static을 사용 할 수 있기 때문에 먼저 메모리에 올라온다.
//		Outer.Inner in = new Outer.Inner();
		in.naJabara(); // 이런식으로 접근도 가능하다. 클래스 명 만으로도 접근이 가능하기때문에.
//		Outer.Inner.naJabara(); // 이런식으로 멤버 클래스부터 그 안에 함수까지 static이 있다면 객체 생성없이 클래스 명 만으로도 접근이 가능하다.

		// 지금 살아있는 코드들이 원래 노말한 코드들이다.한다.
		// 패키지 익스플로러의 설정에서 패키지 안에 패키지를 보는 방식으로 만들 수 있다.
		// 상위클래스의 객체를 만들고 그 안의 클래스의 객체를 또 만들고 그 안에있는 함수에 접근
	}
}
