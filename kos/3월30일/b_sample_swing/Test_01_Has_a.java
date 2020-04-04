package b_sample_swing;

//AWT -> swing 으로 바꿀거야
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;




public class Test_01_Has_a {
	
	//멤버변수 선언
	JFrame f; // 그냥 초기화 하면 null
	JButton b; 
	JLabel l ;
	JTextField t ; // 텍스트 필드 변수를 선언  
	JTextArea ta;
	JCheckBox cb, cb2;
	JList ls ;
	
	
	
	
	
	public Test_01_Has_a() { //화면 만들깅 //객체 생성
	
	//객체 생성 -> 메모리에 올림.
	f = new JFrame("나의 창"); // has a 방식.
	b = new JButton("OK"); // 화면에 뜨기 전에 버튼이 붙어 있어야 버튼이 보인다. 맨 앞부터 보인다고 생각
	l = new JLabel("NAME"); 
	//한 줄 입력 받기 
	t = new JTextField("이름은 다섯자 미만입니다. ", 40); // 생성자 함수를 통해서 확인. -> 자료형의 순서까지 맞춰야 함.
	ta = new JTextArea();
	cb = new JCheckBox("Male");
	cb2 = new JCheckBox("Female", true); // 뜨자마자 체크를 할지를 결정 .
	String[] data = {"High","Middle","Low","Low","Low","Low","Low"}; // swing 은 List 값을 문자열 배열로 받는다.
	
	ls = new JList(data); // 리스트로 만들어 스크롤로...
	
	
	
	//붙이기
//	f.setLayout(new FlowLayout());// flowLayout 때문에 중앙 수직 위에 한줄로 정렬
//	f.setLayout(new GridLayout(4,2));// gridLayout에 의해 4행 2열로 정렬되고창의 크기가 커질 수록 같이 커진다.
	f.setLayout(new BorderLayout()); // 한 영역에 하나의 컴포넌트만 붙일 수 있다.
	
	f.add(b, BorderLayout.WEST);
	f.add(l, BorderLayout.EAST);//위에 레이아웃 설정 없이 이런식으로 하면 라벨이 버튼을 덮음
		
	JPanel p2 = new JPanel(); // 텍스트 박스와 리스트를 같은곳에 넣기 위해서
		p2.add(t);
		p2.add(ls);
	f.add(p2, BorderLayout.NORTH);	
	
	
	f.add(ta, BorderLayout.CENTER);
	
	
	JPanel p = new JPanel(); 
		p.add(cb );
		p.add(cb2);
	f.add(p, BorderLayout.SOUTH);	
	
		
	
	
	//화면 생성
	f.setSize(600,400);
	f.setVisible(true);  // 여기 까지만 하면 x를 눌러도 창이 안사라짐. 
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이게 완전히 종료시켜버리는 코딩.
	
	
	
	
	
	
	
	}
	//화면 출력
	
	public static void main(String[] args) {
		
		Test_01_Has_a t = new Test_01_Has_a(); //내가 만들지 않아도 생성자 함수가 만들어지지만 위에 만듦.
		
		
		
		

	}

}
