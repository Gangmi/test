package test;

import java.util.Scanner;

public class 평균을넘는사람구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 첫째줄에는 test case c 가 주어진다.
		 * 둘째 줄 부터 각 케이스 마다 정수로 1이상 1000이하의 학생수가 주어지고 그 다음부터 n 명의 0-100 사이의 점수가 주어진다.
		 * 각 케이스 마다 평균을 넘는 학생들의 비율을 소숫점 4째 자리에서 반올림 하여 출력한다.
		 * 
		 * 입력 예
		 * 5 
		 * 과목수 점수들
		 * 5 50 50 70 80 100 // 맨 앞을 가져와서 과목수로 쓰고 0번째 학생의 과목수 그리고 그뒤에 과목의 점수로 표현 해보면 되지 않을까..?
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		// 학생수 입력 받기
		System.out.println("학생 수를 입력 해 주세요");  
		int stuDentNumber = input.nextInt();
		input.hasNextLine();
		
		//입력 받는 학생수로 2차원 정수형 배열 만들기.
		int[][] stu_Sub = new int[stuDentNumber][]; 
		
		//학생 수 만큼 반복되는 반복문
		for(int i=0; i<stuDentNumber; i++) {
			
			for(int j=0; j<stuDentNumber; j++) {
				
			 stu_Sub[i][j] = input.nextInt();  // 처음에 과목수를 받고 그에 따라서 공간이 만들어지고 띄어쓰기로 구분하고 50 50 70 80 100 을 넣는다.
			 
			
			
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}
