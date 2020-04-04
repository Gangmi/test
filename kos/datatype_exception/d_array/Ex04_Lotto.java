package d_array;

public class Ex04_Lotto {

	public static void main(String[] args) {

		int[] lot = new int[6];
		// 로또에 값을 넣을 것이다.
		// 우리가 이걸 60개를 써야 한다면 , 복붙을 할 수는없다.

		for (int j = 0; j < 6; j++) { // int[j]의 값을 지정해주는 코드. 정수형 배열 lot 에 0부터 j<6을 만족하는 값까지 배열의 값을 만든다.

			lot[j] = (int) (Math.random() * 45 + 1); // 이 코드를 돌리면 1미만의 값을 랜덤으로 뽑아내는데 거기에 45를 곱해준다. 0이 나올 수도 있으니까
													 // 1을 더해주고 소숫점을 버리기 위해서 int로 캐스팅한다
			
			
			
			for(int i=0; i<j; i++) {
				if(lot[i]==lot[j]) {
					i--;
				}
			}
			
			//임시 변수값을 지정해서 같을 때 boolean x =false 를 지정하고
			//if문을 사용해서 같을 경우에
			//true를 주고 다시 변수를 저장하도록.
			
			//또는 for만을 이용해서 for안의 변수i 일때 같은 수가 나오면 i값을 줄여서 다시 그 단계를 반복하는 방법도 있다.
			
			
			
			
		} 
		
		//정렬
		for (int i = lot.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (lot[j] > lot[j + 1]) {
					int s = 0; //
					s = lot[j];
					lot[j] = lot[j + 1];
					lot[j + 1] = s;

					

					
				}
			}
		}
		for (int o = 0; o < 6; o++) {
			System.out.print(lot[o] + "/");
		}
	}
}
