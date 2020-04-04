package c_control;

import java.util.Scanner;

public class Ex04_for_연습문제과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		문제 )자연수 n을 입력받아 
		//		3인경우에...
		//		  1 첫줄에 1부터 시작하는 수가 내가 적은수의 앞에 있는 수만큼의 공백이 생김
		//		 12
		//		123 과 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오. 
		//		숫자를 공백으로 구분하되 줄 사이에 빈줄은 없다.

		//		for (int j = 1; j <= nat; j++) {
		//			for (int k = 0; k < (nat - j); k++) { // 띄우고 싶은 만큼의 공백에 따라서 값을 만들어 준다.
		//
		//				System.out.print("  "); // 공백이 두개인 이유는 아래에 숫자 하나를 출력 할 때 마다 공백을 하나씩 줘서 이다.
		//			}
		//			for (int i = 1; i <= j; i++) { // 위의 j 에서 i를 출력 할 때 숫자가 나오게 하기 위해서는 j값에 따라서 i값이 바뀌게 하면 된다.
		//				System.out.print(i + " "); //공백을 줌으로서 위에 숫자마다 공백이 필요한 갯수가 2개로 늘어났다.
		//
		//			}
		//
		//			System.out.println();
		//		}
		//		
		//		문제) 자연수 n 을 입력 받아 " 1 2 3 
		//                               4 5
		//                                 6
		//      입력 예 ) 3  -> 행의 갯수이다. 4 를 입력하면                  5를 입력 하면,
		//		                     1 2 3 4               1  2  3  4  5
		//		                       5 6 7                  6  7  8  9
		//		                         8 9                     10 11 12
		//                                 10                       13 14
		// 	                                                           15	
		//                                  
		//		
		//		
		
//		int n = 0;
//		n = sc.nextInt();
//		int input = 1;
//		for (int i = 0; i < n; i++) {
////			for(int j = 0; j < i;j++) {
////				System.out.print(" ");
////				System.out.print(" ");
////			}
//			for (int k = 0; k < n - i; k++) {
//				System.out.print(input);
//				input++;
//				System.out.print(" ");
//			}
//			System.out.println();


//
//		}
	
		
		
		System.out.println("자연수를 입력 해 주세요");
		
		Scanner sc = new Scanner(System.in);
		int nat = sc.nextInt();
		int input = 1; // 가장 먼저 출력 될 값을 선언한다.
		
		//4번 반복하는 반복문
		for(int i=0; i<nat ; i++) { // nat번을 반복하는 반복문이다.
			//그 안에서 숫자를 생성하는 코드를 만든다.
			for(int c= 0; c<nat-c ; c++) { //내가 넣은 숫자 만큼 숫자를 생성하는 코드를 만든다.
				System.out.print(input);
				
				++input;
				System.out.print(" ");
				
			}
			System.out.println();
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
	
	
	
}


	//				
	//				
