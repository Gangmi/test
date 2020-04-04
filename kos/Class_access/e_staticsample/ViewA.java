package e_staticsample;

public class ViewA {

	DBConnect db; // 자동 초기화 = null; 해도 상관은 없음.

	public ViewA() {
		
		 db = DBConnect.getInstance(); // 싱글톤 패턴 -> 이런식으로 객체를 받는 경우가 있다. 캘린더가 이런 경우이다.//웹에서는 싱글톤 패턴을 사용한다.

	}

	public void use() {
		System.out.println("디비 작업중");
	}

}
