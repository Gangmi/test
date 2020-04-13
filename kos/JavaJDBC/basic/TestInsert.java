package basic;

import java.sql.*;


public class TestInsert {

	public static void main(String[] args) {
		
		new oracle.jdbc.driver.OracleDriver();
		
		//1.드라이버 로딩 - > 자바에 오라클 라이브러리를 넣어놨으니까 , 연결은 되는데 로딩을 해야 함
		//jar -> 자바의 파일을 묶어놓은것 - 아까 자바에 넣은 그 jar파일 안에 oracle driver 라는 클래스가 있다.
		//new oracle.jdbc.driver.Oracledriver(); 처럼 객체를 생성해야하는데 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// forname 으로 괄호안에 있는 내용을 찾아 자동으로 해줌
			
			//2.connection얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.18:1521:orcl","scott","tiger");
					//우리가 현재 사용하는 드라이버이름은 thin (url,id,pw) 
			
			//3.sql 문장
			String sql = "INSERT INTO emp(empno,ename,sal)VALUES(9001,'맹순이',4000)";
			// 쿼테이션 스몰쿼테이션 잘 구분
			
			//4.전송객체 얻어오기,
			Statement st = con.createStatement();
			
			//5.전송
			st.executeUpdate(sql);
			
			//6.각각의 객체 닫기
			
			st.close();
			con.close(); // -> 꼭 닫아야 함
			
			
			System.out.println("성공");
		} catch (Exception e) {
			
			System.out.println("실패 :" +e.getMessage());
		} 
		
		
		
		
		
		
		
		
		
		
	}

}
