package j_final;

class Parent{ // 만약 부모가 클래스 전체를 final로 사용한다면 이 클래스 자체를 부모로 사용할 수가 없다.
	 final String field = "부모님꺼"; // 부모클래스의 멤버변수에 final이 붙으면 상수로 처리 되기 때문에 자식클래스에서 변경이 불가능하다.
	final public void jib (){ // 이 메소드 역시 final을 사용 했을 경우에 overriding이 불가능 하다.
	  System.out.println("부모님이 만드신거"); // 이렇게 다 final을 붙이면 자식 쪽에서 수정이 불가능하다.
	 }
	} 
class Child extends Parent{
	public Child() {
		super.field = "내꺼"; // 명확하게 하려면 super. 을 붙이면됨. 변수도 수정 가능
	}
	public void jib() { // 오버라이딩
		System.out.println("내가 물려받아 탕진한 집");
	}


}

public class Test {
	 public static void main(String[] args) {
		 Child p = new Child(); // 
		  System.out.println(p.field);
		  p.jib();
	 }
	}
