package d_array;

public class Ex01_연습_최댓값찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 */

		int [] score = {88, 89,90,91,92,100}; // 정수형 배열을 만드는 코드.
		//이중에 가장 큰 점수를 알고싶다.
		//max 변수를 선언한다.
		int max =0; // max와 score[i]를 계속해서 비교한다.
		
		for(int i=0; i<score.length ; i++) {
			if(max<score[i]) {
				max=score[i];
				
			}
			
		}
		System.out.println(max);
		
	}

}
