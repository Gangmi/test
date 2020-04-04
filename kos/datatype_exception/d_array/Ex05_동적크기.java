package d_array;

public class Ex05_동적크기 {//동적크기배열
	
	/*
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 * ******
	 * *******
	 * 과 같은 배열 만들기. 
	 */

	public static void main(String[] args) {
		char[][] star = new char[5][] ; // 따라서 배열의 갯수를 정하지 않으면 변수가 저장되는 공간이 생기는 만큼만 생긴다.
		
		 
		
		for(int i=0; i<star.length; i++ ) { // 줄을 뜻함 (행)
			star[i] =new char[i+1]; //i가 1일 때 new {(new char[i+1] 이니까) 이 자체가 인덱스가 아니고 칸을 만드는것 }  1칸을 만든다 
			
			for(int j=0; j<=i; j++) { // 칸을 뜻함(열) i까지만 증가하면 되니까. //또는 j<i+1 까지.
				
				star[i][j] = '*' ; //이런 경우에 10000열 이라고 하면 , 0행부터 9999개의 빈 메모리를 가지니까 비효율적이다.
			}
		}
		
		for(int i=0; i<star.length; i++ ) {
			for(int j=0; j<star[i].length; j++) { // 이미 length 로 잡아놔서 괜찮다.
				System.out.print(star[i][j]+ " ");
			}
			System.out.println();
		}
		//사실 자바는 이미 동적크기 배열이지만 이런식으로 하나하나 지정 할 수도 있다.
		

	}

}
