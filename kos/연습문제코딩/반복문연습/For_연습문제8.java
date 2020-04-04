package 반복문연습;

public class For_연습문제8 {

	public static void main(String[] args) {
		/*
		 * 문제 8 아래와 같이 출력하세요 ABCDEFGHIJKLMNOPQRSTUVWXYZ BCDEFGHIJKLMNOPQRSTUVWXYZ . . Z
		 * 
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ A부터 Z 까지 실행되는 코드가 있을것이고. 그걸 26번 반복해야 하는데 시작범위가 하나씩 깎여
		 * 나가고 출력을 하는 코드가 한 사이클을 다 돌 때 마다 공백이 하나씩 생기는 코드를 짜야 할 것이다. 맨위에 구문에 for 이 두개
		 * 걸쳐있게 되겠네?
		 * 
		 * 
		 */

		for (int i = 0; i < 26; i++) {
			for (int j = 0; j <= i; j++) { // 위의 i  값을 이용해서 j 의 값 또한 i 값에 따라 공백이 생길 수 있게 만드는 코드
				
				System.out.print(" ");

			}

			for (char ch = (char) ('A' + i); ch <= 'Z'; ch++) { // 시작 범위가 하나씩 줄어드는 코드
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
