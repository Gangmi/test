package c_control;

public class Ex04_for_개념 {

	public static void main(String[] args) {


		//		for ( 초기치; 조건식 (반복문을 언제까지 할건지);  증가치 ) {
		//			반복구문 -> 반복을 원하는 구문.
		//		}   -> for 문의 기본 형식.


		//0.인사말 5번 출력하기
		//        for (int i=0 ; i<5 ;  i++) { // 컴퓨터는 0부터 세기 때문에 i= 0 으로 설정  i<=4 로 쓸 수도 있지만 < 만 써서 표현하는 경우가 많다.
		//        	
		//        	//   i가 0 일때 i가 5보다 작을 때 까지 1씩 늘어나며 증가함.
		//        	
		//        	System.out.println("안녕하세요"); //-> 반복을 원하는 구문


		//카페에 있는  for 구문의 사진을 참조하여 순서를 알 수 있다.
		//초기값을 실행하고 (처음에 한번만) , 조건식에 맞는지 확인하고 , 반복구문을 실행하고 , i를 증가시킴.

		//1. 1~10 까지의 합을 구하기.
		int result = 0;
		
		for(int i=1 ; i<101; i++) { // i 가 10이 될 때 까지 1씩 증가시키며 result 에 더하겠다.
			result+= i;
			
			
		}
		System.out.println("합 =" + result); // 여기에서 i 를 출력 하려고 해도 할 수 없다. i는 for 구문안에서 만들어 졌기 때문에
											// for 구문을 벗어난 순간 메모리에서 사라진다.
		
		
		
		//2. 1~100까지의 홀수의 합과 짝수의 합 구하기.
//		int even = 0,  odd= 0;
//		
//		
//		for(int i=1 ; i<101; i++) {
//			//숫자 i 가 홀수라면 odd 에 합 구하기
//			//그렇지 않으면 even 합 구하기.
//			if (i%2 == 0 ) {
//				even += i;
//			}else {
//				odd += i;
//			}
//		}
//		System.out.println("짝수합 : " + even+ " , " + "홀수 합 : " + odd );
//	
		
		
		//3 . A -Z 를 출력 
		for (char ch='a';ch<='z'; ch ++ ) { //알파벳에 한해서는 아스키 코드로 비교가 됨. // 문자 로도 for 반복문을 사용 할 수 있다.
			
			System.out.print(ch);
			
			
		}
		System.out.println(); // 일부러 개행을 함 줄바꿈을 위해서
		
		//4 . A-Z 출력 (2개씩 건너 뛰기)
		for (char ch ='A' ; ch<= 'Z'; ch+=2) { //ch에 2씩을 더한다. 문자 A 가 Z 가 될 때 까지.
			
			System.out.print(ch);
		}
		System.out.println();
		//5. Z-A 출력
		for(char ch = 'Z' ; ch >='A' ; ch--) {
			System.out.print(ch);
		}
		
		
		
		
	

		

		}




	}

