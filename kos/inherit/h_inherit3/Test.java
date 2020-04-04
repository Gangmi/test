package h_inherit3;

import java.util.Scanner;

import src.h_inherit4.Cd;
import src.h_inherit4.Dvd;
import src.h_inherit4.Item;
import src.h_inherit4.book;

public class Test {

	public static void main(String[] args) { 
//		book b =new book("0001","자바","홍길동","코스모");
//		b.output(); //  book 은 Item 을 부모로 가지고 있기 때문에 Item이 먼저불러지고 book이 불러진다.
		
		
		Item i = null; // 만약 이렇게 하지 않으면 각 판매하는 물품의 클래스를 따로 초기화 시켜야 한다.
		
		Scanner input = new Scanner(System.in);
		System.out.println("상품선택 (1.Book 2. DVD 3. CD");
		int sel = input.nextInt();
		//아래에서 설명한 다형성 개념이 가능 하게 하려면
		//1) 부모변수에 자식생성이 가능함 -> 상속관계가 이루어져 있어야 함
		//2) 부르려는 함수가 overriding이 되어 있어야 함
		switch(sel) {
		case 1 :i= new book("0001", "자바", "홍길동" , "코스모"); break; // 1일 경우에 i에 bookclass의 객체를 생성한다. 그러면서 인자를 전해준다.
																	// 전해준 인자로 생성자 함수의 가장 처음에 있는 부모클래스의 생성자 함수에 title
																	//과  num 을 전해주고 돌아와서 book의 생성자 함수 안에 
																	// 저자와 출판사를 전달하고 book 인자 생성자를 출력한다.
																	//그리고 i.output(); 에 의해 i에 현재 생성된 객체의 output을 불러온다.
		case 2 :i= new Dvd("002", "킹덤", "주지훈" , "김은희"); break;
		case 3 :i= new Cd("00001", "아무노랭", "홍길동" ); break;
		
		}
		i.output(); // i 에 들어가 있는 클래스의 output이 출력된다. -> 경우에 따라서 다른 함수가 call 된다. 이것을 다형성개념이라고 한다.
		
		
		
		

	}

}
