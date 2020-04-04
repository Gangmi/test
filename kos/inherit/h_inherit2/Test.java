package h_inherit2;

import java.awt.*;
/*
 * has-a 라고 함
 * MyFrame1 has a Frame 이다,.
 */

class MyFrame1 {
	Frame f; // 자동으로 멤버변수를 선언.
	
	public MyFrame1(){
		f = new Frame("나의 첫 화면"); // 화면을 띄우기 위해 Frame 이라는 클래스의 객체를 f 에 저장함.
		f.setSize(500 , 300);
		f.setVisible(true);
	}
}

public class Test {

	public static void main(String[] args) {
		new MyFrame1();

	}

}
