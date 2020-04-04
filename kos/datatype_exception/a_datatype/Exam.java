package a_datatype; //3월 13일 

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

		//나이와 키를 입력박아서 출력
		


		Scanner input = new Scanner(System.in); // 입력 받을 수 있는 가상의 통로를 만든다. // 변수 명은 관련이 있는걸로 하는게 좋다.
		

		System.out.print("나이를 입력 해 주세요 -->");
		int age= input.nextInt();//nextInt는 값을 받는 명령어. 여기서 위에 만들어 놓은 변수를 사용한다.
		

		System.out.print("키를 입력 해 주세요 -->");
		double tall=input.nextDouble();
		//이름을 받으려면?
		System.out.println("이름을 입력 해 주세요 -->"); //next를 사용하면 스페이스가 있기 전 까지만 읽게 되어 홍 길 동 이라고 쓰면 홍 까지만 읽게 된다.
		input.nextLine();
		String name = input.nextLine();
		
// 		변수가 잘 받아 졌는지 확인.
		System.out.println(name + "님  나이 : "+ age +", 키 : " + tall);
		








	}

}
