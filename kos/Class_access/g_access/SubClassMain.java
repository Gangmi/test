package g_access;

import g_access.sub.Access;


//3. 다른 패키지이지만 상속 관계라면
public class SubClassMain  extends Access // 자바는 하나만 상속 가능
{
	public static void main(String[] args) 
	{
		// 자식 클래스로 객체를 생성해야 한다.
		SubClassMain me = new SubClassMain();
		me.a = "프라이빗 변경"; //-> 해당하는 클래스 안에서만 접근이 가능 그외에는 모두 불가능
		me.b = "퍼블릭 변경";// 다른 모든 클래스에서 접근이 가능/import가 됐을 경우에만 어디서든 사용가능
		me.c = "프로텍티드 변경"; //->같은 패키지에서는 가능하나, 다른패키지간에 부모자식간의 관계를 맺었을 경우에 접근이 가능 함. 위에 extend처럼 상속 받은 경우에만 가능.
		me.d = "디폴트 변경"; // -> 그 패키지 안에서만 사용한다. / import를 해도 못씀
	
		
		
	
		me.output();
	}
}
