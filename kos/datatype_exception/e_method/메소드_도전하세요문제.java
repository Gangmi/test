package e_method;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 메소드_도전하세요문제 {

	public static void main(String[] args) {

		int a = solution();
		System.out.println(a + "번째 후보가 최다득표입니다.");

		//

	}

	static int solution() {// 매개변수가 주어진다. // 스트링 토큰나이저로 하나씩 나누고 배열에 저장

		Scanner input = new Scanner(System.in);
		System.out.println("후보수");
//		
		int N = input.nextInt();
		input.nextLine();

		System.out.println("투표 현황");
		String vote = input.nextLine(); // 1,2,3,4,5,3,3,3, 이런식
		StringTokenizer sc = new StringTokenizer(vote, ",");

		int ch[] = new int[vote.length()]; // n 만큼의 배열을 만든다. 0번째가 1번재 후보
		int O = 0;
//		//ch라는 배열 만들기.
		while (sc.hasMoreTokens()) {

			ch[O] = Integer.parseInt(sc.nextToken());
			O++;

		}
		// 배열안에서 같은거 찾기
		int[] add = new int[N];
		for (int i = 0; i < N; i++) {
			for (char j = 0; j < vote.length(); j++) {
				if (ch[j] == i + 1) { // ch[i]의 값이 j 와 같은지 같다면 1을 올림
					add[i] += 1;

				}

			}

		}
		int max = 0;
		int t = 0;
		int x = 0;
		for (int i = 0; i < add.length; i++) { // a[i] 가 a[i+1]
			if (add[i] > t) {
				t = add[i];
				max = i;
			}
			if (t == add[i] && i != 0) {
				x = i;

			}

		}

		return max + 1;
	}

}
