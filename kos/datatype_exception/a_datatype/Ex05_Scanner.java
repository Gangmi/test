package a_datatype;

import java.util.Scanner;

public class Ex05_Scanner {

	public static void main(String[] args) {
		
		
		
		// 1 .국, 영, 수 점수를 저장할 변수를 선언하고 값을 지정
		int kor=0 , eng=0 , math=0 ;
		//입력받기 
		Scanner input =new Scanner(System.in); // scanner는 입력 받기 위한 가상의 통로이다.
		
		System.out.print("국어점수 ->");
		kor = input.nextInt();
		System.out.print("영어점수 ->");
		eng = input.nextInt();		
		System.out.print("수학점수 ->");
		math = input.nextInt();
		
		
		
		
		// 2. 총점 구하기
		int total = kor+eng+math;
		
		
		// 3. 평균 구하기
		double average = (double)total/3;
		
		
		
		System.out.println("총점 :  " + total);
		System.out.println("평균 : " + average);
		
		if(average >= 90 ) {
			System.out.println("A학점");
			
		}else if(average >=80) {
			System.out.println("B학점");
			
		}else if(average >=70) {
			System.out.println("C학점");
			
		}
		
		
		
		
		
	}

}

/*
# next() 와 nextLine() 차이점

	next()는 \n \t 같은 문자를 만나면 그 전까지 읽는다
	nextLine()은 \n 개행문자까지 읽어서 한 줄임을 인식한다.
	
	[ 예 ] 오늘도 우리는 행복이 의무다
	
	next()는 4개의 토큰으로 인식하지만
	nextLine()은 한 줄로 인식한다.
*/