package d_array;

public class Ex03_버블정렬 {

	public static void main(String[] args) {
		/*
		 * 
		 */

		int[] score = { 10, 89, 100, 91, 92 };

		for (int i = score.length - 1; i > 0; i--) { // 위에 숫자가 몇개 있는지 가져오고 인덱스에 맞추기 위해서 -1 해준다.
			for (int j = 0; j < i; j++) { // j가 i보다 작을 때 까지
				if (score[j] > score[j + 1]) { // 앞에 있는 값이 더 크다면 그 값을 뒤로 보낸다는 뜻.

					int s = 0; // 스와핑을 하기위한 어떤 변수를 잡아주고 스와핑 방법에 의해서 아래를 차례대로 코딩한다.

					s = score[j];
					score[j] = score[j + 1];
					score[j + 1] = s;
					// swapping

				}

			}

		}
		for (int a = 0; a < score.length; a++) {
			System.out.print(score[a] + "/");
		}

	}

}
