package d_constructor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		// 입력받은 데이타로 Student 클래스의 멤버 변수에 초기화한다면?
		Scanner in = new Scanner(System.in);
		System.out.println("이름->");
		String name = in.next();
		System.out.println("국어점수->");
		int k = in.nextInt();
		System.out.println("영어점수->");
		int e = in.nextInt();
		System.out.println("수학점수->");
		int m = in.nextInt();
		
		//이 데이터를 stu에 넣고 싶다.
//		Student stu = new Student(); //-> 생성자 함수중에서 같은 형태를 한 것으로 불러 오기 때문에 Student class에 저장된 Student() 가 불러진다.-
		//생성자 함수를 쓰는 이유는 인스턴스를 만들고 바로 초기값을 주고 싶기때문이다.
		Student stu = new Student();
//		Student stu = new Student(name, k, e, m); // 이렇게 초기화를 해 줘야 내가 원하는 함수를 불러 올 수 있다.								
		System.out.println("총점 :" + stu.calTotal());
		System.out.println("평균 :" + stu.calAverage());
		

	}

}
