package 반복문연습;

public class 다시풀기_성적최댓값구하기 {

	public static void main(String[] args) {
		/*
		 * 성적을 정수형 데이터타입 배열에 저장하고 그 배열에 있는 모든 수중에 가장 큰 값을 가져온다.
		 * 
		 */
		int[] score = { 80, 90, 100, 110, 120 };
		int max = 0;
		for (int i = 0; i < score.length; i++) {

			if (score[i] > max) {
				max = score[i];

			}

		}
		System.out.println(max);

	}

}
