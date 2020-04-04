package e_event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TestB extends JFrame implements ActionListener { // JFrame의 역할을 하면서 이벤트 핸들러를 하겠다.
	// 멤버변수 선언
	JButton b1;
	JTextField tp1;

	// 생성자 함수
	public TestB() {
		b1 = new JButton("으앙");
		tp1 = new JTextField(10);
	}

	// 출력부
	void display() {
		setLayout(new FlowLayout());
		add(b1);
		add(tp1);
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// 구현한 ActionListener의 추상함수를 구현
	@Override
	public void actionPerformed(ActionEvent e) {
		Object evt = e.getSource(); 

		if (evt == b1) { 
			String msg = b1.getText(); 
			JOptionPane.showMessageDialog(null, msg + "이벤트 발생");
		} else if (evt == tp1) {
			String msg = tp1.getText();
			JOptionPane.showMessageDialog(null, msg + "입력하셨습니다.");

		}

	}
	//역할을 분담하려고 이걸 만듬 -> 이벤트를 처리하는 메소드를 따로 만들었다.
	public void eventProc() {
		
		b1.addActionListener(this); // 디스를 사용함 나니까.
		tp1.addActionListener(this);
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		//이미 이벤트 핸들러객체를 만들었음
		TestB t = new TestB();
		t.display();
		t.eventProc();
		

	}

}
