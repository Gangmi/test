package 반복문연습;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 다시풀기_성적입력_총합평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문젱 ) 
		 * 학생점수를 입력받아 평균과 총점을 출력
		 * 입력 형식: 80/ 88/ 87
		 * 출력 형식:
		 *  총점: ㅌㅌㅌ
		 *  평균: ㅌㅌㅌㅌ 
		 *  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 *  
		 *  
		 */
		Scanner input =new Scanner(System.in);
		System.out.println("점수를 입력해 주세요 /단위로");
		String in = input.nextLine();
		StringTokenizer sc = new StringTokenizer(in,"/");
		int total = 0;
		int a = sc.countTokens();
		
		while(sc.hasMoreTokens()) {
			String score = sc.nextToken();
			int i = Integer.parseInt(score);
			total+=i;
			
			
			
		}
		System.out.println("total : " + total);
		System.out.println("평균 : "+ total /a); 
		
		
		

	}

}
