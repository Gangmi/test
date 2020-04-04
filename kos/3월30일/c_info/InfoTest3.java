package c_info;

import javax.swing.*;
import java.awt.*; // 레이아웃 때문에 

public class InfoTest3 extends JFrame {
	// 1.멤버변수
	JTextArea ta;
	JButton badd, bshow, bsearch, bdelete, bcancel, bexit;
	JTextField tf, tfID, tfTel, tfSex, tfAge, tfHome;

	// 2.객체생성
	public InfoTest3() {
		
		
		
		
		
		
		ta = new JTextArea(300,200);
		
		badd = new JButton("add" , new ImageIcon("3월30일/c_info/imgs/2.PNG"));
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
		JLabel l = new JLabel("Name",10);
		JLabel l2 = new JLabel("ID" , 10);
		JLabel l3 = new JLabel("Tel",10);
		JLabel l4 = new JLabel("Sex",10);
		JLabel l5 = new JLabel("Age",10);
		JLabel l6 = new JLabel("Home",10);
		
		
		
		
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
		
		//센터 
		add(ta , BorderLayout.CENTER);
		
		
		//아래쪽  패널 
		JPanel bp = new JPanel(new GridLayout(1,6));
		bp.add(badd );
		bp.add(bshow);
		bp.add(bsearch);
		bp.add(bdelete);
		bp.add(bcancel);
		bp.add(bexit);
		
		add(bp, BorderLayout.SOUTH);
		
		
		
		

		setLocation(200, 200); // 화면 띄울 때 배치하는 자리.
		setSize(700, 560);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		InfoTest3 t = new InfoTest3();

		t.display();

	}

}
