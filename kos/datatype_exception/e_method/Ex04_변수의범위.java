package e_method;

public class Ex04_변수의범위 {
	
	//멤버변수 클래스안에들은, -> 전역변수
	static int a, b; // 멤버변수는 자동 초기화가 됨.**( heap 에 잡히는 메모리는 선언만 해도 자동 초기화가 됨.)
	static int sum ; 
	/*
	 * 실수를 많이 하는 것
	 * 위에 전역 변수를 선언 해 놓고 아래 메인함수에서 a를 다시 선언하면, add 함수안의 a는 값이 없는 것이 된다.
	 *  
	 */
	  
	
	public static void main(String[] args) {
		// 메소드 안에 들어있는 것은 지역 변수
		int a = 10; //여기서 다시 초기화를 하는 것은 stack에 a라는 변수를 다시 잡는다. 멤버변수와 지역변수중에 우선순위가 높은것은 지역변수이다.
		b = 20;
		add();
		System.out.println("합 : " + sum);
		

	}

	static void add() { 
		sum= a+b; // 여기에 int sum을 만들면 이 안에서만 쓰는 변수가 선언 되는 것이기 때문에-> 제어권을 벗어나는순간 사라진다.
				 // , 전역변수 sum을 사용한다는 뜻이 아니다.

	}

}
