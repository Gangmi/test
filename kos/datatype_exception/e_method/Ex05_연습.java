package e_method;

import java.util.Scanner;

public class Ex05_연습 {

	public static void main(String[] args) {

		char[][]result =input(); //input이 실행되고 나서 나온 return값을 result 라는 배열에 다시 넣어서 저장
		
		output(result); //result값을 output으로 넘겨줌

	}

	/*
	 * 두 정수와 알파벳 문자 하나를 입력 받기. 예) 3 4 F 를 입력 받는다.
	 * 
	 * 
	 * 
	 */
	static char[][] input() {
		Scanner in = new Scanner(System.in);
		System.out.println("입력해 ㅡㅡ 정수두개랑 문자 하나.. ");
		int first = in.nextInt();
		int second = in.nextInt();
		char alpha = in.next().charAt(0);

		char [][] result=makeSquare(first, second, alpha); // 변수 first second alpha 를 넘겨라. 값을 받은 makesquare의 결과값을
		//result 배열에 담고 result를 리턴(9)
		return result;

	}

	static char[][] makeSquare(int first, int second, char alpha) { // 입력받은 첫번째 정수 만큼의 행과 2번째 정수 만큼의 문자배열을 만들어,
		// 입력 받은 문자로 시작하는 알파벳을 저장
		
		char[][] ch = new char[first][second];
		for (int i = 0; i <ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				ch[i][j] = alpha++; // or 아래에 alpha++ or 

				

			}

		}
		return ch; // 만들어진 ch의 값을 리턴해준다. 위에 makesquare 로 (28)

	}

	static void output(char[][] result ) { // 넘겨진 result값을 문자형 2차원 배열 result 로 저장하고
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print( result[i][j] + " "); //출력하고 끝이기 때문에 
				
			}
			System.out.println();
		}

	}//return이 필요없다.

}
