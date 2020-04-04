package 배열연습;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 배열연습_평균_구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 평균구하기.
		 * 
		 * 첫째 줄에는 테스트 케이스 c가 주어진다.
		 * 둘째 줄 부터 각 테스트 케이스 마다 첫 수로 정수 n 1이상 1000미만의 학생이 주어지고
		 * n명의 1부터 100 사이의 점수가 주어진다.
		 * 
		 * 각 케이스 마다 한줄씩 평균을 넘는 학생들의 비율을 소수점 넷째 자리에서 반올림하여 출력한다.
		 * 
		 * 
		 * 
		 */
		
		//몇명의 학생의 성적을 검사 할 것인지 입력 받는다.
		Scanner input= new Scanner(System.in);
		System.out.println("테스트 케이스를 입력 해 주세요");
		int snum = input.nextInt();
		input.nextLine();
		
		//입력 받은 학생 수에 따른 배열 만들기
		
		
		//입력 받은 학생수에 따라서 반복되는 반복문
		int[][]scorei= new int[snum][]; // 테스트 케이스에 따라서 저장 할 것이기 때문에 snum개의 세로줄을 만든다.
		
		for(int i =0; i<snum; i++) {
			System.out.println("학생수와 점수를 입력 해 주세요 맨 앞에 학생수 그 다음부터 점수 띄어쓰기로 구분");
			String scores = input.nextLine();
			StringTokenizer sc = new StringTokenizer(scores);
			
			int a = Integer.parseInt(sc.nextToken()); 
			 
			scorei[i]=new int [a]; // socorei일 때 그 안에 새로 a개의  배열을 만든다. 
			
			
			//토큰이 있을 때 까지 
			for(int j=0; sc.hasMoreTokens(); j++) { // 이렇게 하면 토큰이 있을 때 까지 j=0부터 1씩 올리기 가능
				scorei[i][j]=Integer.parseInt(sc.nextToken());
				
				
				
			}
			
			
			
			
			
			
		}
		//출력
		for(int i =0; i<scorei.length; i++) {
			double sum = 0;
			double avg=0;
			double over=0;
			for(int j =0; j<scorei[i].length; j++) {
				sum+=scorei[i][j];
				
				
			}
			avg=sum/scorei[i].length;
			for(int j=0; j<scorei[i].length; j++) {
				if(scorei[i][j]>avg) {
					++over;
					
				}
			}
			System.out.printf("%.3f \n",(over/scorei[i].length)*100.0);
			
			
		}
		
			
			
		
		

	}

}
