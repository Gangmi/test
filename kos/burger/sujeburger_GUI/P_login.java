package sujeburger_GUI;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class P_login extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public P_login() {
		setSize(new Dimension(1280, 1024));
		setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(437, 373, 415, 70);
		add(textField);
		
		JLabel lb_id = new JLabel("ID");
		lb_id.setHorizontalAlignment(SwingConstants.CENTER);
		lb_id.setFont(new Font("맑은 고딕", Font.BOLD, 31));
		lb_id.setBounds(270, 377, 171, 71);
		add(lb_id);
		
		JLabel lb_pw = new JLabel("PW");
		lb_pw.setHorizontalAlignment(SwingConstants.CENTER);
		lb_pw.setFont(new Font("맑은 고딕", Font.BOLD, 31));
		lb_pw.setBounds(270, 499, 171, 71);
		add(lb_pw);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(437, 494, 415, 71);
		add(textField_1);
		
		JLabel lb_login = new JLabel("로그인");
		lb_login.setHorizontalAlignment(SwingConstants.CENTER);
		lb_login.setFont(new Font("맑은 고딕", Font.BOLD, 31));
		lb_login.setBounds(512, 287, 240, 63);
		add(lb_login);
		
		JButton btn_access = new JButton("접속");
		btn_access.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		btn_access.setBounds(437, 598, 196, 63);
		add(btn_access);
		
		JButton btn_addamin = new JButton("관리자 추가");
		btn_addamin.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		btn_addamin.setBounds(656, 598, 196, 63);
		add(btn_addamin);

	}
}
