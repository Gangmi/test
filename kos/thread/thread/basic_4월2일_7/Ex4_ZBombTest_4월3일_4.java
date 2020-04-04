package thread.basic_4월2일_7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ex4_ZBombTest_4월3일_4 extends JFrame {
	private JPanel p1, p2;
	private JButton btn;
	private JLabel lb, image;
	private boolean inputChk = false;

	Ex4_ZBombTest_4월3일_4() {
		setTitle("폭탄 테스트!");
		p1 = new JPanel();
		p1.add(btn = new JButton("시작"));
		p1.add(lb = new JLabel("카운트다운"));
		add(p1, "North");
		p2 = new JPanel();
		p2.add(image = new JLabel(new ImageIcon("src\\thread\\basic\\imgs\\bomb_1.jpg")));

		add(p2, "Center");
		setBounds(200, 200, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 1- 카운트 다운을 시작하는 스레드

				new Thread(new Runnable() {

					public void run() {

						for (int i = 10; i >= 0; i--) {
							lb.setText(String.valueOf(i));

							if (inputChk) {
								inputChk = false;
								lb.setText("빙고");

								return;
							}

							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

							if (i == 0) {
								lb.setText(String.valueOf(i));
								image.setIcon(new ImageIcon("src\\thread\\basic\\imgs\\bomb_2.jpg"));

							}

						}

					}
				}).start();

				// 2- 암호값을 입력받기

				new Thread(new Runnable() {

					@Override
					public void run() {
						String msg = JOptionPane.showInputDialog("암호쓰");

						if (msg.equals("1234")) {
							inputChk = true;
						} else {
							image.setIcon(new ImageIcon("src\\thread\\basic\\imgs\\bomb_2.jpg"));

						}

					}
				}).start();

			}
		});
	}

	public static void main(String[] args) {
		new Ex4_ZBombTest_4월3일_4();
	}
}
