package d_cal;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculatort {
	// 1 멤버변수 선언
	JFrame f;
	JButton [] b = new JButton[15]; // 배열 초기화도 해줘야 함
	JTextField t;

	// 객체 생성
	
	public Calculatort() {
		f = new JFrame("개산기.ㅎ");
		t = new JTextField();
	

	}

	// 3.화면구성 및 출력하기
	public void display() {
		
		
		for(int i =9; i>=0; i--) {
			b[i] = new JButton(String.valueOf(i));
			
		}
		
		
		
		//버튼 객체 생성
		
		b[10] = new JButton("+");
		b[11] = new JButton("-");
		b[12] = new JButton("*");
		b[13] = new JButton("/");
		b[14] = new JButton("=");
		
		// 프레임 레이아웃을 보더레이아웃으로 설정
		f.setLayout(new BorderLayout());
		
		//패널에 5행 3열의 그리드레이아웃 설정
		JPanel p = new JPanel(new GridLayout(5,3));
		
		//순서대로 붙이기.
		for(int i =1 ; i  < 10 ; i++) { // 1부터 9까지만 더해주고 나머지는 따로 더해줌
			p.add(b[i]);
			
		}
		p.add(b[10]);
		p.add(b[0]);
		p.add(b[14]);
		p.add(b[11]);
		p.add(b[12]);
		p.add(b[13]);
		
		
		
		
		//붙인거 다시 프레임에 붙이기
		f.add(p , BorderLayout.CENTER);
		
		//텍스트 필드 붙이기.
		f.add(t, BorderLayout.NORTH);
		
		
		
		//출력
		f.setSize(300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {

		Calculatort cc = new Calculatort();

		cc.display();

	}

}
