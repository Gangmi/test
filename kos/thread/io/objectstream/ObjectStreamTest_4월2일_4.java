package io.objectstream;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ObjectStreamTest_4월2일_4 {
	public static void main(String[] args) {
		UIForm ui = new UIForm();
		ui.addToLayout();
		ui.eventProc();
	}
}

//-----------------------------------------
// 화면을 관리하는 클래스
class UIForm extends JFrame {
	// 데이타를 저장할 변수
	String name;
	int age;
	double height;
	char bloodType;

	// 화면 GUI에 관련한 변수
	JTextField tfName, tfAge, tfHeight, tfBloodType;
	JButton bSave, bLoad;

	UIForm() {
		tfName = new JTextField(10);
		tfAge = new JTextField(10);
		tfHeight = new JTextField(10);
		tfBloodType = new JTextField(10);

		bSave = new JButton("저장하기", new ImageIcon("../img/save.gif"));
		bLoad = new JButton("읽어오기", new ImageIcon("../img/load.gif"));

	}

	// 화면 구성하는 메소
	void addToLayout() {
		JPanel pCenter = new JPanel();
		pCenter.setLayout(new GridLayout(5, 2, 10, 10));
		pCenter.add(new JLabel("이름"));
		pCenter.add(tfName);
		pCenter.add(new JLabel("나이"));
		pCenter.add(tfAge);
		pCenter.add(new JLabel("신장"));
		pCenter.add(tfHeight);
		pCenter.add(new JLabel("혈액형"));
		pCenter.add(tfBloodType);

		pCenter.add(bSave);
		pCenter.add(bLoad);

		getContentPane().add("Center", pCenter);

		setSize(400, 300);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// 이벤트 처리하는 메소드
	void eventProc() {
		BtnHandler bHdlr = new BtnHandler();
		bSave.addActionListener(bHdlr);
		bLoad.addActionListener(bHdlr);
	}

	class BtnHandler implements ActionListener {
		public void actionPerformed(ActionEvent ev) {

			Object evtBtn = ev.getSource();

			// "저장하기" 버튼이 눌렸을
			if (evtBtn == bSave) {
				/*
				 * 1. 텍스트필드에서 입력값 얻어와서 변수에 저장 2. 파일출력스트림 생성 ( filter 포함 ) 3. 스트림에 출력 4. 스트림 닫기
				 * 5. 텍스트필드 초기화
				 */
				name = tfName.getText();
				age = Integer.parseInt(tfAge.getText());
				height = Double.parseDouble(tfHeight.getText());
				bloodType = (tfBloodType.getText()).charAt(0);

				/**
				 * @@@@@@@@@@@@@@@@@@@@@@@@@
				 */
				try {
					// 객체를 통으로 주고받을 수 있는 필터를 씌움
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data2.txt"));

					Person p = new Person();

					p.setAge(age);
					p.setBloodtype(bloodType);
					p.setHeight(height);
					p.setName(name);

					oos.writeObject(p);
					

					oos.close();

					// 이게 저장이 안됨 -> 바이트 단위로 쪼개서 들어가는데 , 메모리상의 person이라는 덩어리가 통로를 통과 할 수 없음
					// 따라서 이 데이터를 직렬화 시켜줘야 함
					// 객체가 스트림을 통과하기 위해서 직렬화가 필요하다.
					// 내가 보내고 싶은 클래스에 serializable을 사용해서, 직렬화를 한다.
					// seriallizable 은 인터페이스 이지만 일종의 신호이기 때문에 구현해야할 추상 메소드가 없다.
					// 아까 사용했던 String같은 경우는 이미 serializable을 구현하고 있기 때문에 통로로 이동이 가능했던것.

				} catch (Exception ex) {
					System.out.println("쓰기 실패" + ex.getMessage());
					ex.printStackTrace();
				}

				tfName.setText("");
				tfAge.setText("");
				tfHeight.setText("");
				tfBloodType.setText("");

			}
			// "읽어오기" 버튼이 눌렸을 때
			else if (evtBtn == bLoad) {

				/*
				 * 1. 파일입력스트림 생성 (filter 포함 ) 2. 스트림에서 데이타 읽어서 변수에 저장 3. 텍스트필드에 출력 4. 스트림 닫기
				 */
				try {
					ObjectInputStream in = new ObjectInputStream(new FileInputStream("data2.txt"));

//					name	= in.readUTF();
//					age		= in.readInt();
//					height	= in.readDouble();
//					bloodType = in.readChar();
					Person p = (Person) in.readObject();
					//텍스트파일로 저장된 클래스를 불러와서  다시 그 객체 타입으로 저장
					name = p.getName(); // 그 객체의 이름을 불러와서 저장
					age = p.getAge(); 
					bloodType = p.getBloodtype();
					height = p.getHeight();

					in.close();

				} catch (IOException | ClassNotFoundException ex) {
					System.out.println("읽기 실패");
				}

				tfName.setText(name);
				tfAge.setText(String.valueOf(age));
				tfHeight.setText(String.valueOf(height));
				tfBloodType.setText(String.valueOf(bloodType));

			}

		}
	}
}