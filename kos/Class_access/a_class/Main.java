package a_class;

public class Main {

	public static void main(String[] args) {
		
		//student에서 만든 코드를 불러오고 싶다면 메모리에 올려야 한다.
		
		// 객체 생성 (메모리에 넣어놓는다. 확보) -> 내가 만든것의 틀만 가져와서 쓰는것이다. 
		Student s= new Student(); 
		s.kor=70;
		s.eng=88;
		s.math=99;
		
		System.out.println("총점 :" + s.caltotal());  // s안에 있는 calTotal을 불러서 계산하고 값이 나올것이다. 
													//컨트롤을 누르고 함수를 누르면 그 함수가 있는 곳으로 간다.
		System.out.println("평균" + s.calAve()); 		// 마찬가지. 
		
	
		
	}

}
