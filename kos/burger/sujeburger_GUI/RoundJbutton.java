package sujeburger_GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class RoundJbutton extends JButton {

	public RoundJbutton() {
		super();
		decorate();
	}

	public RoundJbutton(String text) {
		super(text);
		decorate();
	}

	public RoundJbutton(Action action) {
		super(action);
		decorate();
	}

	public RoundJbutton(Icon icon) {
		super(icon);
		decorate();
	}

	public RoundJbutton(String text, ImageIcon icon) {
		super(text, icon);
		decorate();
	}

	public void decorate() {
		setBorderPainted(false);
		setOpaque(false);
	}

	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if (getModel().isArmed()) {
			graphics.setColor(getBackground().darker());
		} else if (getModel().isRollover()) {
			graphics.setColor(Color.RED.darker());
		} else {
			
			graphics.setPaint(new GradientPaint(
	                    new Point(0, 0), 
	                    Color.RED, 
	                    new Point(0, getHeight()), 
	                    Color.RED.darker()));
		}
		graphics.fillRoundRect(0, 0, width, height, 10, 10);
		FontMetrics fontMetrics = graphics.getFontMetrics();
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();
		int textX = (width - stringBounds.width) / 2;
		int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent();
		graphics.setColor(Color.WHITE);
		graphics.setFont(new Font("맑은 고딕", Font.BOLD, 18));
	
		graphics.drawString(getText(),textX-10,textY);
		graphics.dispose();
		super.paintComponent(g);
	}

}
