package e_static;

public class Book {
	private static int count; // 멤버변수 캡슐화를 하면 메인에서 찾아 갈 수가 없다.
	int a =0;
	public Book(){
		count++;
		System.out.println("책 한개 생성");
	}
	public static int getCount() { // 메소드 한테는 public 을 붙이는것이 캡슐화
		return count;
	}
	
	
}
