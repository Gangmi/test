package a_sample_awt;
import java.awt.BorderLayout;
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
	Frame f; // 그냥 초기화 하면 null
	Button b; 
	Label l ;
	TextField t ; // 텍스트 필드 변수를 선언  
	TextArea ta;
	Checkbox cb, cb2;
	List ls ;
	
	
	
	
	
	public Test_01_Has_a() { //화면 만들깅 //객체 생성
	
	//객체 생성 -> 메모리에 올림.
	f = new Frame("나의 창"); // has a 방식.
	b = new Button("OK"); // 화면에 뜨기 전에 버튼이 붙어 있어야 버튼이 보인다. 맨 앞부터 보인다고 생각
	l = new Label("NAME"); 
	//한 줄 입력 받기 
	t = new TextField("이름은 다섯자 미만입니다. ", 40); // 생성자 함수를 통해서 확인. -> 자료형의 순서까지 맞춰야 함.
	ta = new TextArea();
	cb = new Checkbox("Male");
	cb2 = new Checkbox("Female", true); // 뜨자마자 체크를 할지를 결정 .
	
	ls = new List(); // 리스트로 만들어 스크롤로...
	ls.add("High");
	ls.add("Middle");
	ls.add("Low");
	ls.add("Low");
	ls.add("Low");
	
	
	//붙이기
//	f.setLayout(new FlowLayout());// flowLayout 때문에 중앙 수직 위에 한줄로 정렬
//	f.setLayout(new GridLayout(4,2));// gridLayout에 의해 4행 2열로 정렬되고창의 크기가 커질 수록 같이 커진다.
	f.setLayout(new BorderLayout()); // 한 영역에 하나의 컴포넌트만 붙일 수 있다.
	
	f.add(b, BorderLayout.WEST);
	f.add(l, BorderLayout.EAST);//위에 레이아웃 설정 없이 이런식으로 하면 라벨이 버튼을 덮음
	f.add(t, BorderLayout.NORTH);
	f.add(ta, BorderLayout.CENTER);
		Panel p = new Panel(); //패널에 아래 체크박스 두개를 붙이고 그걸 다시 프레임에 붙인다. -> panel의 기본레이아웃이 flow이다.
//		p.setLayout(new GridLayout(2,1)); 
		p.add(cb );
		p.add(cb2);
	f.add(p, BorderLayout.SOUTH);	
//	f.add(ls);
	
	
	//화면 생성
	f.setSize(500,400);
	f.setVisible(true);  // 여기 까지만 하면 x를 눌러도 창이 안사라짐. 
	
	//버튼을 만들자
	
	
	
	
	
	}
	//화면 출력
	
	public static void main(String[] args) {
		
		Test_01_Has_a t = new Test_01_Has_a(); //내가 만들지 않아도 생성자 함수가 만들어지지만 위에 만듦.
		
		
		
		

	}

}
