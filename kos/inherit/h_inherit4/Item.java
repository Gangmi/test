package h_inherit4;

public abstract class  Item {

	protected String title, num; // 자식한테만 권한을 줌

	public Item() {
	 System.out.println("Item 기본생성자");

	}

	public Item(String title, String num) { // 생성자 함수를 통해서 인자를 가져 와서 멤버 변수에 추가 할 수 있도록 
		this.num = num;
		this.title = title;
		System.out.println("Item 인자 생성자");

	}

	public abstract void output(); //{}; =  3월 27일 수업: 뒤에 준괄호는 구현한거임 -> 추상 메소드는 반드시 오버라이딩을 해야 함 
	//이렇게 하면 개발자가 메소드명같은 것을 실수 하는 일 없이 다형성을 만들 수 있다.
	
	
	
	
	
	
	// 현재 오버라이딩이 적용되어있다 각 class에 . 각 클래스에 맞는 것들을 더 추가해서. title과 num 은 부모가 가지고 있기 때문에
		// 자식이 이것들을 가지고 있지 않아도 사용할 수 있다.
		//부모 클래스의 함수를 오버 라이딩 하고 싶다면 자식의 접근지정자를 같거나 크다를 만족 해야함
		//private < default < protected < public
//		System.out.println(num);
//		System.out.println(title);
	

}
