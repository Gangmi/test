package c_control;

public class Ex04_for중첩 {

	public static void main(String[] args) {

		// 별표를 5개 일렬로 출력하는 코드를 만든다.  
				for(int j=0; j<5; j++){ 
					for(int i = 0; i<5-j; i++) { // j값에 따라서 i 값이 하나씩 줄어서 갯수가 점점 적어짐.
						System.out.print("*");// *을 만들어내는 코드
					
				}
					System.out.println(); //한 번 만들 때 마다 줄바꿈을 해줌
				}
					
		// 공백을 하나씩 추가 하면서 출력  0 1 2 3 4 
				for(int j=0; j<5; j++){ 
					for(int k= 0  ;k<j  ; k++  ) { // j값에 따라서 k의 값이 바뀌면 공백이 하나씩 추가된다.
												   //  공백이 0 1 2 3 4 로 늘어나기때문에 
						 						   // 첫 번째 실행에서 j =0 일때 k 역시 0 이기때문에 공백 코드가 실행 되지 않는다.
												   // 두 번째 실행에서 j =1 일때 k = 0 이기때문에 조건을 만족하므로 공백 코드가 한 번 실행되고
												   // k역시 늘어나기때문에 1(k)<1(j) 가 거짓이므로 반복구문이 실행이 되지않고 for구문의 구동 순서 때문에 K++가 실행되지 않는다.		
													//다시 세번째 실행에서 j=2가 되므로 
						
						
						System.out.print(" ");
					}
					for(int i = 0; i<5-j; i++) { 
						System.out.print("*");// *을 만들어내는 코드

					}
					System.out.println(); //한 번 만들 때 마다 줄바꿈을 해줌
				}
						


		//A-Z 까지 출력
		
//		for(char ch='A'; ch<='Z'; ch++) {
//			System.out.print(ch);
//		}
		
		
		//A부터 Z까지 26줄 출력
//		for(int j=0 ; j<27; j++) {
//			for(char ch='A'; ch< 'Z' ; ch++) { // b보다 작을때까지 c 보다 작을 때 까지 .......까지;...
//				
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
		//만약 피라미드 모양을 만든다고 하자. 26줄로
//		for(int j=0 ; j<27; j++) {
//			for(char ch='A'; ch< 'A'+j ; ch++) {  //j = 0 일때는 for 구문의 ch<'A"+j 가 참이 아니기때문에  반복문이 실행이 되지 않는다. (유의하자)
//												// A부터 시작해서 j의 값에 따라 한 글자씩 추가 되게 하기 위해서 
//				                                // j가 1씩 증가하는 코드이기때문에 가능한 것이다.
//				
//				System.out.print(ch);
//			}
//			System.out.println();// for구문을 한 번 실행했을 때 한 번씩 띄어 주려고
//		}
		
		
		
		
	
}
}



