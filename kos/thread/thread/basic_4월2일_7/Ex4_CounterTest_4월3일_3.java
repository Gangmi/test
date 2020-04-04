package thread.basic_4월2일_7;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.xml.stream.events.StartDocument;

public class Ex4_CounterTest_4월3일_3 extends JFrame {
	private JPanel p1, p2;
	private JButton btn;
	private JTextArea ta;
	private JLabel lb;
	private boolean inputChk;

	public Ex4_CounterTest_4월3일_3() {
		setTitle("단일 스레드 테스트!");
		p1 = new JPanel();

		// 버튼을 생성하면서 바로 버튼에 붙이고 패널에 붙임
		p1.add(btn = new JButton("Click"));
		p1.add(lb = new JLabel("Count!"));// 추가

		add(p1, BorderLayout.NORTH);

		p2 = new JPanel();

		p2.add(ta = new JTextArea(20, 50));
		add(p2, BorderLayout.CENTER);

		setBounds(200, 200, 600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// 1- 카운트 다운을 시작하는 스레드
				new Thread(new Runnable() { // 이런식으로 축약해서 사용도 가능.

					@Override
					public void run() {
						for (int i = 10; i > 0; i--) {

							if(inputChk) { // 아래 스레드에서 비밀번호를 맞췄을 경우 true 로 바뀜
								inputChk = false;
								lb.setText("빙고");
								return;// 제어권 반납
							}
							lb.setText(String.valueOf(i));

							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

						}

					}
				}).start();

				// 2- 입력값을 받아서 JTextArea에 붙이는 작업
				new Thread(new Runnable() { // 스레드 구현 위의 스레스와 이 스레드가 같이 동작.
					
					public void run() {
						String msg = JOptionPane.showInputDialog("암호쓰 주셈쓰");
						ta.append(msg + "입니다. \n");
						
						//암호가 맞았을 경우
						if(msg.equals("1234")) {
							inputChk=true;
						}
						
					}
				}).start();
				
				
				
				
				

			}
		});
	}

	public static void main(String[] args) {
		new Ex4_CounterTest_4월3일_3();
	}
}
