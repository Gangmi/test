package c_control;

public class for_복습2 {

	public static void main(String[] args) {
		/*
		 * 행열을 관리 하려고 할때 3행 2열이라고 하자 행 열에 번호 붙이기.
		 * 
		 */

		for (int i = 0; i < 3; i++) {// 3행에 대한 반복문

			for (int j = 0; j < 2; j++) {// 2열에 대한 반복문
				System.out.printf("<%d, %d>",i,j); // 좌표를 보기 위한 코드
			}
			System.out.println();
		}
	}

}
