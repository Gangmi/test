package c_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InfoModelimpl implements InfoModel {

	// 이 클래스는 jdbc 연결만 담당한다.

	String url = "jdbc:oracle:thin:@192.168.18:1521:orcl";
	String user = "scott";
	String pass = "tiger";

	public InfoModelimpl() throws Exception { // 여기서 예외를 잡으면 화면은 알수가 없으니까
		// 1.드라이브 로딩

		Class.forName("oracle.jdbc.driver.OracleDriver");
	}

	// 각각에 해당하는 jdbc 연동

	public void insert(InfoVO vo) throws SQLException { // 구현한 인터페이스가 다르다. 따라서 인터페이스 수정
		Connection con = null;

		try { // try - finally도 가능하다.
			// 2.연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. sql 문장 만들기
			String sql = "INSERT INTO info_tab(name,jumin, tel, gender,age, home) " + " VALUES(?,?,?,?,?,?)";

			// 4.전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);

			// 얻은 객체로 값 세팅
			st.setString(1, vo.getName());
			st.setString(2, vo.getJumin());
			st.setString(3, vo.getTel());
			st.setString(4, vo.getGender());
			st.setInt(5, vo.getage());
			st.setString(6, vo.getHome());

			// 5.전송
			st.executeUpdate();

			// 6 닫기

			st.close();

		} finally { // 예외 발생시에 이 함수자체는 다 넘김
			con.close();
		}

	}

	public ArrayList<InfoVO> selectAll() throws SQLException {
		// 화면에서 전체보기 버튼이 눌려졌을 때
		Connection con = null;

		// 1.커넥션 얻어오기
		try {
			con = DriverManager.getConnection(url, user, pass);

			// 2. sql 만들기
			String sql = "select * from info_tab";

			// 3.전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);

			// 4.전송 및 반환

			ResultSet rs = st.executeQuery();

			ArrayList<InfoVO> list = new ArrayList<InfoVO>();

			while (rs.next()) {
				InfoVO vo = new InfoVO();
				vo.setName(rs.getString("NAME"));
				vo.setJumin(rs.getString("JUMIN"));
				vo.setTel(rs.getString("TEL"));
				vo.setGender(rs.getString("GENDER"));
				vo.setage(rs.getInt("AGE"));
				vo.setHome(rs.getString("HOME"));

				// 위에서 가져온 데이터의 객체인 vo 를 list에 담는다.
				list.add(vo);

			}
			st.close();
			rs.close();
			return list;

			// 5.닫기
		} finally {
			con.close();

		}

	}

	

	public InfoVO selectByTel(String tel) throws SQLException {

		InfoVO vo = new InfoVO();
		Connection con = null;

		try { // try - finally도 가능하다.
				// 2.연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. sql 문장 만들기
			String sql = "select * from info_tab where tel =? ";

			// 4.전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, tel);
			// 5.전송
			ResultSet rs = st.executeQuery();

			// 6.결과처리

			if (rs.next()) {
				vo.setName(rs.getString("NAME"));
				vo.setJumin(rs.getString("JUMIN"));
				vo.setTel(rs.getString("TEL"));
				vo.setGender(rs.getString("GENDER"));
				vo.setage(rs.getInt("AGE"));
				vo.setHome(rs.getString("HOME"));
			}

		} catch (Exception e) {

		}

		return vo;
	}

	public void modify(InfoVO vo) throws SQLException {
		Connection con = null;

		try { // try - finally도 가능하다.
			// 2.연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. sql 문장 만들기
			String sql = "UPDATE info_tab SET name=?,jumin=?, gender=?,age=?, home=? WHERE tel=? "; 

			// 4.전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);

			// 얻은 객체로 값 세팅
			st.setString(1, vo.getName());
			st.setString(2, vo.getJumin());
			st.setString(3, vo.getGender());
			st.setInt(4, vo.getage());
			st.setString(5, vo.getHome());
			st.setString(6, vo.getTel());

			// 5.전송
			st.executeUpdate();

			// 6 닫기

			st.close();

		} finally { // 예외 발생시에 이 함수자체는 다 넘김
			con.close();
		}

	}

	
	public void delete(String tel) throws SQLException {
		Connection con = null;

		try { // try - finally도 가능하다.
			// 2.연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);

			// 3. sql 문장 만들기
			String sql = "DELETE FROM info_tab WHERE tel=?"; 

			// 4.전송객체 얻어오기
			PreparedStatement st = con.prepareStatement(sql);

			// 얻은 객체로 값 세팅
			
			st.setString(1,tel);

			// 5.전송
			st.executeUpdate();

			// 6 닫기

			st.close();

		} finally { // 예외 발생시에 이 함수자체는 다 넘김
			con.close();
		}

		
		
		
		
		
		
	}

}
