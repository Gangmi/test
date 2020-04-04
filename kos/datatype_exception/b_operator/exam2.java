package b_operator;

import java.util.Scanner;

public class exam2 { // 3월 16일 첫 번째 시간.
	

	public static void main(String[] args) {
		
		//100점 만점의 학생 점수를 입력받아 80~90 사이라면 '평균'이라고 출력
		int score =0; // 변수를 선언하고
		Scanner input = new Scanner(System.in);// 스캐너를 불러오고
		System.out.println("점수를 입력하세요");  // 점수를 입력하라는 메시지를 띄우고
		score = input.nextInt(); // 그 변수를 score로 저장하는 코드를 적고
		
		if (score > 80 && score < 90) { // 조건문을 이용해서 80 에서 90 사이일때 평균을 출력한다.
			System.out.println(" 평균");
			
		}
		
		






		
		
		

	}

}
