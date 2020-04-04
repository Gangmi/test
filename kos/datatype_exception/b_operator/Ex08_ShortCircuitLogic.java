 package b_operator;

public class Ex08_ShortCircuitLogic { // 3월 16일 2번째 

	public static void main(String[] args) {
		
		int a = 3;
		if (a>3 && a >3) { 
			System.out.println("조건만족");
			
		}
		System.out.println("A = " +a); // 이 경우에 a >3 자체가 false기 때문에 if 절 아래에 있는 조건만족을 출력하는 코드는 실행되지 않는다.
		
		

//		int a = 3;
//		if (a>3 && ++a >3) { 
//			System.out.println("조건만족");
//			
//		}
//		System.out.println("A = " +a);
//		
		//이런 경우에 단락회로평가 에 의해 if 절의  ++a 는 실행 되지 않는다. Short Circuit Logic -> 
		//하나의 조건으로 전체 조건이 판명되면 나머지 조건을 실행하지 않는다.
		
		if (a > 1 || ++a >3)  {
			System.out.println("조건만족2");
		}
		System.out.println("A=" + a); //이것 역시 단락회로평가에 의해 뒤의 ++a 가 실행 되지 않는다.
		
		//SCL 은 일반논리에서만 발현된다.
		// 원래 이진논리연산자는 트루 폴스를 해주는 연산자가 아닌데 , 요즘에는 헷갈려 하는 사람들이 많아서 이진 논리 연산자로 short circuit Logic 을
		// 무시하고 모든 항을 실행 시킬 수 있다.
		//but if(3 > 4) -> 이진논리.
		//     if(3>a &  ++a <4) -> 이진논리의 예외적 사용
	
		
		
		
		
		
		
		

		
	}

}
