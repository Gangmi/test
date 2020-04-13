package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelect3 {

	public static void main(String[] args) {

		// 1.드라이버 로딩
		//
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// forname 으로 괄호안에 있는 내용을 찾아 자동으로 해줌

			// 2.connection얻어오기
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.18:1521:orcl", "hr", "hr");

			// 3.sql 문장
			// hr 계정에서 사원 번호 , 사원 풀네임 , 부서명을 출력
			// 급여가 3000 이상인 사원 목록
			String sql = "select e.employee_id id, e.first_name||' ' || e.last_name full_name, d.department_name from employees e, departments d where e.department_id = d.department_id  AND SALARY >= 3000 order by employee_id ";

			// select 문을 끌고 올 때 뒤에 공백이 있는것을 주의

			// 4.전송객체 얻어오기,
			Statement st = con.createStatement();

			// 5.전송
			st.executeUpdate(sql);

			// 6.각각의 객체 닫기
			ResultSet rs = st.executeQuery(sql);
			int count = 1;
			while (rs.next()) {
				System.out.print(count + "\t");
				System.out.print(rs.getString("ID") + "\t");
				System.out.print(rs.getString("FULL_NAME") + "\t" + "\t");
				System.out.print(rs.getString("DEPARTMENT_NAME") + "\t");
				System.out.println();
				count++;

			}

			rs.close();
			st.close();
			con.close(); // -> 꼭 닫아야 함

			System.out.println("성공");
		} catch (Exception e) {

			System.out.println("실패 :" + e.getMessage());
		}

	}

}
