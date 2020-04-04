package 반복문연습;

public class For_연습문제7 {

	public static void main(String[] args) {
		/*
		 * 문제 7 아래와 같이 출력 하기 Z ZY ZYX
		 * 
		 * . . . ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 풀이
		 *
		 * Z 부터 역방향으로 출력되기 때문에 Z로 시작해서 하나씩 내려가는 코드를 만들면 될것 같다. 범위 역시 하나씩 깎이는 모습으로 될 것
		 * 같다.
		 * 
		 * 
		 * 
		 * 
		 */
		for (int i = 0; i < 26; i++) {
			for (char ch = 'Z'; ch >= 'Z' - i; ch--) {
				System.out.print(ch);

			}
			System.out.println();

		}

	}

}
