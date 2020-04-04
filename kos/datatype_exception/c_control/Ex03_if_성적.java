package c_control;

import java.util.Scanner;

public class Ex03_if_성적 {

	public static void main(String[] args) {

		//0. 국 영 수 점수를 입력 받아서 총점, 평균을 출력 // 복사 하기.
		//1. 평균을 보고 이 평균에 따라서 학점 (A~F) 출력하기.
		//*** if문장을 이용해서 만들기.
		Scanner input = new Scanner (System.in);
		System.out.println("국어 점수를 입력 해 주세요 ->");
		int kor = input.nextInt();

		System.out.println("영어 점수를 입력 해 주세요 ->");
		int eng = input.nextInt();

		System.out.println("수학 점수를 입력 해 주세요 ->");
		int math = input.nextInt();	

		int total = kor + eng + math;
		int avg = (total/3);

		System.out.println(" 총점 : " +total);
		System.out.println("평균 : " + avg );

		/*학점 범위 A = 90 - 100
		 * 		 b = 80 - 89
		 * 	     c = 70-  79

		 */		

		if(avg >= 90) {
			System.out.println(" A 학점 ");

		}else if ( avg  <90 && avg  >= 80) {
			System.out.println(" B 학점 ");

		}else if ( avg  <80 && avg  >= 70 ) {
			System.out.println(" C 학점 ");
		}else if (avg  <60 && avg  >= 50) {
			System.out.println(" D 학점 ");
		}else if ( avg  <40 && avg  >= 30) {
			System.out.println(" E 학점 ");
		}else if ( avg  <30  ) {
			System.out.println(" F 학점 ");

		}

	}
}
