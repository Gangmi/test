package d_cal;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ABCcal extends JFrame {
	
	
	JButton [] b = new JButton[26];
	
	
	public ABCcal() {
		
		int j =0; 
		
		for(char i ='A'; i<='Z' ; i++  ) {
			b[j]= new JButton(String.valueOf(i));
			j++;
		}
		
		
	}

	
	public void display() {
		
		
		setLayout(new GridLayout(2,13));
		for(int i =0; i<b.length; i++) {
			add(b[i]);
			
		}
		setSize(700,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		ABCcal c = new ABCcal();
		
		c.display();
		
		

	}

}
