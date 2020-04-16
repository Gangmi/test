package jfreechart;

import java.sql.*;
import java.util.*;

public class Database {

	String URL = "jdbc:oracle:thin:@192.168.0.18:1521:orcl";
	String USER ="scott";
	String PASS = "tiger";

	public ArrayList<ArrayList> getData() {

		ArrayList<ArrayList> data = new ArrayList<ArrayList>();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(URL, USER , PASS);	
			
			//***************************************************************
			
			//입사일 순으로 그래프
//			String sql = " select nvl(to_char(hiredate,'MM'),'00') hire_month, count(*) cnt" + 
//					" from emp" + 
//					" group by to_char(hiredate,'MM')" + 
//					" order by hire_month";
			
			// 업무별 급여
			String sql = "select nvl(job,0) job, nvl(round(avg(sal)),0) avg_sal from emp group by nvl(job,0) order by job";
					 
			//월급 상위 5명		
					 
					
					
			//***************************************************************
			
			PreparedStatement stmt = con.prepareStatement( sql );	

			ResultSet rset = stmt.executeQuery();

			
			while( rset.next() ){
				ArrayList temp = new ArrayList();
				temp.add( rset.getInt("avg_sal"));		//****************		
				temp.add( rset.getString("JOB"));				//****************
				data.add(temp);
			}
			rset.close();
			stmt.close();
			con.close();
		} catch(Exception ex){
			System.out.println("에러 : " + ex.getMessage() );
		}
		return data;
	}
}
