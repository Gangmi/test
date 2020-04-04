package c_control;

import java.util.Scanner;

public class Ex06_Dowhile_개념 {

	public static void main(String[] args) {

		while (true) {
			// 트루를 넣었을 때는 꼭 끝나는 지점을 정해야 한다. 그렇지 않으면 무한루프를 돌게 된다. 조심!

			Scanner input = new Scanner(System.in);
			System.out.println("숫자를 입력 해 주세요");
			int su = input.nextInt();

			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d \n", su, i, su * i);

			}
			System.out.println("구구단 다시 할까요?");
			String result = input.next(); // 다시 문자열을 받음 여기서 사용자가 위의 코드를 몇 번 반복하라고 할 지 모르기때문에 while 을 사용해야 함
			if (result.equals("N") || result.equals("n")) { // 소문자 또는 대문자 n을 눌러도 반복문을 빠져 나갈 수 있게
				break; // N을 눌렀을 경우에는 break; 로 반복문을 빠져 나갈 수 있게 만든 것이다.

			}

		}
		

	}

}
