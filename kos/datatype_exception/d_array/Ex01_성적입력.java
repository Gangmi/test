package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01_성적입력 {

	public static void main(String[] args) {
		
		/*
		 * 문젱 ) 
		 * 학생점수를 입력받아 평균과 총점을 출력
		 * 입력 형식: 80/ 88/ 87
		 * 출력 형식:
		 *  총점: ㅌㅌㅌ
		 *  평균: ㅌㅌㅌㅌ 
		 */
		Scanner input =new Scanner(System.in);
		System.out.println("점수를 입력해주세요 / 로 구분하세요");
		
		 String in = input.nextLine(); //변수를 받아오고
		 StringTokenizer sc = new StringTokenizer(in, "/"); // 그변수를 스트링토큰나이저로 /단위로 가져옴
		 int a=sc.countTokens();//토큰의 갯수를 세는 코드
		 int total =0 ; // while 이 반복되는 동안 total에 값을 저장할 것이기때문에 밖에서 선언.
		 
		 
		
		 while (sc.hasMoreTokens()) { // 토큰이 있는 경우에 while문을 반복.
			String score2 = sc.nextToken(); //sc로 받은 문자열 변수를  score2 에 저장.

			int score = Integer.parseInt(score2); //받은 문자열 변수를 정수형으로 캐스팅하여 저장
			total += score; // 위에 선언한 total값에 score를 더해줌  while이 반복 될 때 마다.
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//			for을 사용해서도 만들 수 있다 i가 도는 동안 문자열 score 를 위에선언하고 나올 때 마다 값을 저장해서 나중에 한 번에 print 할 수도 있다. 해보장.
//			더할때는 다시 반복문을 쓰던지 , 혹은 문자열을 저장하고 하나씩 더해.
			
			 
		}
		System.out.println("총점 :" +total);
		System.out.println("평균 :"+ (total/a));

	}

}
