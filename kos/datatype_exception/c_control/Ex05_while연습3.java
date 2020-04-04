package c_control;

public class Ex05_while연습3 {

	public static void main(String[] args) {
		/*
		 * while 연습
		 * 3,6, 9 게임
		 * 1부터 9까지의 숫자를 출력 
		 * 
		 */

		for (int i = 1; i <= 50; i++) { // 1부터 9까지 출력하는 코드
			
			int su =i; // su라는 변수를 변경하면서 처리할 것이다.

			boolean su369 = false; // 불린 변수 su369 선언 및 false로 값 설정
			
			while (su != 0) { // 들어온 수 su 를 이 반복문 제일 아래에 있는 s/=10 ; 을 실행 해서 몫이 0이 나오지 않는이상 계속 검사를 한다.
				
				int na = su % 10;
				if (na == 3 || na == 6 || na == 9) { // 숫자가 3이거나 6이거나 9라면 을 걸러내는 조건문
					System.out.print("짝");
					su369 = true;
				}
				su /= 10; // 이 코드를 실행 함으로서 10 이상의 수에서 몫이 1이상일 경우에 위의 su!=0 이 참이 되기 때문에 그 수에 3 ,6 ,9 가 더 들어 있는지 
						  // 확인 하게 된다.
				
			}

			if (su369) { // 불린의 값이 참이 될 때는 짝이라는 글자만 출력이 되어야 하기 때문에 바로 한 번을 띄어 준다.
				System.out.println();
			} else { // 그게 아닐 경우에는 숫자를 출력하도록

				System.out.println(i);

			}
			//su369 값?? 
			//위의 for 구문으로 10이상의 숫자가 나오는 3 6 9 를 할 수가 없다.
			//이런 경우에는 while 을 쓰는것이 좋다.
			//마지막값을 10으로 나눈것의 나머지를 가져오면 3인지 6인지 9인지 판단 할 수 있을 것이다.
			
			
			
		}
	}

}
