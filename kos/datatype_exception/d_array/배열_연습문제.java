package d_array;

public class 배열_연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		//최대값은 배열 중에서 가장 큰 값을 찾아내는 알고리즘이다.
		//사람은 데이타를 보면 척보고 어느것이 가장 크고, 어느것이 가장 작은지 알아낼 수 있다.
		//그러나 컴퓨터는 본다, 비교한다 라는 기능을 자동으로 할 수 없으므로 두뇌가 행동하는 것과 같은 기능을 부여해야 한다.
		//최대값을 찾는 방법은 이렇다.
		
		//우선 임의의 변수를 정의하고 예를 들어 max 라 하자.
		//
		//1. 이 변수에 배열의 첫번째 값을 입력한다.
		//2. 이 값이 가장 크다고 가정하고 다음번 방에 있는 데이타와 비교를 한다.
		//3. 이 변수에 저장된 값보다 큰 값이 들어오면 더 큰 값으로 바꿔치기를 한다.
		//4. 이 과정(2-3단계)을 배열이 끝날때 까지 반복하면 된다.
		//		 문제 : 각 행의 값들의 합이 가장 큰 행을 출력하기
		//
		//		  int a[][]=new int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
		//
		//		  결과 : 0행
		//		   -----------------------------------------------------------------
		//		 문제 : 합이 가장 큰 행과 
		//		 다음 배열 a에서 합이 가장 큰 행과 열의 번호를 각각 출력하기
		//
		//		 int a[][]=new int[][]{{3,-5, 12, 3, -21}, {-2, 11, 2, -7, -11}, {21, -21, -35, -93, -11}, {9, 14, 39, -98, -1}};
		//
		//		 결과 : 2 1
		
//		int a[][] = new int[][] { { 3, -5, 12 }, { -2, 11, 2, -7 }, { 21, -21, -35, -93, -11 }, { 9, 14, 39, -98 } };
		int a[][]=new int[][]{{3,-5, 12, 3, -21}, {-2, 11, 2, -7, -11 }, {21, -21, -35, -93, -11}, {9, 14, 39, -98, -1}};

		int max = 0;
		int hap [] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int sum =0;
			for (int j = 0; j < a[i].length; j++) { //
				
				 sum+=a[i][j];
				
				}
			hap[i]=sum;
			

			}
		int x =0;
		for(int i=0; i<hap.length-1; i++) {
			
				if(hap[i]>hap[i+1]&& hap[i]>max) { // 이 둘을 만족 할 때
					max=hap[i];
					x=i; // max가 저장될때의 i를 저장하면 그 행을 알 수 있다.
					
							
				}
				
			}
		System.out.println(max +" 행 :"+x);
			
		}
}
