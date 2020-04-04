package h_inherit4;

public class Test {

	public static void main(String[] args) {

		Item[] it = method();  // 부모 변수에 자식 객체를 생성한 것이기 때문에 부모것만 참조가 가능.
							   // 하지만 overriding 된 함수는 자식의 것을 부른다.
		//출력
		for(int i =0; i<it.length; i++) {
			it[i].output();
		}

	}

	static Item[] method() {
		
		book b = new book("001", "자바", "홍길동", "코스모");
		Cd c = new Cd("002", "아무노래", "지코");
		Dvd d = new Dvd("003", "킹덤", "배두나", "김은희");

		Item[] i = new Item[3];
		i[0] = b;
		i[1] = c;
		i[2] = d;
		return i;

	}

}
