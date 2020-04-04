package d_array;

public class Ex04_Lotto2 {

	public static void main(String[] args) {

		int[][] lot = new int[5][6]; // 정수형배열의 배열. 6개들어있는것이 5개 ; -> 공간이 30개 만들어짐.
		// 로또에 값을 넣을 것이다.
		// 우리가 이걸 60개를 써야 한다면 , 복붙을 할 수는없다.

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) { // int[j]의 값을 지정해주는 코드. 정수형 배열 lot 에 0부터 j<6을 만족하는 값까지 배열의 값을 만든다.

				lot[i][j] = (int) (Math.random() * 45 + 1); // i번째 줄의 j번째 칸에 데이터를 넣어주세요!

			}
		}
		
		for(int z=0; z<lot.length ; z++){
			for (int i = lot[z].length-1 ; i>0;  i--) { //lot[] 라고 쓰면 안되고 뭐라도 하나 줘야함,.
				for (int j = 0; j < i; j++) { // j가 i보다 작을 때 까지
					if (lot[z][j] > lot[z][j + 1]) { // 앞에 있는 값이 더 크다면 그 값을 뒤로 보낸다는 뜻.

						int s = 0; // 스와핑을 하기위한 어떤 변수를 잡아주고 스와핑 방법에 의해서 아래를 차례대로 코딩한다.

						s = lot[z][j];
						lot[z][j] = lot[z][j + 1];
						lot[z][j + 1] = s;
						// swapping

					}

				}

			}
			
		}
		
		
		

	

		for (int i = 0; i < 5; i++) {
			for (int o = 0; o < 6; o++) {
				System.out.print(lot[i][o] + "/");
			}
			System.out.println();
		}
	}
}
