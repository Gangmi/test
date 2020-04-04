package e_event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Infotest_액션붙이기 extends JFrame {

	// 1.멤버변수
	JTextArea ta;
	JButton badd, bshow, bsearch, bdelete, bcancel, bexit;
	JTextField tf, tfID, tfTel, tfSex, tfAge, tfHome;

	class inner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			JButton evt = (JButton) e.getSource();
			String msg = evt.getText();

			if (evt == badd) {
				JOptionPane.showMessageDialog(null, msg + "합니다");

			} else if (evt == bshow) {
				JOptionPane.showMessageDialog(null, msg + "합니다");
			} else if (evt == bsearch) {
				JOptionPane.showMessageDialog(null, msg + "합니다");
			} else if (evt == bdelete) {
				JOptionPane.showMessageDialog(null, msg + "합니다");
			} else if (evt == bcancel) {
				JOptionPane.showMessageDialog(null, msg + "합니다");
			} else if (evt == bexit) {
				JOptionPane.showMessageDialog(null, msg + "합니다");
				System.exit(0); // 의미없이 나가짐.
			}

		}

	}

	// 2.객체생성 생성자 함수
	public Infotest_액션붙이기() {

		ta = new JTextArea(300, 200);

		badd = new JButton("add", new ImageIcon("3월30일/c_info/imgs/2.PNG"));
		bshow = new JButton("show");
		bsearch = new JButton("search");
		bdelete = new JButton("delete");
		bcancel = new JButton("canel");
		bexit = new JButton("exit");

		tf = new JTextField(10);
		tfID = new JTextField(10);
		tfTel = new JTextField(10);
		tfSex = new JTextField(10);
		tfHome = new JTextField(10);
		tfAge = new JTextField(10);

	}

	// 3.화면 구성및 출력
	void display() {

		// 이 라벨마다 이벤트가 있고 동작이 있으면 멤버변수로 있는게 맞지만 지금은 출력만 하고 아무것도 안 할 거니까 멤버변수 안해도 됨
		JLabel l = new JLabel("Name", 10);
		JLabel l2 = new JLabel("ID", 10);
		JLabel l3 = new JLabel("Tel", 10);
		JLabel l4 = new JLabel("Sex", 10);
		JLabel l5 = new JLabel("Age", 10);
		JLabel l6 = new JLabel("Home", 10);

		// 왼쪽 West
		setLayout(new BorderLayout());
		JPanel leftp = new JPanel();
		leftp.setLayout(new GridLayout(6, 2));
		leftp.add(l);
		leftp.add(tf);
		leftp.add(l2);
		leftp.add(tfID);
		leftp.add(l3);
		leftp.add(tfTel);
		leftp.add(l4);
		leftp.add(tfSex);
		leftp.add(l5);
		leftp.add(tfAge);
		leftp.add(l6);
		leftp.add(tfHome);

		add(leftp, BorderLayout.WEST);

		// 센터
		add(ta, BorderLayout.CENTER);

		// 아래쪽 패널
		JPanel bp = new JPanel(new GridLayout(1, 6));
		bp.add(badd);
		bp.add(bshow);
		bp.add(bsearch);
		bp.add(bdelete);
		bp.add(bcancel);
		bp.add(bexit);

		add(bp, BorderLayout.SOUTH);

		setLocation(200, 200); // 화면 띄울 때 배치하는 자리.
		setSize(700, 560);
		setVisible(true);

		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); 

	}

	public void performProc() {
		inner s = new inner();
		// 이벤트 연결
		badd.addActionListener(s);
		bshow.addActionListener(s);
		bsearch.addActionListener(s);
		bdelete.addActionListener(s);
		bcancel.addActionListener(s);
		bexit.addActionListener(s);
		// ID textfield 에서 엔터를 썼을 때 이벤트 처리

		tfID.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

//				String evt=tfID.getText();

//				JOptionPane.showMessageDialog(null, evt + "입력했오");
				// (1)ID 에 쓴것을 가져와서  setText 를사용해서 tfsex 에  찍어줌
				String ID = tfID.getText();
				
				char sex = ID.charAt(7);
				if(sex == '1' || sex == '3' || sex=='0') {
					tfSex.setText("남자");
					
				}else {
					tfSex.setText("여자");
					
				}
				
				//(2)주민등록 번호에서 출신지를 구함 
				
				char area = ID.charAt(8);
				String ainfo = "";
				switch(area) {
				
				case '1' : ainfo ="서울";break;
				case '2' : ainfo ="경기";break;
				case '3' : ainfo ="강원";break;
				case '4' : ainfo ="대전";break;
				default : ainfo = "제주및 지방";break;
				
				}
				tfHome.setText(ainfo);
				
				
				
				
				//(3)나이를 구함.
				int ages = Integer.parseInt(ID.substring(0, 2));
				
				Calendar c = Calendar.getInstance();
				int year =c.get(Calendar.YEAR);
				
				
				//1900년대 일 때 -> 뒷자리가 1,2 일 때 현재 년도 2020 - 1994
				if(ID.charAt(7)=='1'||ID.charAt(7)=='2') {
					ages = year-(ages+1900);
					tfAge.setText(String.valueOf(ages));
					
					
				}else if(ID.charAt(7)=='3'||ID.charAt(7)=='4') {
					ages = year-(ages+2000);
					tfAge.setText(String.valueOf(ages));
					
				}
				
				
				
				
				

			}
		});
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String evt=tf.getText();
				

				JOptionPane.showMessageDialog(null, evt + "입력했오2");

			}
		});
		
		
		
		//윈도우에 x 버튼 눌렸을 때의 이벤트 처리.
		addWindowListener(new WindowAdapter() { // windowadapter 를 사용해서 원하는 메소드만 오버라이딩 할 수도 있다.
												// WindowAdapter 가 이미 Listener의 메소드를 모두 오버라이딩 하고 있으니,
												//그걸 상속 받는 클래스를 만들면 내가 원하는 것만 쓸 수 있다.
			
												//자동으로 implements나  extends를 써준다.
			
												// 윈도우 어댑터를 사용하려면 내가 오버라이딩 하고 싶은 메소드만 남기고 다 지우면된다.
												// 타이핑하다 틀릴수도 있으니까 windowListener를 먼저써서 추상메소드를 모두 불러오고
												// 내가 사용할 것만 남기고 다 지워주는 식으로 하는게 좋다.
			
		
			
			@Override
			public void windowClosing(WindowEvent e) { // 이거 하려고 아까 디스플레이에 엑스누르면 종료하는 기능을 뺌-> 오른쪽 상단 x를
														// 눌렀을 때
				int result = JOptionPane.showConfirmDialog(null, "진짜나감?"); // 물어봐줌
				if(result==JOptionPane.OK_OPTION) {
					// o 일때만 나감
					System.exit(0);
				}
					
				
			}
			
		});

	}

	public static void main(String[] args) {

		Infotest_액션붙이기 t = new Infotest_액션붙이기();

		t.display();
		t.performProc();

	}

}
