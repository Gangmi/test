package e_staticsample;

public class ViewC {

	DBConnect db; // 자동 초기화 = null; 해도 상관은 없음.

	public ViewC() {
		db = DBConnect.getInstance();

	}

	public void use() {
		System.out.println("디비 작업중");
	}

}
