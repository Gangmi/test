package h_inherit;

public class Test {
	/*
	 * overloading : 동일한 함수명으로 인자의 자료형과 갯수 다른 함수들
	 * 
	 * overriding : 상속 관계에서 인자와 반환 값까지 동일한 함수들일 경우 -> 엄마와 자식이 인자와 반환 값이 같은 함수를 가지고 있을 때 , 이 함수를 다르게 취급 해 주는것
	 */

	public static void main(String[] args) {
		
		//1.각 클래스 생성.
//		
//		Umma um = new Umma();
//		um.gene();
//		um.job();
//		

//		Ddal d = new Ddal();
//		d.gene(); // 이것 같은 경우는 umma 와 ddal 이 같은것을 가지고 있지만 자기 자신것을 부르게 된다.
//		d.study();
//
//		//* 딸의 객체를 통해서 엄마가 가진 함수를 호출한다 -> 이게되네? // 엄마객체를 생성하지 않아도 이 코드가 동작 함. -> 상속을 받았으니까 가능한것임.
//		d.job(); 
//		//Ddal 클래스가 Umma클래스를 상속 받았기 때문에 Ddal 클래스의 객체만 생성해도 Umma클래스가 먼저 메모리에 올라 오고 Ddal 의 객체가 생성 된다.
//		//따라서 이 d 의 class ddal은 이미 umma클래스를 상속 받았기 때문에 둘 다를 지칭하는 것이 된다 -> 자동으로 umma의 intance를 생성한다. 
//		
//		//2. 부모변수에 자식 객체를 생성
//		Umma dal = new Ddal(); // 변수의 데이터 타입이 엄마 이고 딸의 객체를 생성 -> 
//		//dal.study//변수 자체가 엄마를 참조 하기 때문에 이렇게 만들었더라도 쓰지 못함. // 이게 많이 만들고 조금쓰겠다는 것임
//		
//		dal.gene(); //  엄마클래스를 변수로 사용하고 umma 와 ddal 에 모두 있는 gene 를 부르면 , ddal의 객체를 만든 것이기 때문에 ddal의 gene 을 참조한다. 
		
		//3 객체임을 확인 하고싶을 때
		
//		Ddal d = new Ddal(); // 전에 배운 연산자 instanceof로 앞에 있는 것이 뒤에 있는 것의 객체인지 알아 볼 수 있다.
//		if(d instanceof Ddal) {
//			System.out.println("딸 객체");
//		}
//		if(d instanceof Umma) {
//			System.out.println("부모 객체");
//		}
//		//이 결과로 현재 Ddal d 가 Ddal 객체면서 Umma 클래스의 객체라는 것을 알 수 있다.
		
		//4. 형변환
		// (casting) -> 기본형일때만 사용 가능 하지만, 상속관계의 클래스는 가능하다.
		//만약 String a new String("Hello");
		//int i = (int)a

//		Umma a = new Umma(); // a 는 엄마만 참조함 -> 메모리에 엄마만 올라와 있음
//		Ddal b = (Ddal)a; // b 는 딸의 객체 인데 엄마 객체를 참조 하려고 하니가 casting 이 안됨 
//		b.gene(); // 똑같이 가지고 있다고 해도 엄마 객체는 딸의 gene로 캐스팅이 안된다.
		
//		//이것은 가능  -->> 이거 잘 이해가 안됨 // " overriding 된 상황에는 둘 다 가지고 있지만 자식것만 부를수가 있다 "
		Ddal c = new Ddal();
//		Umma d = (Umma)c; // up - casting 자식변수를 부모변수로 바꾼다. 
//		Ddal e = (Ddal)d; // down- casting 부모 변수를 자식 변수로 바꾼다.
		c.gene();
		
		/*## [개발시]
		 * 1. 부모클래스의 멤버를 그냥 사용
		 * 2. 부모클래스에 없는 경우 그냥 자식클래스에 그냥 추가 하면 됨
		 * 3. 부모클래스에 있는데 , 변경이 필요한 경우 -> overriding 을 하면 무조건 자식거를 불러줌
		 * 
		 * 
		 * ----------------------------------------------------------------------
		 * [설계시]
		 * -공통요소를 부모 클래스에 넣는다.
		 * -고유 요소를 자식클래스에 넣는다. -> 부모를 상속 받기 때문에 다 사용이 가능하다.
		 * 
		 */
		
		
		
		
	}

}
