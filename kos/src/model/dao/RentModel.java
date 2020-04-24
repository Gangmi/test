package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import model.RentDao;


public class RentModel implements RentDao {
	
	
	Connection con;
	String url;
	String user;
	String pass;
	
	public RentModel() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		url = "jdbc:oracle:thin:@192.168.0.18:1521:orcl";
		user = "kmin";
		pass = "1234";
		
				
	}

	@Override
	public String selectBytel(String tel) throws Exception {
		
		con = DriverManager.getConnection(url, user , pass);
		
		String sql = "select M_NAME FROM MEMBER WHERE TEL = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, tel);
		
		ResultSet rs =ps.executeQuery();
		
		rs.next();
		
		 String result =rs.getString("M_NAME");
		
		
		
		
		
	
		return  result;
	}

	@Override
	public int rentVideo(String tel, String vnum) throws Exception {
		
		con = DriverManager.getConnection(url, user , pass);
		
		String sql = "insert into rent_ctrl values(sq_member.nextval,?,?,sysdate,null) ";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, vnum);
		ps.setString(2, tel);
		
				
		
		
		int result =ps.executeUpdate();
		
		
		
		
		
		return result;
	}

	@Override
	public int returnVideo(String vnum , String tel) throws Exception {
		con = DriverManager.getConnection(url, user , pass);
		String sql = "update rent_ctrl set return_date = sysdate where tel = ? and rent_num= ? ";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, tel);
		ps.setString(2, vnum);
		
		int result=ps.executeUpdate();
		
		return result;
	}

	@Override
	public ArrayList<ArrayList> selectList() throws Exception {
		
		con = DriverManager.getConnection(url, user , pass);
		
		String sql = "select r.RENT_NUM rnum, r.VIDEO_NUM vnum, v.title title , m.m_name name,  r.TEL tel, r.RENT_DATE rdate, r.RETURN_DATE redate from rent_ctrl r , video_ctrl v , member m where r.video_num = v.video_num and r.tel = m.tel";
		
		Statement st = con.createStatement();
		
		ResultSet rs =st.executeQuery(sql);
		
		ArrayList result = new ArrayList();
		
		while(rs.next()) {
			ArrayList result2 = new ArrayList();
			
			result2.add(rs.getString("RNUM"));
			result2.add(rs.getString("VNUM"));
			result2.add(rs.getString("TITLE"));
			result2.add(rs.getString("NAME"));
			result2.add(rs.getString("TEL"));
			result2.add(rs.getString("RDATE"));
			result2.add(rs.getString("REDATE"));
			
			result.add(result2);
			
		}
		
		
		
		return result;
	}
	
	
}
