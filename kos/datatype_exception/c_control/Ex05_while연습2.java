package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_while연습2 {

	public static void main(String[] args) {
		/*
		 * 정수를 입력 받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 가각 구하여 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력예 
		 * 10 20 30 55 66 7 88 99
		 * 
		 * 짝수 6개 
		 * 홀수 4개
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * 풀이
		 * Scanner 를 통해 문자열을 입력 받는다.
		 * String in 에 입력받은 문자열을 저장하고
		 * StringTokenizer st 를 불러온다.
		 * while문을 사용하여 문자열에 토큰이 있을 때 까지 반복문을 반복하는 코드를 만든다.
		 * 이중에 if 를 사용하여 들어온 값이 짝수인지 홀수인지를 판단한다.
		 * 그리고 이 갯수가 맞으면 짝수의 갯수를 올리고 아니면 홀수의 갯수를 올린다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 해 주세요 (띄어쓰기로 구분하세요)");
		String in = sc.nextLine();
		StringTokenizer st = new StringTokenizer(in); // 받아온 문자열을 스트링토크나이저에 불러 오면서 토큰을 끊어 주는 단위를 설정 하는것인데
													  // 불러오는 문자열 이름 뒤에 , 를찍고 구분자의 형태를 문자열 안에 넣어주는 식으로 표현 할 수 있다
													  // 예를 들면 new StringTokenizer(in,"/") 라고 하면 구분자는 / 가 되는 것이다.
		
		int even = 0; // 아래 while 문의 반복에 따라서 짝수와 홀수의 카운팅이 하나씩 늘어날 수 있도록 미리 변수를 초기화 시켜 놓는다.
		int odd = 0;

		while (st.hasMoreTokens()) { //현재 토큰이 남아 있니? 토큰이 있는지 를 물어보는 것이다. 시작지점에 토큰이 있는지를 물어보는 것이다..> 밑에서 토큰하나를 빼 갔기 
									 //때문에 현재 제일 앞에 있는 토큰은 그 다음 토큰이 될 것이다.
			
			                         //다음 토큰이 없다면 반복문을 탈출
			
			String su = st.nextToken(); // 현재 토큰이 10이라고 가정 했을 때 현재 토큰을 가져오면서 순서를 그 토큰 다음 토큰으로 넘겨준다. -> 넘겨준다는게 그 토큰을 가져왔으니까
			 							//이제 그 토큰은 없는게 되니까 토큰의 순서가 그 다음 토큰이 되는 것이다. 빼주는 거다.
										// nextToken은 현재 가장 앞 순서에 위치한 토큰을 가져오는 것이다.
			
			
			int token = Integer.parseInt(su); //su에 들어온 토큰은 문자열 이기 때문에 인티저를 통해서 int로 바꿔준다.

			if (token % 2 == 0) { // int 로 바꿔준 토큰을 2로나눠서 0이 되는지를 판단해서 참이면 짝수의 갯수를 올려주는 코드이다.
				++even;

			} else {
				++odd;
			}

		}
		System.out.println("짝수" + even);
		System.out.println("홀수" + odd);

	}

}
