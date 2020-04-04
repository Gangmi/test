package f_radiobutton;

import javax.swing.*;
import java.awt.*;
public class Test_02_is_a extends JFrame { // is a 방식이기 때문에 객체를 생성할 필요도 멤버변수를 선언 할 필요도 없다.
	//멤버 변수 선언
	JRadioButton[] rb = new JRadioButton[4];

	//남자 라디오 버튼 , 여자 라디오 버튼
	
	//성인 라디오 버튼 / 미성년 라디오 버튼
	
	public Test_02_is_a() {
		//객체 생성
		super("내 프레임"); // 부모의 생성자 함수를 불러서 사용 할 수 있다.
		rb[0] = new JRadioButton("남자",true);
		rb[1] = new JRadioButton("여자",true); // 버튼생성자 함수에서 true를 주면 체크된 상태로 나온다.
		rb[2] = new JRadioButton("성인");
		rb[3] = new JRadioButton("미성년", true);
		//버튼 생성
		setLayout(new FlowLayout());
		
		ButtonGroup bg1 = new ButtonGroup(); // 이렇게 버튼 그룹을 잡아줌으로서 그룹내에서 중복 선택이 안 되게 할수 있다.
		bg1.add(rb[0]);
		bg1.add(rb[1]);
		
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(rb[2]);
		bg2.add(rb[3]);
		
		for(int i = 0; i< rb.length; i++) {
			add(rb[i]);
		}
		
		
		
		
		//화면 출력
		setSize(500,400); // 상속 받았기 때문에 Frame에 있는 함수를 그냥 쓸 수 있다.
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		
		Test_02_is_a t = new Test_02_is_a(); // 메모리에 올림
		

	}

}
