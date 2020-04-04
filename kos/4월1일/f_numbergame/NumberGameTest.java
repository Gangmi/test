package f_numbergame;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NumberGameTest {

	public static void main(String[] args) {

		NumberGame ng = new NumberGame();
		ng.initChar();
		ng.showanswer();

	}

}

class NumberGame extends JFrame implements ActionListener {
	int getsu = 4;

	// 1. 멤버 변수 선언
	JButton[][] b = new JButton[getsu][4]; // 이차원 배열 선언

	// 1-2 버튼위에 지정할 문자 변수
	char[][] answer = new char[getsu][4]; // - > char 형의 /u0000 이 초기 값 -> 유니코드 0
	
	//3 첫번째 클릭에 대한 저장
	JButton firstClick;
	//행렬에 대한 저장
	int firstRow, firstCol;
	

	NumberGame() {
		// 2. 화면구성
		// 3. 객체생성
		setLayout(new GridLayout(4, 4));

		for (int i = 0; i < getsu; i++) {
			for (int j = 0; j < getsu; j++) {
				b[i][j] = new JButton();
				add(b[i][j]);
				// 문자 배열에 각 공간에 0으로 초기화
				answer[i][j] = '0';
				b[i][j].addActionListener(this);

			}
		}

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// 임의의 알파벳을 임의의 위치에 지정한다.
	void initChar() {

		char alpha = '0';
		HashSet h = new HashSet();
		// 16번 돌림
		BACK: for (int i = 0; i < getsu * getsu;) { // 여기에 i++ 을 하면 딱 16번만 되니까 뺀다.

			// 16칸에 같은 알파벳을 2개 씩 넣은 거니까 8번만 알파벳이 들어가면 된다.
			// 임의의 알파벳 만들기

			if (i % 2 == 0) { // 처음에 뽑은 하나로 두번씩 사용하는것

				alpha = (char) ('A' + (int) (Math.random() * 26)); // 랜덤수를 뽑고 26을 곱하면 0-25가 만들어지고 그걸 정수로 바꿔서
																	// 문자 A 와 더해주면 0부터 15까지 A부터 Z가 alpha에 저장.

				if (h.contains(alpha)) { // 해쉬셋에 내가지금 뽑은 알파벳이 있는지 확인
					continue;

				}
				h.add(alpha);

				// 기존에 같은 알파벳이 있는지 확인.
//				for(int j =0; j<getsu; j++) {
//					for(int k =0; k<getsu; k++) {
//						if(answer[j][k]== alpha) {
//							continue BACK; 
//						}

			}

			// 임의의 위치를 설정.
			boolean ok = false;

			do {
				int row = (int) (Math.random() * getsu); // -> 0 1 2 3 중 아무거나 하나
				int col = (int) (Math.random() * getsu);

				if (answer[row][col] == '0') { // 배열의 값이 비어있을 경우를 가리려고 0을 미리 다 넣어둠

					answer[row][col] = alpha; // 배열의 값에 0이 있으면, 아까 뽑은 문자를 넣고

					i++; // i를 더해주고

					ok = true; // 멈춘다.
				}

			} while (!ok);
		}

	}

	void showanswer() {
		// 답을 보여주기

		// 버튼에 전부 0 찍기
		for (int i = 0; i < getsu; i++) {
			for (int j = 0; j < getsu; j++) {
				b[i][j].setText(String.valueOf(answer[i][j]));
				b[i][j].removeActionListener(this);
				
				
				
			}
		}
			// 1분후에 답 가리기.

		try {
			Thread.sleep(1000); // 예외 발생이 가능해서 트라이캐치로 묶음 이렇게 하면 1초뒤에 덮어짐
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		for(int l = 0; l<getsu; l++) {
			for(int j =0; j<getsu; j++) {
				b[l][j].setText(null); // 내가 버튼위에 글씨를 안보이게 하고싶어서
				b[l][j].addActionListener(this);
				
				
			}
		}

		
	}

	@Override
	public void actionPerformed(ActionEvent args0) {
		// get source 로 정보를 얻어옴
		JButton evt = (JButton) args0.getSource();

		for (int i = 0; i < getsu; i++) {
			for (int j = 0; j < getsu; j++) {
				if (b[i][j] == evt) {
					//첫번째 선택인지를 확인 하는 조건문 
					if(firstClick == null) {
						firstClick = evt;
						firstRow = i;
						firstCol = j;
						evt.setBackground(Color.CYAN);
						evt.setText(String.valueOf(answer[i][j]));
						
						
						
						evt.removeActionListener(this);
						
						
					}else { // 두번째 선택일때
						
						//아까 저장했던 행렬의 값과 지금 누른 행렬의 값이 같다면
						if(answer[firstRow][firstCol] == answer[i][j]) {
							firstClick.setBackground(Color.red);
							evt.setBackground(Color.red);
							evt.setText(String.valueOf(answer[i][j]));
							
							evt.removeActionListener(this);
							
						}else {// 같지 않으면 색을 원래대로
							evt.setText(String.valueOf(answer[i][j]));
							firstClick.setBackground(null);
							evt.setText(null);
							b[firstRow][firstCol].setText(null);
							firstClick.addActionListener(this);
							
						}
						
						
						firstClick = null;//두번째 선택 후 첫번재 선택을 초기화하려고
					}


//					evt.setBackground(Color.cyan);

				}
			}
		}

	}
}
