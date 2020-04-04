package io.readerwriter_4월2일_5;

import java.io.*;
import java.nio.CharBuffer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReaderWriterTest
{
	public static void main( String args[])
	{
		UIForm3 ui = new UIForm3();
		ui.addLayout();
		ui.eventProc();	
	}	
}

//========================================
//	화면을 관리하는 클래스 
//----------------------------------------
class UIForm3 extends JFrame
{
	JTextArea	ta;
	JButton 		bSave, bLoad, bClear;
	
	UIForm3()
	{
		ta		= new JTextArea();		
		bSave 	= new JButton("파일저장");
		bLoad	= new JButton("파일읽기");
		bClear	= new JButton("화면지우기");
	}
	
	void addLayout()
	{
		JPanel pCenter 	= new JPanel();
		pCenter.setLayout( new BorderLayout() );
		
		// JscrollPane을 만들고 거기에 ta 를 넣어도 되지만, 스크롤을 만들면서 바로 넣어도 된다.
		pCenter.add("Center", new JScrollPane(ta) );
	
		JPanel pSouth	= new JPanel();
		pSouth.add( bSave );
		pSouth.add( bLoad );
		pSouth.add( bClear );
		
		getContentPane().add("Center", pCenter );
		getContentPane().add("South",  pSouth );
		
		setSize( 400, 350 );
		setVisible( true );
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	void eventProc()
	{
		EventHandler hdlr = new EventHandler();
		
		bSave.addActionListener(hdlr);
		bLoad.addActionListener(hdlr);
		bClear.addActionListener(hdlr);
		
	}
	
	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			Object evt = ev.getSource();
			
			// "화일저장" 버튼이 눌렸을 때 
			if( evt == bSave){
				JFileChooser fd = new JFileChooser(); // 파일 저장 다이얼로그 이다.
				int returnValue = fd.showSaveDialog( null ); 
				if( returnValue == JFileChooser.APPROVE_OPTION ) // 승인을 눌러야만 저장한다.
				{
					File f = fd.getSelectedFile();
					try{
						/** 
						 * @@@@@@@@@@@@@@@@@@@@@@@@@
						 * */
						
						String msg = ta.getText();
						
						FileWriter fw = new FileWriter(f);
						fw.write(msg);
						fw.close();
						
						
						
						
					}catch(Exception ex){
						System.out.println("저장 실패");
					}	
				}
			}
			//로드가 눌렸을 때
			if(evt == bLoad) {
				//파일 다이얼로그의를 생성 근데 뭘 할지는 모름
				JFileChooser fd = new JFileChooser();
				
				
				//파일 다이얼로그를 띄우기 위한 코드 어떤 다이얼로그를 띄울지 그리고 어떤 창에서 띄울지또는 독립적으로 띄울지 그리고 그 값을 저장.
				int value = fd.showOpenDialog(null);
				
				// approve 옵션의 정수값과 위의 눌린 값이 같을때를 확인함. -> 어떤 버튼이 눌렸는지를 확인함
				if(value == JFileChooser.APPROVE_OPTION) {
					
					//내가 누른 파일을 받아옴
					File f = fd.getSelectedFile();
					
					try {
						FileReader fr = new FileReader(f); //문자형으로 읽을것이기 때문에 Filewriter 로 저장 -> 
														   //filereader로 읽기
						
						
						//저장할 문자 배열을 만듦 -> 1 킬로 바이트의 용량까지 받아옴
						char ch[] = new char[1024*3] ;
						
						//read를 통해 위의 배열에 값이 담김.
						fr.read(ch);
						//setText 에는 STring 만 들어가야 하니까 형변환
						ta.setText(String.valueOf(ch));
						
						
				
						
						
						
					
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
			}
			
			if(evt== bClear) {
				ta.setText(null);
			}
			
			// "화일읽기" 버튼이 눌렸을 때 
			
			
		
		}
	}
}