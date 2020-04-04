package b_operator;

/*
 *  연산자와 대입연산자를 합치기
 *  	- 산술, 이진논리, 쉬프트
 *  	- += -+ *= /= %= 대입연산자. 
 *  
 */
public class Ex10_Assignment {

	public static void main(String[] args) {

		int  a = 10;
		int  b = 7;


		
		a+= b; // a = a+b; => 17  ( a= 17 , b = 7)
		System.out.println("+= 결과 : " + a );

		a-= b; // a= a-b => 10 ( a = 10 , b = 7)
		System.out.println("-= 결과 : " + a );
		a*= b; // a= a*b => 70 ( a= 70 , b = 7 ) 
		System.out.println("*= 결과 : " + a );
		a/= b; // a = a/b => 10 ( a =10 , b =7)
		System.out.println("/= 결과 : " + a );
		a%= b; // a =a%b => 3 ( a = 3 , b = 7)
		System.out.println("%= 결과 : " + a );

	}
}
