package c_control;

import java.util.Scanner;

public class Ex03_switch_성적 {

	public static void main(String[] args) {
		
		//0. 국 영 수 점수를 입력 받아서 총점, 평균을 출력 // 복사 하기.
				//1. 평균을 보고 이 평균에 따라서 학점 (A~F) 출력하기.
		//switch 문장으로 해결하기.
		
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
		
		
		String grade = "";
		
		switch (avg / 10) { 
		
		case 10 :
		case 9 : grade = "A 학점"; break;
		case 8 : grade = "B 학점"; break;
		case 7 : grade = "C 학점"; break;
		case 6 : grade = "D 학점"; break;
		case 5 : grade = "E 학점"; break;
		default : grade = "F 학점" ; break;
		
		 
		}
		System.out.println(grade);
			
		
		
		

	}

}
