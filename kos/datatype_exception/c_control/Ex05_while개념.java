package c_control;

import java.util.Scanner;

public class Ex05_while개념 {

	public static void main(String[] args) {

		/*
		 * 1부터 10 까지의 합을 출력 하세요
		 */
//		int add = 0;
//		int i = 1; // (1) for문의 초기치 부분을 밖으로 뺐다.
//		for (; i < 11;) { // 왠만하면 조건문은 살리는게 좋다. 무한루프에 빠질 수 있기 때문...
//			add += i;
//			i++; // (2)증가치를 나중에 실행하면 되기 때문에 for문 () 안에서 생략하려면 맨 뒤에 놓는다.
//		}
//		System.out.print("합은" + add);
//		위의 코드처럼 초기치 증가치가 생략된 구문을 while 문으로 표현 할 수 있다.
//		
		/*
		 * int add =0; int i =1; while(i<11) { add+=i; i++;
		 * 
		 * } System.out.println("합 :" +add);
		 * 
		 * }
		 */

//		숫자 하나 입력 받기 - > 구구단 출력
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력 해 주세요");

		int N = input.nextInt();
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d * %d = %d \n", N, i, N * i); //문자열에서 좌표를 표시하는 코드는 %d , %d
// 
//		}
		int i = 1;
		while (i <= 9) { // 초기치를 맨 위로 빼고 i++을 맨 뒤로 뺀다 그리고 for을 while 로 바꿔 주면 된다.

			System.out.printf("%d * %d = %d \n", N, i, N * i);
			i++;
		}
//		정해진 수 만큼 돌리는 경우에는 for 을 쓰고 그게 아니고 몇개인지모를때 while을 쓴다. -> 대부분이 프레임이 이렇다는 것이다.
		

	}

}
