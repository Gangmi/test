package test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ox문제점수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제
		 * 
		 * o는 문제를 맞은것이고, x 는 문제를 틀린것이다. oooxxooxox
		 * 
		 * 일때 이 제출 답안의 점수는 연속된 o의 갯수로 채점한다. 위의 경우에는 1+2+3+1+2+1 로 10점이다.
		 *
		 * 이를 도출하는 프로그램을 작성 하여라.
		 * 
		 * 길이가 0보다 크고 80보다 작은 문자열이 주어진다. ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 *
		 * 문자열의 갯수에 따라서 유동적으로 답을 검사 해야야 하기때문에 for 의 범위가 문자열의 길이여야 한다.
		 * 
		 * 
		 * 
		 * oooxxooxox 가 들어왔다고 할 때;
		 * 
		 * o하나마다 1씩 카운트되고 Scanner in = new Scanner(System.in); char [] ch =
		 * in.nextLine().toCharArray(); //"문자열을 char형 배열로" 바꾼다. 중용!
		 * 
		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in); // 스캐너로 변수를 받음
		System.out.println("답의 갯수를 입력 해 주세요");
		int answercount = input.nextInt();// 답의 갯수를 입력 받음
		
		input.nextLine(); // 위에 nextInt를 받았기 때문에 엔터를 받아서 상쇄
		

		for (int i = 0; i < answercount; i++) { // 예제의 갯수에 따라 반복문을 계속하는 코드
			int sum = 0; // 아래 반복문에 따라서 점수를 더해주는 변수 -> 반복문이 한 번 돌 때 마다 초기화됨
			System.out.println("예제를 입력 해 주세요");

			String a = input.nextLine(); // 예제를 받고
			
			StringTokenizer sc = new StringTokenizer(a,"x"); // 스트링 토큰나이저로 x 단위로 끊어서 받음

			
			if (a == "" && a.charAt(0)=='o') { // 들어온 토큰의 값이 없을때 (o만 들어왔을 때)
				
				for (int k = 1; i <= a.length(); k++)
					sum += k;

			} else if (a=="" &&a.charAt(0) == 'x') {//들어온 토큰의 값이 없을 때 (x만 들어왔을 때)
				System.out.println(0);

			} else { // 그게 아닌경우에 x 단위로 잘라서 토큰을 만든 것을 길이를 구해서 더해줌
				while (sc.hasMoreTokens()) {
					String now = sc.nextToken();
					int oTokens = now.length();
					for (int j = 1; j <= oTokens; j++) { // 현재 갯수가 x 개 일때 1 ~ x 까지. 더한다.
						sum += j;

					}

				}

			}
			System.out.println("총점은"+ sum);

		}

	}
}
