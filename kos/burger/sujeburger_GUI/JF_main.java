package sujeburger_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.CardLayout;
import java.awt.Container;

public class JF_main extends JFrame implements ActionListener {

	Container contentPane;
	P_login P_login;
	P_menu P_menu;
	CardLayout cl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		JF_main main = new JF_main();

		main.eventProc();
	}

	/**
	 * Create the frame.
	 */
	public JF_main() {
		// 카드레이아웃을 설정할 컨텐츠팬 생성
		contentPane = getContentPane();
		// 카드 레이아웃 생성
		cl = new CardLayout(0, 0);
		// 컨텐츠 팬에 카드레이아웃 설정
		contentPane.setLayout(cl);

		// 컨텐츠팬에 올라갈 각 패널의 객체생성
		P_login = new P_login();
		P_menu = new P_menu();

		

		contentPane.add(P_login);
		contentPane.add(P_menu);

		setVisible(true);
		setSize(new Dimension(1280, 1024));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void eventProc() {
		//생성한 객체의 각 버튼에 대한 이벤트 생성
		P_login.btn_access.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object evt = e.getSource();
		if (evt == P_login.btn_access) {
			cl.next(contentPane);

		}

	}
	

}
