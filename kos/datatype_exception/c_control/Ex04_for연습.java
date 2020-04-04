package c_control;

import java.util.Scanner;

public class Ex04_for연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		문제 1)1~ N까지의 숫자를 다음처럼 출력하라
		//
		//	1 2 3 4 5
		//	6 7 8 9 10
		//	11 12 13 14 15
		
//		Scanner input= new Scanner (System.in);
//		System.out.println("값을 입력 해 주세요");
//		int myNum = input.nextInt();
//
//
//
//		for (int i=1; i<=myNum; i++) {  //5를 기준으로 엔터를 쳐주는 코드 + Scanner 를 통해서 그 수 까지의 숫자를 5마다 끊어주는 식으로 표현해 줌
//			 						// 항상 문제를 먼저 이해하자. -> 문제를 잘못생각해서 풀었음.. 1부터 내가 입력한 
//			
//			System.out.print(i +" "); // "\t" 를 통해서 한 탭씩 띄울수도 있다.
//			
//			if(i % 5 == 0) {
//				System.out.println();
//			}
//
//		}
		
		
		

		//		문제2)  문자열처리하기
		//
		//문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고 
		//N이 대문자이면 문자 N부터  Z까지 출력하라
		//그 밖의 문자가 입력되면 Error 를 출력하라
		//
		//입력  출력
		//f       abcdef
		//X       XYZ
		//6       Error
		// 풀이... scanner를 통해서 char을 입력 받기 위해서는 문자열을 받고 그 문자열의 문자 하나를 뽑아 오는 식으로 하면 된다.
		Scanner input= new Scanner(System.in);
		System.out.println("문자를 입력 해 주세요 ->");
//		char N = input.next().charAt(0); //문자하나만 뽑아내기 위해서 문자열로 변수를 받고 그 문자열의 0번째를 뽑아 저장한다.
//		                                // 문자열 입력을 받은 것에서 첫번째 문자 하나만 바로 char N 에 저장 한 것이다.
//		if(N>='A'&& N<='Z') { //N이 대문자 A -Z  라면  N 의 범위를 지정 한 것이다.
//			for(char ch = N ; N<='Z';N++) {
//				System.out.print(N);//N부터 Z까지출력
//			}
//		}else if(N>='a' && N<='z') { // N범위가 a -z 라면  ........ 여기에 else가 없다면 대문자 B 를 입력 했다고 했을 때 위에서 이미 참이라서 
		    						// 이 코드를 실행 할 필요가 없지만 실행이 되게된다. 따라서 효율적으로 코드를 구성하려면 이 부분에  else가 들어가는것이
									//맞게 되는것이다.
		
//			for(char ch = 'a'; ch<=N ; ch++) { //a부터 N보다 작을 때까지 ch가 1씩증가하며 프린트. 
//				System.out.print(ch);
//			}
//		}else {
//			System.out.println("Error");
//		}
		/*입력한 문자가 대문자라면
		 * 
		 * 그렇지 않고 입력한 문자가 소문자라면
		 * 
		 * 그외라면 
		 * 
		 * 으로 나누어서 코딩해야 한다.
		  
		 * 
		 * 
		 * 
		 * 
		 * 
		*/
		
		//------------------------------------------------
		//
		//문제3 ) 입력받은 문자열의 뒤집어서 출력하세요
		//
		//[예]  입력     출력
		//
		//안녕 친구   구친 녕안
		//CarpeDiem   meiDepraC
		//
		//[힌트] 문자열의 길이 구할 때   length() 이용
		String userInput = input.nextLine(); //문자열을 입력 받고
		
		//안녕 친구 라는 글을 입력 받았을 때
		
		//userinput = "안녕 친구"
		
		int line = userInput.length(); //이 문자열의 길이를 받는다. 길이 자체는 4가 나온다.
		
		//문자열의 길이가 3이다. 0 1 2 3  까지 있으니까 이걸 3 2 1 0 으로 배열 하려면...
		
		for(int i=line-1; i>=0; i--) {
			System.out.print(userInput.charAt(i));
			
		}
		
		//안녕친구 
		//userinput = "안녕친구"
		//userinput.charAt(?);
		
		
		
		
		
		
		
		
		
		
		
 
	}//


}





