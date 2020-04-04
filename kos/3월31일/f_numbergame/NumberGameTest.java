package f_numbergame;

import javax.swing.*;
import java.awt.*;

public class NumberGameTest {

	public static void main(String[] args) {

		NumberGame ng = new NumberGame();
		ng.showanswer();

	}

}

class NumberGame extends JFrame {
	// 1. 멤버 변수 선언
	JButton [][] b = new JButton[4][4]; // 이차원 배열 선언

	NumberGame() {
		// 2. 화면구성
		// 3. 객체생성
		setLayout(new GridLayout(4,4));
		
		
		for(int i =0; i<b.length ; i++) {
			for(int j =0; j<b[i].length; j++) {
				b[i][j] = new JButton(i +":"+ j); 
				add(b[i][j]);
				
				
			}
		}
		
		
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	void showanswer() {
		
		try {
			Thread.sleep(1000); // 예외 발생이 가능해서 트라이캐치로 묶음 이렇게 하면 1초뒤에 덮어짐
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		for(int i = 0; i<b.length; i++) {
			for(int j =0; j<b[i].length; j++) {
				b[i][j].setText(null); // 내가 버튼위에 글씨를 안보이게 하고싶어서
				
			}
		}
		
	}
}
