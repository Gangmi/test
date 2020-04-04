package b_operator;

/**
 * 	not : 결과를 반대로 하는 연산자 + 논리란 참과 거짓을 논하는 것
 * 			- 일반논리 not :  !  true와 false를 사용하는것  그 중에서도 !를 앞에 붙이면 true를 false로 false를 true로 바꿔준다.
 * 			- 이진논리 not : ~   이진수를 건드리는 것 , 각 비트의 값이 0 -> 1 / 1-> 0 이 되는 것이다.
 */
public class Ex02_Not {

	public static void main(String[] args) {
		
		boolean result = 3 > 4; 
		System.out.println(result);// false  
		System.out.println(!result);// true !에 의해
		
		int a = 15;
		//System.out.println(!a); // 이건 안됨 숫자에 참거짓을 할 수 없음 
		System.out.println(~a); // 이진수로 나타낸수의 0을 1로 1을 0으로 바꾸는 것이다. 
		// a 00000000 0000000 00000000 00001111 -> 15
		//~a 11111111 1111111 11111111 11110000 -> ? 아무튼 음수임.
		
		
		
	

	}

}
