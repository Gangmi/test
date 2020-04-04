package c_control;

public class Ex04_for_연습문제 {

	public static void main(String[] args) {
		
		
//		----------------------------------------------------
//
//		[ 문제 2 ] 아래와 같이 출력하기
//
//		ABCDEFGHIJKLMNOPQRSTUVWXYZ
//		ABCDEFGHIJKLMNOPQRSTUVWXY
//		ABCDEFGHIJKLMNOPQRSTUVWX
//		ABCDEFGHIJKLMNOPQRSTUVW
//		ABCDEFGHIJKLMNOPQRSTUV
//		:
//		ABC
//		AB
//		A
		//답 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		for(int i=0 ;i<27 ; i++) {
//			for (char ch ='A'; ch<='Z'-i; ch++) { // ****여기서 Z-i 를 하는 것은 이클립스에서 묵인을 해 준것이다.
//				System.out.print(ch);
//		}
//			System.out.println();
//			
//		}
//
//			-----------------------------------------------------
//
//			[ 문제 3 ] 아래와 같이 출력하기
//
//			ABCDEFGHIJKLMNOPQRSTUVWXYZ
//			BCDEFGHIJKLMNOPQRSTUVWXYZ
//			CDEFGHIJKLMNOPQRSTUVWXYZ
//			DEFGHIJKLMNOPQRSTUVWXYZ
//			:
//			XYZ
//			YZ
//			Z
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//3번 답
//		for(int i=0 ;i<27 ; i++) {
//			for (char ch =(char)('A'+i) ; ch<='Z'; ch++) { // int 를 char형과 계산해서 char 형에 넣는것이 안 된다.
//														   //int 를 char 과 계산하면 int 가 되기 때문에 캐스팅이 필요하다.
//				System.out.print(ch);
//				
//		}
//			System.out.println();
//			
//		}
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//
//				-----------------------------------------------------
//
//
//				[ 문제 4 ] 아래와 같이 출력하기
//
//				Z
//				ZY
//				ZYX
//				:
//				ZYXWVUTSRQPONMLKJIHGFEDC
//				ZYXWVUTSRQPONMLKJIHGFEDCB
//				ZYXWVUTSRQPONMLKJIHGFEDCBA
//		for(int i=0 ; i<27; i++) {
//			for(char ch = 'Z' ; ch>'Z'-i; ch--) {
//				System.out.print(ch);
//			}
//			System.out.println();
//		}
		
//
//
//		-----------------------------------------------------
//
//
//					[ 문제 5 ] 아래와 같이 출력하기
//
//					ABCDEFGHIJKLMNOPQRSTUVWXYZ
//					 BCDEFGHIJKLMNOPQRSTUVWXYZ
//					  CDEFGHIJKLMNOPQRSTUVWXYZ
//					   DEFGHIJKLMNOPQRSTUVWXYZ
//					             :
//
//					                      WXYZ
//					                       XYZ
//					                        YZ
//					                         Z
		
//		
		for (int i = 0; i < 27; i++) { // i값에 따라서 j값이 0 1 2 3 4 5 순으로 늘어나서 공백이 생긴다.. 
			for(int j =0; j<i; j++ ) {
				
					
				
				
				System.out.print(" ");
			}

			for (char ch = (char) ('A' + i); ch <= 'Z'; ch++) {
				
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
