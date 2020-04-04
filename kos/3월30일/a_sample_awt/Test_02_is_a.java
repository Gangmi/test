package a_sample_awt;

import java.awt.*;

public class Test_02_is_a extends Frame { // is a 방식이기 때문에 객체를 생성할 필요도 멤버변수를 선언 할 필요도 없다.
	//멤버 변수 선언
	Button b;
	
	
	public Test_02_is_a() {
		//객체 생성
		super("내 프레임"); // 부모의 생성자 함수를 불러서 사용 할 수 있다.
		b = new Button("ok");
		//버튼 생성
		add(b);
		
		
		//화면 출력
		setSize(500,400); // 상속 받았기 때문에 Frame에 있는 함수를 그냥 쓸 수 있다.
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		Test_02_is_a t = new Test_02_is_a(); // 메모리에 올림
		

	}

}
