package 반복문연습;

import java.util.Scanner;

public class For_연습_집 {

	public static void main(String[] args) {
		
		/* 문제 1) 1~ N 까지의 숫자를 다음처럼 출력하라
		 * 1 2 3 4 5 
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 * 
		 *  ------ 나의 풀이. 
		 *  스캐너를 통해 변수를 받는다. 받은 변수로 그 변수 까지의 숫자를 반복문을 통해 나타낸다. 5자리씩 띄어서
		 *  
		 */
		Scanner input = new Scanner (System.in);
		System.out.println("변수를 입력하세요");
		int val = input.nextInt();
		
		for(int i=1 ; i<= val ; i++) {
			System.out.print(i + " ");
			if(i % 5 == 0) {
				System.out.println();
			}
			
		}
		
		

	}

}
