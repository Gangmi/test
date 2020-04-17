import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class testTable {
	 String[] columnType = { "번호", "이름", "나이", "성별"};

	 Object[][] data = {

	       {"1", "김철수", "20", "남성"},

	       {"2", "김옥자", "43", "여성"},

	       {"3", "이순신", "100", "남성"},

	       {"4", "유관순", "18", "여성"},

	       {"5", "이 도", "54", "남성"}};
	       

	public static void main(String[] args) {
		testTable t = new testTable();
		
		JFrame a = new JFrame();
		a.setLocationRelativeTo(null);
		a.setLayout(new BorderLayout());
		JTable jt = new JTable(t.data,t.columnType);
		JScrollPane w = new JScrollPane(jt);
		
		a.add(w,BorderLayout.CENTER);
		
		
		a.setSize(500,400);
		a.setVisible(true);

	}

}
