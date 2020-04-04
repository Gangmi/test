package e_method;

public class Ex02_인자와반환3 {

	public static void main(String[] args) {
		
		int [] arr=add(); // 넘어온 자료형과 같은 자료형의 변수를 선언하고 저장한다.
	
		//데이터를 넘겨받아서 합을 구하고 출력 하려면?
		int sum = arr[0]+arr[1];
		System.out.println("합 : "+sum);
	
	}
	static int[] add( ) { // return의 데이터 형은 하나밖에 못 씀 // arr 의 자료형을 써야 함 int[] 임 ,//()위에서 받을 인수의 자료형과 변수명 
		//입력 데이터가 함수 안에 있음 
		int a=10, b= 20;
//		return a,b; 라고 하면 안 된다. return은 하나의 값만 return가능
		int[]arr = {a,b}; //둘다 넘기고 싶으면 배열을 사용하면 된다.
		return arr; 
		
		
		
	}

}
