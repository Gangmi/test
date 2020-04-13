package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelect {

	public static void main(String[] args) {
		
		
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.커넥션 얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.18:1521:orcl","scott","tiger");
			//3.sql 문장
			String sql = "select empno,ename,sal,job from emp";
			//4.전송객체 얻어오기
			Statement st = con.createStatement();
			//5. 실질적인 전송
			ResultSet rs =st.executeQuery(sql); // 여기까지 하면 위의 쿼리문에 대한 결과를 넘겨줌
			
			//6. 넘겨받은 결과를 확인 -> 결과가 몇개 넘어올지 모르니까 while로 
			while(rs.next()) { // 다음 레코드가 있으면 트루/ 처음에 가리키는 위치는 처음행의 전이다. 다음 행이 있는지 알아보면서 한 칸 내려옴 
				System.out.print(rs.getInt(("EMPNO"))+ "\t");
				System.out.print(rs.getString(("ENAME"))+ "\t");
				System.out.print(rs.getInt(("SAL"))+ "\t");
				System.out.println(rs.getString("JOB"));
			}
			
			
			//7.닫기
			rs.close();
			st.close();
			con.close();
			
			
			
			
		}catch (Exception e){
			System.out.println("실패 : " + e.getMessage());
			
		}
		
		
		

	}

}
