package 학점구하기;
import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("점수의 갯수를 입력 해 주세요");
		int score = input.nextInt();
		//입력된 데이터 개수 크기의 원소를 같는 int 타입 배열 생성
		int[] jumsu= new int[score];
		// 입력으로 데이터를 받아서 첫 번째부터 끝까지 저장한다.
		System.out.println("점수를 입력 해 주세요 띄어쓰기로 구분");
		for(int i =0; i<score; i++) {
			jumsu[i]=input.nextInt();
		}
		//저장된 원소 값들을 하나의 행에 ,  기호로 분리하여 출력한다.
		System.out.print("점수들: ");
		for(int i =0; i<score; i++) {
			System.out.print(jumsu[i]+ ",");
		}
		System.out.println();
		
		GradeExpr ge = new GradeExpr(jumsu);
		//총점
		System.out.println("총점: "+ge.getTotal());
		//평균은 소숫점 이하 둘째 자리 까지 출력한다.
		System.out.printf("평균 : %.2f \n"  ,ge.getAverage());
		//최고점수
		System.out.println("최고점수 "+ge.getGoodScore());
		//최저 점수
		System.out.println("최저점수 :"+ge.getBadScore());
		
		
		
		

	}

}
