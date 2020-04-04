package e_event;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.*; // 하위 폴더는 안들어가줌 그래서 이런식으로 해야 함

/*
 * 화면에 뭔가 이벤트가 발생 했을 때 운영체제가 JVM 으로 메시지를 보냄
 * 이 때 jvm 이 호출할 함수를 지정해야 하는데 
 *  
 */
public class TestA extends JFrame {

	JButton b1;
	JTextField tp1;

	public TestA() {

		b1 = new JButton("으앙");
		tp1 = new JTextField(10);

	}

	void display() {
		setLayout(new FlowLayout());

		add(b1);
		add(tp1);

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// 1.이벤트 핸들러 구현
	public class MyEvent implements ActionListener { // 이너클래스로만듦

		@Override
		public void actionPerformed(ActionEvent e) { // 이 액션 퍼폼함수는 내가 이벤트를 발생 시켰을 때, 불러진다. ActionListener
			Object evt = e.getSource(); // 리턴값이 object 이다 뭐가 발생할지 몰라서 그 이벤트가 어디서 발생했는지 object로 돌려준다.
										// -> 어떤 버튼 또는 텍스필드 같은..
			

			if (evt == b1) { // evt 가 b1 이라면 
				String msg = b1.getText(); // 버튼 1에서 발생한 이벤트 내용을 가져오고 msg 에 저장함
				JOptionPane.showMessageDialog(null, msg+"이벤트 발생");
			} else if (evt == tp1) {
				String msg = tp1.getText(); 
				JOptionPane.showMessageDialog(null, msg+"입력하셨습니다.");

			}

		}

	}

	// 2. eventhandler 객체 생성
	public void eventProc() {

		MyEvent me = new MyEvent(); // 이벤트를 다르게 처리하고 싶을 때 이벤트를 더 만든다.

		b1.addActionListener(me); // 이벤트가 발생 했을 때  괄호안에 있는 이벤트 핸들러로 메시지를 보내주는 역할.
		tp1.addActionListener(me);
	}

	public static void main(String[] args) {

		TestA t = new TestA();
		t.display();
		t.eventProc();

	}

}
