package c_control;

import java.util.Scanner;

public class for_복습3 {
	public static void main(String[] args) {
		/*
		 * 문제 주사위 두개를 가지고 있다. 이 주사위 두개를 던질 때 눈의 합이 어떤 수가 되는가가 궁금하다. 
		 * 그런데 일일이 따지기 어려워 컴퓨터를 잘 하는 당신에게 ㅈ도움을 요청하였다. 예를 들어, 합이 9가 되는경우는
		 * 입력 예 9
		 * 3 6
		 * 4 5
		 * 5 4
		 * 6 3
		 * 과같은 경우이다. 
		 * 입력형식은 12이하인 자연수가 주어지고 
		 * 두개의 수가 출력 되고 각각 척번째 두번째 주사위의 눈이다.
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * 풀이 
		 * Scanner를 통해 12이하의 자연수N를 입력 받는다.
		 * 반복문을 두개 돌려서 합이 n 이 되는 수를 출력한다.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("12이하의 자연수를 입력 해 주세요");
		int N = input.nextInt();
		for(int i =1; i<7 ; i++) {
			for(int j =1; j<7 ; j++) {
				if(i+j == N) {
					System.out.print(i+" ");
					System.out.print(j);
					
				
				}
			}
			System.out.println();
			if(N>12) {
				System.out.println("12이하의 자연수를 입력 해 주세요");
				break;
			}
		}
		
		
		
	
	
	
	}
	

}
