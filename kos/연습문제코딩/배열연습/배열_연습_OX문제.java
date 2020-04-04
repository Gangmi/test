package 배열연습;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 배열_연습_OX문제 {

	public static void main ( String [] args) {
		/*
		 * ox 문제 프로그램
		 * 
		 * 
		 * 예제의 갯수가 주어지고 이에 따른 ox 답의 결과 점수를 출력한다.
		 *  oxoxoooxoxo
		 * 
		 * 
		 */
		
		//답안의 갯수 입력 받기 
		Scanner input = new Scanner(System.in);
		System.out.println("답안의 갯수를 입력 해 주세요");
		int scorei = input.nextInt(); 
		input.nextLine();
		
		//입력 받은 답안의 갯수로 반복문
		
		for(int i =0; i<scorei; i++) {
			System.out.println("답안을 입력 해 주세요");
			String scores = input.nextLine();
			//문자열을 x에 따라서 자름
			StringTokenizer sc = new StringTokenizer(scores,"x");
			//토큰이 있는 동안에 그걸 잘라서 몇개인지 센다.
			int add=0;
			while(sc.hasMoreTokens()) {
				String O = sc.nextToken(); 
				//토큰이 있을 때 까지 
				for(int j =0; j<O.length(); j++) { //토큰이 없을때는 계산이 되지 않고 o만 있을 때 에도 계산이 가능하다.
					
					add+=j+1;
					
					
					
					
				}
				
			}
			System.out.println(add);
			
			
			
			
			
			
			
		}
	
		
		
			
		
		
	}
}
