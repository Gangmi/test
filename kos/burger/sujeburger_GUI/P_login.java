package sujeburger_GUI;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class P_login extends JPanel implements ActionListener {
	JTextField tf_id;
	JPasswordField pf_pw;
	JButton btn_access, btn_addadmin;
	char[] pw = {'1','2','3'};
	

	/**
	 * Create the panel.
	 */
	public P_login() {
		setSize(new Dimension(1280, 1024));
		setLayout(null);
		
		
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
		
		JLabel lb_login = new JLabel("로그인");
		lb_login.setHorizontalAlignment(SwingConstants.CENTER);
		lb_login.setFont(new Font("맑은 고딕", Font.BOLD, 31));
		lb_login.setBounds(512, 287, 240, 63);
		add(lb_login);
		
		btn_access = new JButton("접속");
		btn_access.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		btn_access.setBounds(437, 598, 196, 63);
		add(btn_access);
		
		btn_addadmin = new JButton("관리자 추가");
		btn_addadmin.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		btn_addadmin.setBounds(656, 598, 196, 63);
		add(btn_addadmin);
		
		pf_pw = new JPasswordField();
		pf_pw.setBounds(437, 499, 415, 70);
		add(pf_pw);
		

		tf_id = new JTextField();
		tf_id.setColumns(10);
		tf_id.setBounds(437, 373, 415, 70);
		add(tf_id);

	}
	
	public void eventProc() {
		
		tf_id.addActionListener(this);
		pf_pw.addActionListener(this);
		btn_access.addActionListener(this);
		btn_addadmin.addActionListener(this);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object evt = e.getSource();
		if(evt==btn_access) {
			System.out.println("dlqpsxm");
				
				
				
			}
		}
		
		
	}
	

