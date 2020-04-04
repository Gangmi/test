package 배열연습;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 배열연습_성적_관리 {

	public static void main(String[] args) {
		
		/*
		 * 입력할 학생수를 입력하세요
		 *  
		 *  4명의 국어 영어 수학 점수를 받아 출력하기.
		 *  
		 *  1째 , 2째 3째 4재,
		 *  
		 *  각각의 총점 과 평균을 구한다.
		 *  
		 *  그리고 각 과목의 총점과 평균을 구한다.
		 *  
		 */
		//학생수 입력 받기.

		Scanner input = new Scanner(System.in);
		System.out.println("학생수를 입력 해 주세요");
		int snum = input.nextInt();
		input.nextLine();

		// 학생수에 따른 행렬을 생성.
		int[][] stu = new int[snum][3];

		// 4명의 국영수 점수를 입력 받아 출력하기.
		for (int i = 0; i < snum; i++) {
			System.out.println((i + 1) + "번 째 학생의 점수를 입력 해 주세요  /로 구분");
			String score = input.nextLine();

			StringTokenizer sc = new StringTokenizer(score,"/"); // 스트링 토큰나이저로 자름
			int j = 0;

			while (sc.hasMoreTokens()) { // 자른 토큰이 있을 때
				stu[i][j] = Integer.parseInt(sc.nextToken()); // stu의 i행 j번째에 저장한다.
				++j; // j가 1 씩 오른다. 토큰이 있을 때 까지만.

			}

		}

		// 출력
		for (int k = 0; k < stu.length; k++) {
			double sum = 0;
			for (int i = 0; i < stu[k].length; i++) {
				sum += stu[k][i];
			}
			System.out.println((k + 1) + " 번째 학생의 총점은 " + sum + "이고 평균은" + (sum / stu[k].length));

		}

	}

}
