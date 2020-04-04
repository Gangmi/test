package b_operator;

import java.util.Scanner;

public class Ex09_Samhang02 {

	public static void main(String[] args) {
		// 학생점수를 입력받아 80점 이상이면 "합격" 출력하고 그렇지 않으면 "불합격 출력"
		//삼항 연산자를 이용
		
		int score =0;
		Scanner input = new Scanner (System.in);
		System.out.println("점수를 입력 해 주세요");
		score = input.nextInt();
		
		String pass = (score>= 80) ? "합격"  : "불합격" ; // 문자열을 저장하려면 문자열로 만들어야지,,,
		//score가 80점 이상이면 합격을 출력하고 아니면 불합격.
		
		System.out.println(pass); //삼항연산자를 쓸 수도 있고 아닐수도 있다.
		
	}

}
