package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_while개념2 {

	public static void main(String[] args) {
		/*
		 * 문장을 입력 받아 단어로 나눠서 출력
		 * "빨리 코로나 끝났으면 좋겠다."
		 */
		//갯수가 확실하면 for문이 편하지만 이렇게 얼마나 입력 하지 모르는 경우에는 while문이 편하다.
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력 해 주세요(ex. 90/80/70/60) ");
		String in = input.nextLine();
		StringTokenizer st = new StringTokenizer(in,"/"); //유틸에 소속된 문자열을 하나씩 읽음  // 여기서 (,/) 슬래쉬단위로 쪼개 달라는 명령어다 . 따라서 슬래쉬를 제외한 
														                              //단어만 쪼개서 읽어준다.
		
		while(st.hasMoreTokens()) { // 문자열중에 토큰이 있니>? 라는 것은 토큰이 있을경우에는 true 없을 경우에는 false 따라서 문자열이 끝나면 반복문을 벗어남.
			String temp =st.nextToken();
			int su = Integer.parseInt(temp); //내가 받은 점수가 현재 문자열이기 때문에 이것을 계산하고 싶다면, 정수형으로 바꿔줘야 할 것이다
											 //따라서 문자열로 들어온 숫자를 정수형으로  변경해주는 코드.
			System.out.println(++su); // 숫자가 맞는지 확인 해 보기 위해서 ++을 해 주었다.
			
		}
		
		

	}

}
