package b_operator;

/**
 *  shift : 모든 비트의 값을 이동하는 연산자
 *  
 *  [예] 0000 0010	<<1 		0000 0100
 *  	  0000 0010	>>1		0000 0001
 */
public class Ex04_Shift {

	public static void main(String[] args) {
		
		int su = -1 ; // 시프트를 써도 부호는 안날아감
		
		System.out.println(su); //0100
		System.out.println(su <<1); //1000
		System.out.println(su >>1); //0010
		System.out.println(su >>>1); //0010
	
		
		
		

		
	}

}
