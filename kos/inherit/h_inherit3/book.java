package h_inherit3;

public class book extends Item {
	
	/*
	 * this : 자신 객체를 지칭하는 레퍼런스
	 * super : 부모의 객체를 지칭하는 레퍼런스
	 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	 * 
	 * this(인자) : 자신 객체에서 다른 생성자 함수를 부를 때 사용
	 * super(인자) : 부모 객체에서 다른 생성자 함수를 부를 때 사용 -> 기본을 부를 때는 super(); 로 부를 수 있고 .this() 와 같이 생성자 함수의 가장 위에 위치해야 한다.
	 * 
	 * 
	 * 
	 */

	String author;

	String publisher;

	public book() {
		System.out.println("북 클래스 기본 생성자");

	}

	public book(String num, String title, String author, String publisher) {
		
		
		
//		super.num = num; // num과 title 은 원래 이 클래스 거는 아니다. 만약 부모도 num이 있고 이 클래스도 num 이 있을 때는 this 로 내것을
//						//super는 부모것을 지칭한다
//		super.title = title;    // super - > 부모 객체를 지칭하는 레퍼런스
		//여기서 부모의 생성자 함수를 불러서 이쪽으로 오게  하고싶을 때  super() 를 사용 할 수 있다. super() : 부모 생성자 함수를 호출 할 때 사용함 이것 역시 가장 첫번째 
		//줄에만 사용할 수 있다는 것이다
		super(title, num);
		
		this.author = author;  //	this : 자신 객체를 지칭하는 레퍼런스 , this() 다른 생성자 함수를 호출할 때 사용함
		this.publisher = publisher; 
		System.out.println("book 인자 생성자");

	}

	public void output() {
		System.out.println(num);
		System.out.println(title);
		System.out.println(author);
		System.out.println(publisher);
	}
}
