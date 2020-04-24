package  view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import model.dao.RentModel;
import model.vo.Video;



public class RentView extends JPanel 
{
	JTextField tfRentTel, tfRentCustName, tfRentVideoNum;
	JButton bRent;
	
	JTextField tfReturnVideoNum;
	JButton bReturn;
	
	JTable tableRecentList;
	
	RentTableModel rentTM;
	
	//모델단
	
	RentModel model;
	

	
	//==============================================
	//	 생성자 함수
	public RentView(){
		connectDB();
		addLayout();	//화면구성
		eventProc();	//DB연결
		selectlist();
	}
	
	// DB 연결
	void connectDB(){
		try {
			model = new RentModel();
		} catch (Exception e) {
			System.out.println("대여관리 db연결실패" + e.getMessage());
			
		
		}
		
		
		
		
	}
	
	
	// 이벤트 등록
	public void eventProc(){
		BtnHandler handler = new BtnHandler();
		
		tfRentTel.addActionListener(handler);
		bRent.addActionListener(handler);
		bReturn.addActionListener(handler);
		
		tableRecentList.addMouseListener(new MouseAdapter() {
		
			
			public void mouseClicked(MouseEvent e) {
				int row = tableRecentList.getSelectedRow();
				tfRentVideoNum.setText((String) tableRecentList.getValueAt(row, 1));
				tfRentTel.setText((String) tableRecentList.getValueAt(row, 4));
				tfRentCustName.setText((String) tableRecentList.getValueAt(row, 3));
				
				
			}
		});
		
		
		
		
		

		                         
	}
	
	
	//이벤트 핸들러 -> 액션리스너를 구현한 클래스
	
	class BtnHandler implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			Object evt = e.getSource();
			
			
			if(evt == tfRentTel) {
				selectBytel();
				
			}else if (evt == bRent) {
				rentVideo();
				
			}else if (evt == bReturn) {
				returnVideo();
			}
			
		
			
		}
		void selectBytel() {
			String tel = tfRentTel.getText();
			
			try {
				String result =model.selectBytel(tel);
				tfRentCustName.setText(result);
				
			} catch (Exception e) {
				
				
	
			}
			
			
			
		}
		void rentVideo() {
			String tel = tfRentTel.getText();
			String vnum = tfRentVideoNum.getText();
			try {
				int result =model.rentVideo(tel, vnum);
				JOptionPane.showMessageDialog(null, result+" 개 대여 완료");
				selectlist();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
		void returnVideo() {
			String vnum = tfReturnVideoNum.getText();
			String tel = tfRentTel.getText();
			try {
				int result=model.returnVideo(tel, vnum);
				selectlist();
				
				JOptionPane.showMessageDialog(null, result +"개 반납완료");
				
			} catch (Exception e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
		
	}
	
	/*	객체 생성 및 화면 구성   */
	void addLayout(){
		tfRentCustName = new JTextField();
		tfRentTel = new JTextField();
		tfRentVideoNum = new JTextField();
		tfReturnVideoNum = new JTextField(10);  
		
		bRent = new JButton("대여");
		bReturn = new JButton("반납");
		
		rentTM = new RentTableModel();
		tableRecentList = new JTable(rentTM);
		
		
		

		
		
	
		
		
		//전체 레이아웃 설정
		setLayout(new BorderLayout());
		
		//아래 패널
		JPanel down = new JPanel(new BorderLayout());
		JScrollPane jsrent = new JScrollPane(tableRecentList); // 스크롤팬을 만들면서 안에 담아야 함
		
		
		//테이블모델에 db연결 후 대여에있는 모든 데이터 가져오기
		
		
		

		
		down.add(jsrent);
		
		add(down, BorderLayout.CENTER);
		
		
		JPanel up = new JPanel(new GridLayout(1,2));
		
		
		
			JPanel upleft = new JPanel(new GridLayout(4,2));
			upleft.setBorder(new TitledBorder("대여"));
			JLabel tel = new JLabel("전화번호");
			JLabel name = new JLabel("고객명");
			JLabel vnum = new JLabel("비디오 번호");
		
			upleft.add(tel);
			upleft.add(tfRentTel);
			upleft.add(name);
			upleft.add(tfRentCustName);
			upleft.add(vnum);
			upleft.add(tfRentVideoNum);
			upleft.add(bRent);
			
			up.add(upleft);
			add(up, BorderLayout.NORTH);
			
			
			
			
			JPanel upright = new JPanel();
			JLabel rentvnum = new JLabel("비디오번호"); 
			upright.setBorder(new TitledBorder("반납"));
			
			upright.add(rentvnum);
			upright.add(tfReturnVideoNum);
			
		upright.add(bReturn);
		
		
		
		
		
		
		up.add(upright);
		
		
		
		
	}
	
	void selectlist() {
		try {
			rentTM.data=model.selectList();
			tableRecentList.setModel(rentTM);
			rentTM.fireTableDataChanged();
			
		} catch (Exception e) {
			
			System.out.println("연결실패"+e.getMessage());
		}
	}

	class RentTableModel extends AbstractTableModel { 
		  
		ArrayList data = new ArrayList();
		String [] columnNames = {"대여번호","비디오번호","제목","고객명","전화번호","대여날짜","반납날짜"};

			public int getColumnCount() { 
		        return columnNames.length; 
		    } 
		     
		    public int getRowCount() { 
		        return data.size(); 
		    } 

		    public Object getValueAt(int row, int col) { 
				ArrayList temp = (ArrayList)data.get( row );
		        return temp.get( col ); 
		    }
		    
		    public String getColumnName(int col){
		    	return columnNames[col];
		    }
	}

	

	
}
