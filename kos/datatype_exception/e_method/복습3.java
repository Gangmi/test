package e_method;

import java.util.Scanner;

public class 복습3 {
	static double sum; // 멤버변수는 자동초기화 .
	static double avg;

	public static void main(String[] args) { // 메인이라는 함수가 args 라는 문자열 배열 값을 인자로 받고 void 를 리턴.

		int[] score = input();
		calscore(score);
		output();

	}

	// 총점 평균 출력
	static void output() {
		System.out.println("총점은 " + sum);
		System.out.println("평균은 " + avg);

	}

	// 입력받은 국영수 점수로 총점, 평균을 구하기.
	static void calscore(int[] score) {
//		sum=0; // 합계를 구해서 저장함 // 멤버변수 선언하고 자동 초기화 되어 있기 때문에 괜찮다 
		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // 각 배열의 값을 더하는 코드

		}
		avg = sum / score.length; // 배열의 길이에서 총점을 나눔 -> 하나라도 더블이어야 정확하게 출력이 가능하다.
//		System.out.println("총점은 "+sum); 
//		System.out.println("평균은 " + avg); // 동일한 데이터 타입일 경우에는 넘기는 것이 맞지만, 이걸 굳이 같은 데이터 타입 배열로 넘기기 보다는
//										  // 멤버변수를 선언하는것이 좋다.

	}

	// 국 영수 점수를 입력받는 함수
	static int[] input() {
		int[] score = new int[3];
		Scanner in = new Scanner(System.in);
		System.out.println("점수를 입력 해 주세요 국 영 수 순서대로 엔터로 구분하세요");
		for (int i = 0; i < 3; i++) {
			score[i] = in.nextInt();

		}
		return score; // 자바는 하나만 리턴가능.

	}

}
