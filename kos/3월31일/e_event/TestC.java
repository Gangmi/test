package e_event;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import e_event.TestA.MyEvent;

import java.awt.event.*; // 하위 폴더는 안들어가줌 그래서 이런식으로 해야 함

/*
 * 화면에 뭔가 이벤트가 발생 했을 때 운영체제가 JVM 으로 메시지를 보냄
 * 이 때 jvm 이 호출할 함수를 지정해야 하는데 
 *  
 */
public class TestC extends JFrame {

	JButton b1;
	JTextField tp1;

	public TestC() {

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

	// 1.이벤트 핸들러 구현 -> 버튼 이벤트만 발생 함
//	public class MyEvent implements ActionListener { // 이너클래스로만듦
//
//		@Override
//		
//
//		}
//	

	// 2. eventhandler 객체 생성
	public void eventProc() {
//		MyEvent me = new MyEvent(); // 원래 이런식으로 이벤트 핸들러  클래스의 객체를 생성하고 버튼과 텍스트필드에 액션리스너를 달아서
									// 넘어온 액션을 ActionEvent e 라는 패러미터로 받는다.

		b1.addActionListener(new ActionListener() {// -> 임의의 이벤트 핸들러 객체를 생성하면서 b1 이라는 버튼과 연결하겠다 라는뜻  (new 인터페이스이름()) 을하면됨
		//버튼에 액션리스너를 부여한다.								//
		//뒤에는 액션 핸들러를 구현한 클래스의 이름이 필요					//한번만 사용할 클래스를 만드는것.이름을 줄 수는 없다. -> 자동으로 정해지기 때문에
															//
															//액션이 발생하면 ActionListener를 구현한 클래스에 
															//actionperformed 함수를 자동으로 호출한다. -> actionListener의 역할
		
			//그렇게 만든 임의의 클래스의 메소드를 구현한다.
			public void actionPerformed(ActionEvent e) { // 발생한 이벤트와 그 주체를 가져온다.

				String msg = b1.getText(); // 버튼 1에서 발생한 이벤트 내용을 가져오고 msg 에 저장함
				JOptionPane.showMessageDialog(null, msg + "이벤트 발생");
			}

		});
		
		tp1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				String msg2 = tp1.getText();
				JOptionPane.showMessageDialog(null, msg2 + "이벤트 발생22");
				
			}
		});
	}

	public static void main(String[] args) {

		TestC t = new TestC();
		t.display();
		t.eventProc();

	}
}
