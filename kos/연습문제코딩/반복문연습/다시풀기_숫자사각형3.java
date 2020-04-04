package 반복문연습;

public class 다시풀기_숫자사각형3 {

	public static void main(String[] args) {
		/* 
		 * 정사각형 한 변의 길이 n 을가지는
		 * 정사각형을 
		 * 입력값 4일 때
		 * 1 5 9  13
		 * 2 6 10 14
		 * 3 7 11 15 
		 * 4 8 12 16
		 * 로 출력 한다.
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * n값을 가지는 for 반복문 2개. 그리고 i값을 출력하는데 
		 * 그 i 값이 반복문 안에서 실행 될 때 마다 n더해지게
		 * 다기 바깥으로 나왔을 때 그 변수가 초기화되고 두번째행이라는 값을
		 * 가지고 다시 n을 더해주게.
		 * 
		 *
		 */
		int n = 5;
		
		for(int i=0; i<n; i++) {
			int add=0;
			add=1+i;
			for(int j=1; j<=n; j++) {
				System.out.print(add+ " ");
				add+=n;
				
			}
			System.out.println();
		}
		
	}

}
