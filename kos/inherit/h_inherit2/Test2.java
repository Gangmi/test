package h_inherit2;

import java.awt.*;
/*
 * is-a : MyFrame2 is a Frame 라고 함 
 */

class MyFrame2 extends Frame { // 이렇게 부모의 기능을 마음대로 쓰고 "확장" 하고 싶을때 사용한다. + 자바는 이렇게 하고button도 상속 받게 하고 싶어도 
								// 상속을 받을 수가 없다. 다중상속이 안된다.
	
	public MyFrame2() {
		//super(); -> inherit3 -> 이것을 쓰지 않아도 자동으로 생성 되기 때문에 부모의 생성자 함수를 먼저 불러 오는 것이다.
		super("나의 두번째 화면"); // ->> 부모의 String 이 들어가는 생성자 함수를 불러 오는 것이 된다. 
		
		setSize(500, 300); // 이 안에 선언 되거나 하지 않았지만 Frame을 상속 하고 있기 때문에 마음대로 가져와서 쓰는 것이 가능하다.
		setVisible(true);
		
	}// 또 부모가 가지고 있는 함수를 변경하고 싶을 때 똑같은 함수를 만들어서 변경해서 출력하는것도 가능하다.
	
}

public class Test2 {

	public static void main(String[] args) {
		new MyFrame2();
		
		

	}

}
