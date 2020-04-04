package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] baseball = new int[3]; // 랜덤수를 저장할 코드
		int[] answer = new int[3]; // 내 대답을 저장 할 코드

		// 임의의수 3개를 baseball에 저장.
		// 중복 수 배제해야함.

		for (int L = 0; L < baseball.length; L++) { // 랜덤 수를 뽑는 코드
			if (L == 0) {
				baseball[L] = (int) (Math.random() * 10);
				
			}

			if (L >= 1) {
				baseball[L] = (int) (Math.random() * 10);

				while (baseball[L - 1] == baseball[L]) { // 나왔을 때 첫번째와 비교해서 같으면 다시 2번째 값을 바꾸고
					baseball[L] = (int) (Math.random() * 10); // 그리고 baseball[0]== baseall(baseball.length;)
					

					
				}
				if(L==baseball.length-1 && baseball[0] == baseball[2]) {
					while (baseball[0] == baseball[2]) {

						baseball[2] = baseball[L] = (int) (Math.random() * 10);
					}

				}
				// 한 번 실행하고, 다음값이 처음과 같은지 확인. 두번째 나온수랑 첫번째 나온 수 값이 두 번째
				// 아니라면 3번째 숫자를 생성. 생성한 숫자가 1번째 그리고 2번째 수와 같다면,
				// 다시 난수를 생성

			}
			System.out.print(baseball[L]); // 뽑은 랜덤수를 화면에 출력하는 코드
		}

//			 // 같은수가 나옴...! 랜덤수가 나오고 나서, 2번째 랜덤수가 나올 때 그 랜덤수가
			// 처음 뽑은거와 같은지 보고 아니면 출력 , 3번째 뽑은 것은 1번째 2번째랑 다 비교.

			// 아니면 세개를 다 뽑고 각 숫자가 같은지 판단.

			// 2.사용자 입력값받기
			Scanner input = new Scanner(System.in);

			HERE: FAIL: for (int o = 0; o < 5; o++) {
				int strike = 0, ball = 0; // 스트라이크와 볼의 수를 카운팅 하기 위해서 초기화.
				System.out.println("숫자를 입력 하세요:(띄어쓰기로 구분) ");
				String in = input.nextLine(); // 문자열로 답을 받음

				StringTokenizer sc = new StringTokenizer(in); // in을 통해서 받은 문자열을 스트링 토큰나이저로 자름
				for (int i = 0; sc.hasMoreTokens(); i++) { // 토큰이 남아 있을 때 까지 i값 증가.

					String answer1 = sc.nextToken(); // 현재 토큰을 가져와서 저장
					answer[i] = Integer.parseInt(answer1); // 받은 문자열을 띄어쓰기 단위로 정수로 변환하여 answer[] 배열에 저장.
					System.out.print(answer[i]);// 하나 저장 될 때 마다 출력

				}
				// 3.값비교.
				for (int i = 0; i < 3; i++) { // i는 baseball 의 배열을 돌려주는 코드

					for (int j = 0; j < 3; j++) { // 여기는 answer의 벼열을 돌려주는 코드
						if (baseball[i] == answer[j]) { // 배열을 비교해서 같은걸 찾아주는 코드
							if (i == j) { // 그중에서도 자리까지 맞으면 strike를 1증가
								strike++;
								if (strike == 3) {
									System.out.println("정답입니다.");
									break HERE;
								}
							} else { // 그게 아니라 배열중에 맞는것은 있는데 같은 값일 때 일치하는게 아니라면 ball 을 증가.
								ball++;
							}

						}
						if (o == 4) {
							System.out.println("실패입니다." + i);
							break FAIL;

						}

					}

				}
				System.out.println("스트라이크" + strike);
				System.out.println("볼" + ball);

			}
		}
	}



