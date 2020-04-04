package io.json_4월2일_6;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class MyFrame extends JFrame
{
	// 변수선언
	JTextField tfName, tfTel, tfJumin, tfGender, tfAge, tfHome;
	JButton bSave, bOpen;
	
	// 객체 생성
	public MyFrame(){		
		super("나의 첫 화면");
		tfName = new JTextField(15);
		tfTel = new JTextField(15);
		tfJumin = new JTextField(15);
		tfGender = new JTextField(15);
		tfAge = new JTextField(15);
		tfHome = new JTextField(15);
		
		bSave = new JButton("저장하기");
		bOpen = new JButton("읽어오기");
		
	}
	
	// 화면구성 및 보여주기
	public void addLayout(){
		
		JPanel p_center = new JPanel();
		p_center.setLayout( new GridLayout( 6, 2 ));
		p_center.add( new JLabel("이름"));
		p_center.add( tfName );
		p_center.add( new JLabel("전화"));
		p_center.add( tfTel );
		p_center.add( new JLabel("주민"));
		p_center.add( tfJumin );
		p_center.add( new JLabel("성별"));
		p_center.add( tfGender );
		p_center.add( new JLabel("나이"));
		p_center.add( tfAge );
		p_center.add( new JLabel("출신지"));
		p_center.add( tfHome );
		
		JPanel p_south = new JPanel();
		p_south.add( bSave );
		p_south.add( bOpen );
		
		add( p_center, BorderLayout.CENTER);
		add( p_south, BorderLayout.SOUTH);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		
	}
	
	// 이벤트 연결
	public void eventProc()
	{
		/* 이벤트 핸들러 객체 생성*/
		BtnHandler bHandler = new BtnHandler();
		
		/* 컴포넌트와 이벤트핸들러 연결 */
		bSave.addActionListener(bHandler);
		bOpen.addActionListener(bHandler);
		
	
	}
	
	/* 이벤트 핸들러 선언 */
	class BtnHandler implements ActionListener
	{
		public void actionPerformed( ActionEvent ev)
		{
			Object btn = ev.getSource();
			//JButton btn = (JButton)ev.getSource();
			if( btn == bSave ) {
				//JOptionPane.showMessageDialog(null, "저장합니다.");
				saveData();
			}else if ( btn ==  bOpen) {
				//JOptionPane.showMessageDialog(null, "입력합니다.");
				readData();
			}
		}
	} // end of class BtnHandler
	
	/**
			http://code.google.com/p/json-simple/
			왼쪽 메뉴 > Download >  json_simple-1.1.jar를 직접 다운
			Add External Jar 추가
	 */
	void saveData() {		
	
		try {
			JSONObject obj = new JSONObject(); // 해쉬맵형식으로 저장 함
			
			obj.put("name", tfName.getText()); // 키 밸류 ,키 밸류 저장 방식 -> 순서가 없다
			obj.put("tel" , tfTel.getText());
			obj.put("jumin" , tfJumin.getText());
			obj.put("age" , tfAge.getText());
			obj.put("gender" , tfGender.getText());
			obj.put("home" , tfHome.getText());
			
			FileWriter fw = new FileWriter("src\\io.json_4월3일_6");   
			fw.write(obj.toJSONString()); // obj를 스트링으로 변환해서 쓴다. 이렇게 하면 json 형식으로 저장을 해준다.
			
			fw.close(); 
			
			
			
			
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	void readData() {		//읽기 버튼이 눌렸을 때 
		 
		try {
			FileReader fr = new FileReader("src\\io.json_4월3일_6");
			JSONParser parser =new JSONParser();
			//parse 리턴형은 ob
			JSONObject jo = (JSONObject)parser.parse(fr);
			
			tfName.setText((String)jo.get("name"));
			tfAge.setText((String)jo.get("age"));
			tfGender.setText((String)jo.get("gender"));
			tfHome.setText((String)jo.get("home"));
			tfJumin.setText((String)jo.get("jumin"));
			tfTel.setText((String)jo.get("tel"));
			
			fr.close();
			
			

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
} // end of class MyFrame

public class GuiTest {
	public static void main(String[] args) {
		MyFrame my = new MyFrame();
		my.addLayout();
		my.eventProc();
	}
}
