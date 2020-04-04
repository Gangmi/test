package c_control;

import java.util.Scanner;

public class Ex06_dowhile개념 {

	public static void main(String[] args) {
		
			// 트루를 넣었을 때는 꼭 끝나는 지점을 정해야 한다. 그렇지 않으면 무한루프를 돌게 된다. 조심!
			
			String result = "";
			do { // do while 을 사용해서 do 아래에 있는 명령어를 한 번 수행하고 
				
				Scanner input = new Scanner(System.in);
				System.out.println("숫자를 입력 해 주세요");
				int su = input.nextInt();
				
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d \n", su, i, su * i);
					
				}
				System.out.println("구구단 다시 할까요?");
				result = input.next(); //다시 문자열을 받아서 다시 할지 말지를 판단
				if (result.equals("N") || result.equals("n")) { // 이 result라는 값이 n 또는 N 일 때는 반복문을 중단.
					break; // N을 눌렀을 경우에는 break; 로 반복문을 빠져 나갈 수 있게 만든 것이다.
			}

			}while(result.equals("Y")| result.equals("y"));
		}
	}

			

		
		

	


