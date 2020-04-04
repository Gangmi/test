package e_method;

public class Ex02_인자와반환2 {

	public static void main(String[] args) {
	
		int sum =add(); // 아래에서 sum이라고 했다고 위에 변수명을 sum이라고 하지 않아도 된다. add(); 메소드로 return된 값이 들어온 것은
						// 새로 만든 sum이라는 변수에 저장하고 그 변수를 아래에 출력한다. (메소드에 있는  sum과는 다른 것이다.)
		System.out.println("출력 : "+sum);
		
		
		
	}
	static int add() { // 메인에서 보내는 데이터는 없다. 여기서 sum을 위로 보내는 방법은 뭘까? 
						//원래 return이라는 명령어가 있다.
		
		//데이터 입력 
		int a=10, b=20;
		//계산
//		return; // 이렇게 중간에 쓰면 만난순간 제어권을 반환한다.
		
		int sum = a+b;
		return sum; //원래 위에 void라는 뜻이 없다는 것인데 정수형을 보내려고 하면 에러가 난다. 반환하는 자료형에 따라서 메소드의 반환값을 바꿔주어야 한다. 	
					// return 다음에 단 하나의 값만 반환 할 수 있다.
		
		
	}
	/*
	 * return = 프로그램의 흐름을 반환하는 명령어
	 * 단 하나의 값을 반환 할 수 있다. -> 정확히는 변수를 반환하는 것이 아니다.
	 * 
	 */
	

}
