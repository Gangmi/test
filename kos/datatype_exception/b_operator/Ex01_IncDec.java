package b_operator;

/**
 *  증가(++)/감소(--) 연산자  -> 파이썬 같은 언어는 안 쓴다.
 */
public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		//[4]
		System.out.println("a =" + ++a + ", b = " + --b);// a=6 b= 6
		System.out.println("a =" + a++ + ", b = " + b--);// 출력은 a = 6 b= 6 하지만 진짜 a = 7 b= 5
		System.out.println("a =" + a + ", b = " + b);// a= 7 , b= 5
		
		
		
		
		
		
		
		// [1]
/*		System.out.println("a=" + a + " ,b =" + b);
		System.out.println("a=" + a+1 + " ,b =" + b+1);
		
		System.out.println("a=" + (a+1) + " ,b =" + (b+1)); // a = 6 , b = 8 ????? - > a=51 , b= 71 이다
		// 그냥 a +1 을 하면 수를 문자 취급하기 때문에 먼저 계산을 한다는 의미로 괄호 안에서 계산을 해 준다.
		
		

		
		// [2]
//		a = a+1;  // 원래 있던 a 에 1을 더해서 저장한다는 뜻이다.
//		b = b-1;
		
		//이것의 축약형이
		a++;
		b--;
		//이다.
		System.out.println("a = " + a + ", b =" + b);
		*/
		

		//[3]
		int result = ++a; // ++ 연산자가 앞에 있다면 증가를 먼저하고 a 에 대입한다.
		System.out.println("결과 : " + result); // 결과 : 6
		
		int result2 = b--; // -- 연산자가 뒤에 있으므로 b를 먼저 대입하고 그 뒤에 뺀다. -> 대입한 결과는 7이 되지만 그 뒤에 b가 1 감소 한채로 저장 되어 있어서
		// 이 뒤부터 b 는 6이 된다.
		
		System.out.println("결과 : " + result2); // 결과 : 7
		System.out.println("b : " + b); // 결과 : 6
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
