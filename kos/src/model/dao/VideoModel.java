package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.VideoDao;
import model.vo.Video;

public class VideoModel implements VideoDao {
	String url;
	String user;
	String pass;

	public VideoModel() throws Exception {

		// 1. 드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		url = "jdbc:oracle:thin:@192.168.0.18:1521:orcl";
		user = "kmin";
		pass = "1234";

	}

	public void insertVideo(Video vo, int count) throws Exception {
		// 2. Connection 연결객체 얻어오기
		Connection con = DriverManager.getConnection(url, user, pass);

		// 3. sql 문장 만들기

		String sql = "Insert into video_ctrl values(SQ_MEMBER.nextval,?,?,?,?,?,?,500)"; //  우리 테이블은 가격이있어서
		// 4. sql 전송객체 (PreparedStatement)

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, vo.getVideoName());
		ps.setString(2, vo.getGenre());
		ps.setString(3, vo.getDirector());
		ps.setString(4, vo.getActor());
		ps.setString(5, vo.getExp());
		ps.setInt(6, count);

		// 5. sql 전송

		ps.executeUpdate();
		// 6. 닫기
		ps.close();
		con.close();
		
		
	}

	@Override
	public ArrayList<ArrayList> searchVideo(int index, String word) throws Exception {

		ArrayList<ArrayList> data = new ArrayList();
		Connection con = DriverManager.getConnection(url, user, pass);
		String[] colName = { "TITLE", "ACTOR" };

		String sql = "select video_num , title , actor from video_ctrl where " + colName[index] + " like '%" + word
				+ "%'";

		Statement ps = con.createStatement();

		ResultSet rs = ps.executeQuery(sql);

		while (rs.next()) {
			ArrayList<String> data2 = new ArrayList<String>();
			data2.add(rs.getString("VIDEO_NUM"));
			data2.add(rs.getString("TITLE"));
			data2.add(rs.getString("ACTOR"));
			data.add(data2);

		}

		return data;

	}

	public Video selectByPK(String vnum) throws Exception {
		Connection con = DriverManager.getConnection(url, user, pass);

		String sql = "select * from video_ctrl where video_num = ?";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, vnum);

		ResultSet rs = ps.executeQuery();

		Video vo = new Video();
		while (rs.next()) {
			vo.setActor(rs.getString("ACTOR"));
			vo.setDirector(rs.getString("DIRECTOR"));
			vo.setExp(rs.getString("DETAIL"));
			vo.setGenre(rs.getString("GENRE"));
			vo.setVideoName(rs.getString("TITLE"));

		}
		

		rs.close();
		con.close();
		return vo;
	}

}
