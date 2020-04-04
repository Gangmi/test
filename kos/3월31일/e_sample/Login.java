package e_sample;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame {

	JTextField tp1 , tp2;
	JButton b1;
	
	
	public Login() {
		tp1 = new JTextField();
		tp2 = new JTextField();
		b1 = new JButton("로그인");
		b1.setSize(10, 10);
		

	}

	public void display() {
		JLabel id = new JLabel("ID");
		JLabel pw = new JLabel("PW");
		
		JPanel wp = new JPanel();
		wp.setLayout(new GridLayout(2,2));
		wp.add(id);
		wp.add(tp1);
		wp.add(pw);
		wp.add(tp2);
		
		add(wp, BorderLayout.CENTER);
		add(b1 , BorderLayout.EAST);
		
		
		

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		Login log = new Login();

		log.display();

	}

}
