package e_staticsample;

public class ViewB {

	DBConnect db; // 자동 초기화 = null; 해도 상관은 없음.

	public ViewB() {
		db = DBConnect.getInstance();

	}

	public void use() {
		System.out.println("디비 작업중");
	}

}
