package 반복문연습;

public class For_연습문제6 {

	public static void main(String[] args) {
		/*
		 * 문제 6) 아래와 같이 출력 하기.
		 * 
		 * ABCDEFGHIJKLMNOPQRSTUVWXYZ ABCDEFGHIJKLMNOPQRSTUVWXY ABCDEFGHIJKLMNOPQRSTUVWX
		 * . . . A ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 풀이 문자 A - Z 를 출력하고 이걸 26번 반복하는데 맨뒤에 하나씩이
		 * 사라지니까 FOR구문에서 범위의 값이 하나씩 줄어 들면 되지 않을까?
		 * 
		 */
		for (int i = 0; i < 26; i++) {
			for (char ch = 'A'; ch <= 'Z'-i; ch++) {
				System.out.print(ch);

			}
			System.out.println();
		
		}
		
	}

}
