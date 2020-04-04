package e_event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculatort_addevent implements ActionListener {
	// 1 멤버변수 선언
	JFrame f;
	JButton[] b = new JButton[10]; // 배열 초기화도 해줘야 함
	JButton[] bo = new JButton[5];
	JTextField t;

	int prev; // 이전값
	String op; // 연산자

	// 객체 생성

	public Calculatort_addevent() {
		f = new JFrame("개산기.ㅎ");
		t = new JTextField();

	}

	// 3.화면구성 및 출력하기
	public void display() {

		for (int i = 9; i >= 0; i--) {
			b[i] = new JButton(String.valueOf(i));

		}

		// 버튼 객체 생성

		bo[0] = new JButton("+");
		bo[1] = new JButton("-");
		bo[2] = new JButton("*");
		bo[3] = new JButton("/");
		bo[4] = new JButton("=");

		// 프레임 레이아웃을 보더레이아웃으로 설정
		f.setLayout(new BorderLayout());

		// 패널에 5행 3열의 그리드레이아웃 설정
		JPanel p = new JPanel(new GridLayout(5, 3));

		// 순서대로 붙이기.
		for (int i = 1; i < 10; i++) { // 1부터 9까지만 더해주고 나머지는 따로 더해줌
			p.add(b[i]);

		}
		p.add(bo[0]);
		p.add(b[0]);
		p.add(bo[4]);
		p.add(bo[1]);
		p.add(bo[2]);
		p.add(bo[3]);

		// 붙인거 다시 프레임에 붙이기
		f.add(p, BorderLayout.CENTER);

		// 텍스트 필드 붙이기.
		f.add(t, BorderLayout.NORTH);

		// 출력
		f.setSize(300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) { // 내가 이벤트를 발생 시킬 때만 동작한다.

		JButton evt = (JButton) (e.getSource()); // 내가 발생시킨 이벤트의 정보를 넘겨 줌 어느 곳에서 이게 발생됐는지

		// 숫자가 눌렸을 때
		for (int i = 0; i < 10; i++) { // 반복문을 돌리는 동안

			if (evt == b[i]) {// evt와 b[i] 의 주소 값을 비교해서 그게 같다면,

				String su = t.getText(); // 처음에 아무것도 없으니까 아무것도 안들어가고,
				su += b[i].getText(); // 버튼[i]의 텍스트를 가져와서 su에다 더해주고
				t.setText(su);// 텍스트 필드에 su를 출력한다.
				//이를 통해서 숫자가 텍스트 필드에 계속 찍히게 된다.
			}
		}

		// 연산자가 눌렸을 때
		
		for (int i = 0; i < bo.length - 1; i++) { //반복문을 돌리는 동안에 
			if (evt == bo[i]) { // 눌려진 것이 버튼 배열 bo 의 i 번째와 같을 때 
				prev = Integer.parseInt(t.getText()); //현재 화면의 텍스트필드의 값을 가져와서 int 형으로 바꾸고 멤버변수 prev에 저장한다.
				t.setText(null);// 그러면서 텍스트 필드를 한 번 지워주고
				op = evt.getText();// 현재 들어온 연산자를 String 형태로 멤버변수 op에 저장한다.
			}
		}

		if (evt == bo[4]) { // evt 가 = 일 때 
			switch (op) { // 중간에 누른 연산자를 인자로 switch case 문 작성 
			case "+":
				int second = Integer.parseInt(t.getText()); // 두번째 숫자를 화면에서 바로 가져옴
				int result = prev + second;
				t.setText(String.valueOf(result)); // String.valueof를 사용하면 쉽게 값을 스트링으로 바꿀 수 있다.
				break;
			case "-":
				int second2 = Integer.parseInt(t.getText()); // 두번째 숫자를 화면에서 바로 가져옴
				int result2 = prev - second2;
				t.setText(String.valueOf(result2));
				break;
			case "*":
				int second3 = Integer.parseInt(t.getText()); // 두번째 숫자를 화면에서 바로 가져옴
				int result3 = prev * second3;
				t.setText(String.valueOf(result3));
				break;
			case "/":
				int second4 = Integer.parseInt(t.getText()); // 두번째 숫자를 화면에서 바로 가져옴
				double result4 = prev / (double)(second4);
				t.setText(String.valueOf(result4));
				break;
				
			}
		}

	}
	// 연산자가 눌렸을 때

	public void eventProc() {

		for (int i = 0; i < b.length; i++) {
			b[i].addActionListener(this); // 각자 이벤트발생을 감지

		}
		for (int i = 0; i < bo.length; i++) {
			bo[i].addActionListener(this);

		}

	}

	public static void main(String[] args) {

		//클래스 객체를 만들어서 메모리에 올림
		Calculatort_addevent cc = new Calculatort_addevent();
		//클래스 멤버 함수인 display를 불러옴
		cc.display(); 
		cc.eventProc();

	}

}
