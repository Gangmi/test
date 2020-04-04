package h_inherit;

public class Ddal  extends Umma{ // exteds 가 상속관계를 맺는 것이다. extend 뒤의 클래스 이름이 엄마가 된다.
//	umma 부모클래스
//	ddal  자식 클래스
	
	
	public Ddal () {
		System.out.println("자식의 기본 생성자");
	}
	
	public void gene() {
		System.out.println("자식은 자식이다.");
	}
	public void study() {
		System.out.println("딸은 학생");
	}
}
