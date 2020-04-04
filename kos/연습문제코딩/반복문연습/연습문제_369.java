package 반복문연습;

public class 연습문제_369 {

	public static void main(String[] args) {

		/*
		 * 구구단 369 1- 9 출력. 하고 3 6 9 가 들어갈때마다 짝을 출력
		 *1부터 100까지의 수
		 *들어갈 때마다 짝  
		 * 얼마나 들어갈지 모르니까 while로 안쪽 구문을 만든다.
		 */
		for (int i = 1; i <= 100; i++) {
			int su = i;
			boolean su369 = false;

			while (su != 0) {
				int na = su % 10; // su에서 10을 나눈 나머지의 값을 저장. 이 값이 3 ,6 ,9 일 때 카운트 하나를 하고 . su에서 10을 나눠서 몫이 0이상이라면
									// , 다시 반복문을 수행하게
				if (na == 3 || na == 6 || na == 9) { // 30을 어떻게 거르냐.. 30 10으로 나눴을 때 3 1번 카운팅
					System.out.print("짝");
					su369 = true;
				}

				su /= 10;
			}
			if (su369) {
				System.out.println();
			} else {
				System.out.println(i);
			}

			
			
		}
		
	}

}

