package c_control;

import java.util.Scanner;

public class 제어문연습1_1 {

	public static void main(String[] args) {
	
		/*
		 * 정사각형의 한 변의 길이 n을 입력받은 후 
		 * n x n 로 된 정사각형 형태로 숫자를 출력하는 프로그램
		 * 위에서 아래로 진행하고 바로 오른쪽 위에서 아래로 진행하는 방법
		 * 4
		 * 
		 * 1 5 9  13
		 * 2 6 10 14
		 * 3 7 11 15 
		 * 4 8 12 16
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 *  풀이
		 *  1부터 n을 더한 수를 n만큼 출력하는 프로그램을 
		 *  n 번 반복하는 프로그램
		 *  예를 들어 4가 들어가면 1부터 n+4 씩 늘어난다.
		 *  행이 하나 늘어 날때 초기 값이 1씩 늘어나는 것을 이용해보자.
		 *  j값이 1늘어나는 것을 어떤 변수를 잡고 1을 잡아놓고 이 값은 계속 초기화 되어야 해 
		 *  그 값에 코드가 한 번 실행될 때 마다 n을 더해줘 처음엔 안더해 져야 함
		 *  그럼 n값이 있을 때
		 */

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		
		for (int j = 0; j < n; j++) {
			int x = j+1; //이 구문을 벗어나면 초기화 되는 수를 잡고 
			
			for (int i = 0; i < n; i++) { // n값에범위에 1씩 증가하는 i 값을 가진 변수를 설정하고
				
				System.out.print( " "+ x); // 위에서 가져온 x 를 출력하고
				x+=n;// //출력이 되면 n을 더해준다. //어차피 n까지만 동작한다.
				
				

			}
			
			System.out.println();

		}
	}

}
