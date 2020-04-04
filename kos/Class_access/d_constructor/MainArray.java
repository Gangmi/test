package d_constructor;

import java.util.Scanner;

public class MainArray {

	/**
	 * 3명의 학생 정보를 입력받아 각 학생별 총점 평균을 구한다면
	 */

	public static void main(String[] args) {

		Student[] s = new Student[3];
		Scanner in = new Scanner(System.in);
		// 입력부
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();

			System.out.println((i + 1) + "번째 학생의 이름을 입력 해 주세요");
			s[i].setName(in.next());
			System.out.println("성적을 입력 띄어쓰기로 구분 국 영수 ");
			s[i].setKor(in.nextInt());
			s[i].setEng(in.nextInt());
			s[i].setMath(in.nextInt());

		}
		// 출력부

		for (int i = 0; i < s.length; i++) {
			System.out.println((i + 1) + "번째 학생");
			System.out.println("총점 :" + s[i].calTotal());
			System.out.println("평균 :" + s[i].calAverage());
		}
		double[] sum = new double[3];

		// 각 과목의 점수를 총합하고 평균을 구하기.
		
			for (int j = 0; j < sum.length; j++ ) {
				sum[0] += (double) (s[j].getKor());
				sum[1] += (double) (s[j].getEng());
				sum[2] += (double) (s[j].getMath());
			}
		
		for (int j = 0; j < sum.length; j++) {
			if (j == 0) {
				System.out.print("국어");
			}
			if (j == 1) {
				System.out.print("영어");
			}
			if (j == 2) {
				System.out.print("수학");
			}
			System.out.println("과목의 평균" + sum[j] / sum.length);
		}

	}

}

// 추가적으로 각 과목별 총점을 구한다면?
