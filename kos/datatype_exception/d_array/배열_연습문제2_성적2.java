package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 배열_연습문제2_성적2 {

	public static void main(String[] args) {
		/*
		 * 학생수를 입력받아오기.
		 * 
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("학생수 입력");
		
		int stu = input.nextInt();
		//점수를 저장할 변수 (score)를 학생수 만큼 선언.
		input.nextLine(); // 이 다음에 또 nextLine 으로 변수를 받아야 하기 때문에 엔터를 상쇄시키는 코드를 꼭 작성한다. ------->중요***
		
		int[][] score = new int[stu][3];
		
		//입력
		for(int i=0; i<score.length ; i++) { //점수의 길이 까지 입력 i=1이라서.
			System.out.println((i+1)+"번째 학생의 점수를 입력 해 주세요");
			String score2= input.nextLine();
			
			StringTokenizer sc = new StringTokenizer(score2, "/"); // 스트링 토큰나이져로 변수를 입력받고 자름
			
			
				int k=0;
				while(sc.hasMoreTokens()) { //int k 를 지정해서 안쪽에서 k를 늘리면서 변수를 저장
					score[i][k] = Integer.parseInt(sc.nextToken()); // 스트링 토큰나이저 현재 위치의 변수를 정수변환해서 저장
					++k;
					
				}
				
			}
			
			
		// 학생들의 점수 전체 출력
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+ "번째 학생의 점수");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(+ score[i][j]+ " ");
			}
			System.out.println();
		}
		
		double total[] = new double[stu];
		
		//각 점수의 합을 구하고 평균을 출력
		for(int i=0; i<score.length; i++) {
			int add =0; // 각 총합을 잠시 저장하고 한 번 실행될 때 초기화.
			for(int j =0; j<score[i].length; j++) {
				total[i]+=score[i][j];
			}
			System.out.printf(" %d 번째학생 총점은   %f 점 이고  평균은 %.3f 입니다. \n"  // 실수일때는 %f 라고 표시를 해야 함
					
							  ,(i+1),total[i],( total[i]/score[i].length)  );
							
		}
		//과목평균 
		double[] subtotal =new double[score.length]; 
		String[] subject = {"국어" , "수학" , "영어"};
		for(int i =0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				subtotal[i]+=(double)score[j][i]; // 과목당 총점을 sub total에 저장.
				
				
			}
			System.out.printf(subject[i] +"과목의 총점은"+ subtotal[i] + "평균은"+ "%.3f \n" ,(subtotal[i]/score.length));
		}
		
		
		
	
		
	
		
		
	}

}
