package model.dao;

import java.awt.Component;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

import model.CustomerDao;
import model.vo.Customer;

public class CustomerModel implements CustomerDao {
	String url;
	String user;
	String pass;

	public CustomerModel() throws Exception {
		// 1. 드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		url = "jdbc:oracle:thin:@192.168.0.18:1521:orcl";
		user = "kmin";
		pass = "1234";

	}

	public int insertCustomer(Customer vo) throws Exception {
		// 2. Connection 연결객체 얻어오기
		Connection con = DriverManager.getConnection(url, user, pass);

		// 3. sql 문장 만들기
		try {
			String sql = "insert into member values (?,?,?,?,?)";

			PreparedStatement addmem = con.prepareStatement(sql);
			addmem.setString(1, vo.getCustTel1());
			addmem.setString(2, vo.getCustName());
			addmem.setString(3, vo.getCustTel2());
			addmem.setString(4, vo.getCustAddr());
			addmem.setString(5, vo.getCustEmail());

			int result = addmem.executeUpdate();
			addmem.close();

			return 1;

		} finally {
			con.close();
		}

		// 4. sql 전송객체 (PreparedStatement)
		// 5. sql 전송
		// 6. 닫기

	}

	public Customer selectByTel(String tel) throws Exception {
		Customer dao = new Customer();
		Connection con = DriverManager.getConnection(url, user, pass);
		try {
			String sql = "select * from member where tel = ? ";

			PreparedStatement addmem = con.prepareStatement(sql);
			addmem.setString(1, tel);

			ResultSet rs = addmem.executeQuery();
			while (rs.next()) {
				dao.setCustTel1(rs.getString("TEL"));
				dao.setCustName(rs.getString("M_NAME"));
				dao.setCustTel2(rs.getString("M_SUBTEL"));
				dao.setCustAddr(rs.getString("M_ADR"));
				dao.setCustEmail(rs.getString("M_MAIL"));
			}
			addmem.close();
			return dao;

		} finally {
			con.close();
		}

	}

	public int updateCustomer(Customer vo) throws Exception {

		int result = 0;
		Connection con = DriverManager.getConnection(url, user, pass);

		// 3. sql 문장 만들기
		try {
			String sql = "update member set M_NAME =? , M_SUBTEL=? , M_ADR=? , M_MAIL=?  where TEL = ?  ";

			PreparedStatement addmem = con.prepareStatement(sql);
			addmem.setString(1, vo.getCustName());
			addmem.setString(2, vo.getCustTel2());
			addmem.setString(3, vo.getCustAddr());
			addmem.setString(4, vo.getCustEmail());
			addmem.setString(5, vo.getCustTel1());

			result = addmem.executeUpdate();
			addmem.close();

			return 1;

		} finally {
			con.close();
		}

		
	}

	@Override
	public void searchByname(String name) throws Exception {
		Connection con = DriverManager.getConnection(url, user, pass);
		try {
			String sql = "select * from member where M_NAME = ? ";

			PreparedStatement addmem = con.prepareStatement(sql);
			addmem.setString(1, name);

			ResultSet rs = addmem.executeQuery();
			ArrayList<Customer> ct = new ArrayList<Customer>();
			Customer dao = new Customer();
			while (rs.next()) {
				dao.setCustTel1(rs.getString("TEL"));
				dao.setCustName(rs.getString("M_NAME"));
				dao.setCustTel2(rs.getString("M_SUBTEL"));
				dao.setCustAddr(rs.getString("M_ADR"));
				dao.setCustEmail(rs.getString("M_MAIL"));
				ct.add(dao);
				
			}
			JList list = new JList();
			JDialog jd = new JDialog();
			
			DefaultListModel<String> wish = new DefaultListModel<String>(); 
			
			JScrollPane list_P = new JScrollPane();
			list_P.setPreferredSize(new Dimension(300,150));
			
			for(int i =0; i<ct.size(); i++) {
				list.add(ct.get(i).getCustName()+"  "+ct.get(i).getCustTel1()+"\n");
				
			}
			
			
			
			
			
			
			
			addmem.close();
			

		} finally {
			con.close();
		}
		
		
	}
}
