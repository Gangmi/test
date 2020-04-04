package network3.chat;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

class ChatClient_4월3일_8 implements ActionListener, Runnable {
	JFrame f;

	JTextField connTF, sendTF;
	JButton connB, sendB;
	JTextArea ta;

	Socket s;
	BufferedReader in;
	OutputStream out;
	
	

	// 추가0 : 대화명을 바꾸기
	JTextField changeNameTF;
	JButton changeNameB;

	// 추가2 : 방인원의 대명 보여주기
	// 변수 선언
	JList memberList;
	Vector list;

	public ChatClient_4월3일_8() {
		f = new JFrame("Chat Client");

		connTF = new JTextField();
		sendTF = new JTextField();
		connB = new JButton("접 속");
		sendB = new JButton("확 인");
		ta = new JTextArea(15, 40);

		// 추가0: 대화명 바꾸기
		changeNameTF = new JTextField("guest", 10);
		changeNameB = new JButton("바꾸기");
		JPanel p_changeName = new JPanel();
		p_changeName.add(new JLabel("대화명 : "), "West");
		p_changeName.add(changeNameTF, "Center");
		p_changeName.add(changeNameB, "East");

		JPanel p_serverName = new JPanel();
		p_serverName.setLayout(new BorderLayout());
		p_serverName.add(new JLabel("서버입력 : "), "West");
		p_serverName.add(connTF, "Center");
		p_serverName.add(connB, "East");

		JPanel p_north = new JPanel();
		p_north.setLayout(new GridLayout(1, 2));
		p_north.add(p_changeName);
		p_north.add(p_serverName);

		JPanel p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		p2.add(new JLabel("메세지입력 : "), "West");
		p2.add(sendTF, "Center");
		p2.add(sendB, "East");

		// 추가2 : 방인원의 대화명 보여주기
		memberList = new JList();
		list = new Vector();
		JPanel p_east = new JPanel();
		p_east.setLayout(new BorderLayout());
		p_east.add("North", new JLabel("   우 리 방 멤 버   "));
		p_east.add("Center", memberList);

		f.getContentPane().add("North", p_north);
		f.getContentPane().add("Center", new JScrollPane(ta));
		f.getContentPane().add("South", p2);
		f.getContentPane().add("East", p_east);

		// f.setSize(500, 300);
		f.pack();
		f.setVisible(true);

		connTF.addActionListener(this);
		connB.addActionListener(this);
		sendTF.addActionListener(this);
		sendB.addActionListener(this);

		// 추가0: 대화명 바꾸기
		changeNameTF.addActionListener(this);
		changeNameB.addActionListener(this);
	}// 생성자 종료

	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (o == connTF || o == connB) {
			connProc();
		}

		else if (o == sendTF || o == sendB) {
			sendProc();
		}

		else if (o == changeNameTF || o == changeNameB) {
			changeNameProc();
		}
	} // actionPerformed ends

	// 이름을 바꾸는 버튼을 눌렀을 때 이벤트 처리
	void changeNameProc() {

		String nickname = "/name	 " + changeNameTF.getText() + "\n";

		try {
			out.write(nickname.getBytes());
		} catch (IOException e) {

			ta.append("이름 변경실패: " + e.toString());

		}
		JOptionPane.showMessageDialog(null, "대화명을 바꿉니다");

	}

	// 접속을 눌렀을 때 이벤트 처리
	void connProc() {
//		JOptionPane.showMessageDialog(null, "서버에 접속합니다");

		String ip = connTF.getText();

		try {

			s = new Socket(ip, 1234); // 이게 만들어졌다는 것은 서버에 접속했다는 뜻
			out = s.getOutputStream(); //소켓에서 아웃풋스트림을 가져다가 out에 저장
			
			in = new BufferedReader(new InputStreamReader(s.getInputStream())); // 바이트 형과 문자형을 한데 쓸 수없음
			// 따라서 InputStreamReader 를 통해 바이트형인 s를 문자형으로 변형
			
			

			new Thread(this).start(); // 러너블을 구현한 클래스를 인자로 주어서 thread 함수에 있는 start를 불러옴
										//접속한 순간부터 서버에서 오는 채팅을 받아주기 위해

		} catch (Exception e) {

			ta.setText("접속 실패" + e.toString());
		}

	} // connProc ends

	//채팅이 들어오는지 계속 봐주는 스레드
	@Override
	public void run() {
		// 서버가 보내주는 것을 읽기 위해서 언제 부터? 접속한 시점부터
		while (s.isConnected()) {
			in.read

			String msg = null;
			
			try {
				msg = in.readLine();
				
				
			} catch (IOException e) {

				ta.append("읽기실패 :" + e.toString());

			}

			ta.append(msg + "\n");// \n 까지 읽기 위해서
		}

	}

	// 보내기를 눌렀을 때 이벤트 처리
	void sendProc() {

	
		
		
		
		
		
		
		
//		JOptionPane.showMessageDialog(null, "메세지를 전송합니다");

		// 엔터를 친 순간에 msg에 저장하고
		String msg = sendTF.getText() + "\n"; // 여기까지가 한 문장이라는 뜻

		// 아웃풋에 쓴다
		try {
			out.write(msg.getBytes()); // 통로가 바이트 단위로 끊어서 가기 때문에 String 을 Byte로 바꿔줌

			// 쓰지 못했을 때
		} catch (IOException e) {
			ta.append("쓰기실패" + e.toString());

		}
		// 보내고 나서 지워줌
		sendTF.setText(null);

	}// sendProc ends

	public static void main(String[] args) {
		new ChatClient_4월3일_8();
	}

}// ChatClient ends
