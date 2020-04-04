package 반복문연습;

public class For_연습문제5 {

	public static void main(String[] args) {
		/*
		 * 문제 5) 아래와 같이 출력 하기. A AB ABC ABCD ABCDE ㅡㅡㅡㅡㅡㅡㅡ
		 *
		 * 풀이)
		 * 
		 * 문자 'A' 부터 문자 'Z' 까지 반복문을 사용하여 만드는데 한 번 실행 될 때 마다 하나씩 더 생기게 끔 만들어 주면 됨 -> 원래 A
		 * 값에서 뭔가 하나씩만 증가시키면서 줄을 바꿔 주면 되겠지?
		 * 
		 * 
		 * 
		 * 
		 */
		for (int i = 0; i < 26; i++) {

			for (char ch = 'A'; ch <= 'A' + i; ch++) {
				System.out.print(ch);
			}
			System.out.println();

		}

	}

}
