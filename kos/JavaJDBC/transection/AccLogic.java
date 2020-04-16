package transection;

import java.sql.*;

//transection 처리를 하는 법
//1. 오토 커밋을 막고
//2.오라클에서 어떤 문제가 발생해서 어떤 값이 돌아오는지 확인해서 
//3. 특정 값이 돌아왔을 때 rollback을 통해서 결과를 돌려버리고 , 제어권을 반납해버린다.

public class AccLogic {
	// 연결 객체 생성시 필요한 변수 선언
	String url;
	String user;
	String pass;

	// ===============================================
	// 드라이버를 드라이버매니저에 등록
	public AccLogic() throws Exception {
		/////////////////////////////////////////////////////////
		// 1. 드라이버를 드라이버 매니저에 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		url = "jdbc:oracle:thin:@192.168.0.18:1521:orcl";
		user = "scott";
		pass = "tiger";
	}

	// ====================================================
	// 보내는 계좌번호와 받는 계좌번호와 계좌금액을 넘겨받아
	// 보내는계좌에서 계좌금액을 빼고 받는계좌에서 계좌금액을 더한다
	public int moveAccount(String sendAcc, String recvAcc, int amount) {
		Connection con = null;

		///////////////////////////////////////////////////////////
		// 1. Connection 객체 생성
		try {
			con = DriverManager.getConnection(url, user, pass);
			con.setAutoCommit(false);
			String sendsql = "update ACCOUNT set AMOUNT = AMOUNT-? WHERE ACCOUNT_NUM = ? ";
			PreparedStatement sendps1 = con.prepareStatement(sendsql);

			// 물음표지정하기
			sendps1.setInt(1, amount);
			sendps1.setString(2, sendAcc);

			// 보내기
			int rs1 = sendps1.executeUpdate(); // 오라클 내부적으로 쿼리를 사용하면 메모리적으로 처리를 하지만, 자바는 자동으로 커밋을 해 버린다.
			// 이걸 막아야 뒤에것이 실행되지않았을 때 전체가 실행되지 않게 할 수 있다.

			if (rs1 == 0) { // 실행된 행이 없을 때 롤백
				con.rollback();
				sendps1.close();
				return -1;
			}

			String recvsql = "update ACCOUNT set AMOUNT = AMOUNT + ? WHERE ACCOUNT_NUM= ?";

			PreparedStatement recvps = con.prepareStatement(recvsql);
			// 물음표 지정
			recvps.setInt(1, amount);
			recvps.setString(2, recvAcc);

			int rs2 = recvps.executeUpdate();
			if (rs2 == 0) {
				con.rollback();
				recvps.close();
				return -1;
			}

			// 가급적 하나의 문장당 하나의 전송객체를 이용하는게 나음.

			con.commit();

			System.out.println("연결성공");
		} catch (SQLException e) {
			System.out.println("db연결 실패" + e.getMessage());

			try {
				con.rollback();
			} catch (SQLException e1) {

			}
			return -1;

		} finally {
			try {
				con.close();
			} catch (Exception e) {

			}
		}
		// @@ 2. Auto-commit을 해제

		// 3. 출금계좌에서 이체금액을 뺀다
		// 4. 입금계좌에 이체금액을 더한다
		// @@ 5. commit을 전송한다
		// 6. 객체 닫기
		// - 만일 정상적인 경우는 0을 리턴하고 도중에 잘못되었으면 트랜잭션을 롤백시키고 -1을 리턴

		return 0;
	}

	// =======================================================
	// 보내는계좌번호와 받는계좌번호를 넘겨받아
	// 보내는계좌고객명과 보내는계좌의남은 금액을 얻어오고
	// 받는계좌고객명을 얻어와서
	// 얻은 정보를 ConfirmData객체에 넣고 리턴
	public ConfirmData confirmAccount(String sendAcc, String recvAcc) throws Exception {

		String sendCust = "", recvCust = "";
		int gainMoney = 0;
		ConfirmData resultData = null;

		// 1. Connection 객체 생성
		// 2. 테이블에서, 넘겨받은 sendAcc와 같은 account_num필드에서 customer, amount를 얻어온다
		// 3. 테이블에서, 넘겨받은 recvAcc와 같은 account_num필드에서 customer를 얻어온다
		// 4. 2와 3에서 얻은 값을 ConfirmData 객체에 저장
		// 5. 4번의 객체를 리턴

		return resultData;
	}

}

//#################################################################
//	테이블명 : account
//	account_num		계좌번호		varchar2(20)
//	customer		고객명			varchar2(20)
//	amount			계좌금액		int
