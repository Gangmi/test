package 반복문연습;

import java.util.Scanner;

public class For_연습문제3 {

	public static void main(String[] args) {
		/* 문제 3) 입력받은 문자열을 뒤집어서 출력하세요
		 * ex ) 
		 * 입력 안녕 친구   
		 * 출력 구친 녕안 
		 *  hint 문자열의 길이를 구할 때 length 를 씀
		 *  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 *  풀이
		 *   Scanner 를 통해서 입력 받는다.
		 *   입력받은 문자의 문자열 길이를 변수  leng 에 저장한다.
		 *   for 반복문으로 글자의 총 길이에서 하나 뺀 값들의 '문자' 들을 가져와서 출력한다.
		 *   예를들면 총길이가 5라면 그거에서 하나 뺀 4번째 다음은 3번째 2번째 1번째 0 번째 까지.
		 *   그리고 멈추는 프로그램.
		 * 
		 */

		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		
		
		int leng = a.length();
		
		for(int i=leng; i>0 ; i--) { //받아온 문자열의 길이를 i 라고 하고 그 i 값을 하나씩 빼면서 i > 0 까지만 하는 것 
			System.out.print(a.charAt(i-1));
			
		}
	}

}
