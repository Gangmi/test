package b_operator;

/*
 *  논리연산자의 상태를 먼저 확인
 *  
 *  
 *  일반 논리 연산자  && (and)  || (or) 직렬과 병렬로 생각 하면 쉽다.  
 *  
 *  둘다 만족 할 때만 결과가 발생하면 and 
 *  하나만 만족 할 때도 결과가 발생 할 경우에는 or
 *  
 */
public class Ex06_GeneralLogical {

	public static void main(String[] args) {
		
		int 성적 = 75;
		char 태도 = 'A';
		//우등생 : 성적이 80점 이상이거나 태도가 'A' 조건
		
		if(성적>= 80 || 태도 == 'A') {  // 이런 경우에 둘중에 하나만 만족해도 되기 때문에 or 을 쓴다.
			System.out.println("우등생");
			
		}else {
			System.out.println("우등생아님");
			
		}
		
		//성적 향상반: 성적이 80점 이상이고 태도가 'A' 조건
		if(성적>=80 && 태도=='A') {
			System.out.println("성적향상반");
		}else {
			System.out.println("성적향상반x");
			
		}

		
		
		
		
		
		
		
		
		
		
		
		/*
		 *  [ 문제 1 ]
 			문자를 하나 입력받아서 그 문자가 대문자인지 소문자 인지 출력하기
 		 */


	}

}
