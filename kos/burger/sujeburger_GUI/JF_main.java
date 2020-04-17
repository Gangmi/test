package sujeburger_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.CardLayout;

public class JF_main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_main frame = new JF_main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JF_main() {
		setSize(new Dimension(1280, 1024));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(1280, 1024));
		
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		P_login s = new P_login();
		P_menu p = new P_menu();
		add(p);
		
	}

}
