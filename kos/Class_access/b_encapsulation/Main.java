package b_encapsulation;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();
//		s.kor=70; // 모든 변수가 private를 가지고 있어서 접근이 되지 않는다.
//		s.eng=88;
//		s.math=99;
		// student에서 만든 set get 메소드를 사용해서 값을 설정할 수 있다.
		s.setKor(70);

		s.setEng(88);
		s.setMath(99);
		s.setName("홍길동");

		System.out.println(s.getKor() + "/" + s.getEng() + "/" + s.getMath());
		System.out.println(s.getName());
		System.out.println("총점 :" + s.calTotal()); // s안에 있는 calTotal을 불러서 계산하고 값이 나올것이다.
													// 컨트롤을 누르고 함수를 누르면 그 함수가 있는 곳으로 간다.
		System.out.println("평균" + s.calAverage()); // 마찬가지.

	}
	/*
	 * [ 결론내기 ] 캡슐화란???
	 */
}
