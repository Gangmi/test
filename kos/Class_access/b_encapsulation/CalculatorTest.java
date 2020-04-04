package b_encapsulation;

import java.util.Scanner;

public class CalculatorTest { // 클래스명과 자바 파일명은 동일. 우리는 항상 그렇게... 

	public static void main(String[] args) {

		// 인스턴스 생성. 우리가 설계한 클래스는 그저 글씨일 뿐이다.
		CalculatorExpr cal = new CalculatorExpr();
		// 입력받고 설정.
		String ch="";
		Scanner input = new Scanner(System.in);
		do {

			System.out.println("새로운 숫자를 입력 해 주세요");
			cal.setNum1(input.nextInt());
			cal.setNum2(input.nextInt());
			input.nextLine();

			// 사칙연산 메소드 호출하여 연산
			System.out.println("덧셈 " + cal.getAddition());
			System.out.println("뺄셈 " + cal.getSubstraction());
			System.out.println("곱셈 " + cal.getMultiplication());
			System.out.println("나눗셈" + cal.getDivision());
			System.out.println("계속 진행하시겠습니까?");
			ch = input.nextLine();
			if (ch.equals("n") | ch.equals("N")) {
				break;

			}
			System.out.println("추출된 숫자" +cal.getNum1()+","+ cal.getNum2());
		}while (ch.equals("y") | ch.equals("Y"));
		
		


	}

}
