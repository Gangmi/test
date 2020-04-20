package sujeburger_GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class MenuJButton extends JButton {
	
	
	
	public MenuJButton () {
	
	setBackground(Color.WHITE);
	setVerticalAlignment(SwingConstants.CENTER);
	setFont(new Font("맑은 고딕", Font.BOLD, 15));
	setIconTextGap(20);
	setHorizontalTextPosition(SwingConstants.CENTER);
	setVerticalTextPosition(SwingConstants.BOTTOM);
	
	}

	

}
