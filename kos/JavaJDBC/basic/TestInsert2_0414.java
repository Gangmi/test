package basic;

import java.sql.*;


public class TestInsert2_0414 {

	public static void main(String[] args) {
		
		Connection con = null;
		
		
		//화면에서 받은 입력값이라고 생각
	
		int empno=9003;
		String ename ="김순이";
		int sal = 5000;
		
		
		//1.드라이버 로딩 - > 자바에 오라클 라이브러리를 넣어놨으니까 , 연결은 되는데 로딩을 해야 함
		//jar -> 자바의 파일을 묶어놓은것 - 아까 자바에 넣은 그 jar파일 안에 oracle driver 라는 클래스가 있다.
		//new oracle.jdbc.driver.Oracledriver(); 처럼 객체를 생성해야하는데 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.connection얻어오기
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.18:1521:orcl","scott","tiger");
					
			//3.sql 문장
//			String sql = "INSERT INTO emp(empno,ename,sal) VALUES("+empno+",'"+ename+"',"+sal+")";
			
			//우리가 쿼리를 사용 할 때마다 계속 작성할 수 없으니 , 변수를 받자
			
			String sql = "INSERT INTO emp(empno,ename,sal) VALUES(?,?,?)"; // 이런식으로 물음표를 가질수도 있다.
			//이건 동적 전송 객체
			
			
			
			
			//4.전송객체 얻어오기,
//			Statement st = con.createStatement();
			PreparedStatement st = con.prepareStatement(sql); // 위의 statement는 인자를 주지 않았지만, prepared는 들어간다
			//각물음표에 대입하는 값을 인덱스로처리.
			st.setInt(1, empno);
			st.setString(2, ename);
			st.setInt(3, sal);
			
			
			
			
			//5.전송***** statement 의 경우에는 sql을 끌고가지 않아서 execute에 써 줘야하지만, 
			//prepared는 이미 가지고 있기 때문에 가지고 가지 않아도 된다.
			st.executeUpdate(); // 따라서 여기서 괄호 안에 다시 sql을 쓰면 안된다.
			
			//6.각각의 객체 닫기
			
			st.close();
			
			
			
			System.out.println("성공");
		} catch (Exception e) {
			
			System.out.println("실패 :" +e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				
			}
				
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
