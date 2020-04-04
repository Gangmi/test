package d_array;

public class 복습 {

	public static void main(String[] args) {
		
		/*
		 * 3x4의 2차원 배열 char형 변수 ch 
		 */
		char[][] ch = new char[3][4];
		//1)값입력
		char al ='a'; // 문자형 al 선언하고 a를 넣어놓는다. 이 값이 계속 1씩 더해질 것이다.
		
		for(int i=0; i<ch.length; i++) {  // for 안에 있는 값을 최대한 이용하면 반복문을 덜 써서 만들 수 있는 경우들이 많다 잘 이용하자.
			for(int j=0; j<ch[i].length; j++) {// 지금같은 경우는 안에있는 변수를 이용 할 수 없어서 for 밖에 새로운 변수를 만들어 사용했다.
				
				
				ch[i][j]= al; // [0][0]일 때 al 이 들어가고 al을 하나 더하면 다음 값으로 바뀐다.
				
				al++; //위의 코드가 한 번 실행 될 때 마다 al 값을 더해준다.
				
				
				
			}
		}//2 차원 배열 만드는 for 거
		
		
		
		
		//2)출력
		for(int i=0; i<ch.length; i++) {
			for(int j =0; j<ch[i].length; j++) {
				System.out.print(ch[i][j]+ " ");
			}
			System.out.println();
		}//2차원 배열 출력하는 for 거
		
		
		
		
		
		
		

	}

}
