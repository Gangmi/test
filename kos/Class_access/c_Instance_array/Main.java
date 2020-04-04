package c_Instance_array;

import java.util.Scanner;

public class Main {

	/**
	 * 			배열을 이용해서 3명의 국영수 점수를 입력받아 총점과 평균을 구한다
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Student [] s = new Student[3];		// 학생 수 3은 배열의 갯수를 의미한다. -> 클래스를 배열로 
		// 이 경우에 스튜던트라는 배열은 3개가 만들어지지만 각 배열의 요소 값이 null로 되어있다. -> 배열만 만들어진다.
		
		//입력부
		for(int i =0; i<s.length ; i++) { //반복문을 통해서 이 빈 공간에 Student class 의 객체를 생성해야한다.
			s[i] = new Student();
			
			
			
			System.out.println((i+1) + "번째 학생의 이름을 입력 해 주세요");
			s[i].setName(in.next());
			System.out.println("성적을 입력 띄어쓰기로 구분 국 영수 ");
			s[i].setKor(in.nextInt());
			s[i].setEng(in.nextInt());
			s[i].setMath(in.nextInt());
			
			
		}
		//출력부
		
		for(int i=0; i<s.length; i++) {
			System.out.println((i+1) +"번째 학생");
			System.out.println("총점 :" +s[i].calTotal());
			System.out.println("평균 :" +s[i].calAverage());
		}
		
		
		
		
		
	}

}
