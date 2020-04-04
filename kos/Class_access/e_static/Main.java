package e_static;

public class Main {

	public static void main(String[] args) { // 이름이 main이고 인자로 arg라는 String[] 을가지고 리턴값이 없고 어디서든 접근이 가능하고 ...
		/*
		 * 메인에 static을 하는 이유는 클래명으로 바로 접근을 하기 위해서 이다/ static이 없으면 객체를 생성해야하는데 , jvm 이 객체를 만들고 초기화시켜서 다시
		 * 그 클래스의 변수명으로 main 메소드를 부르는 것 보다 효율적이기 때문에 , 객체 생성을 하지 않고도 main 메소드를 읽기 위해서 main에 스태틱을 붙였다.
		 */
		
//		
//		Book b1 = new Book(); // 메모리를 확보 하자마자 1이들어감. 생성자 함수에 의해.
//		Book b2 = new Book();
//		Book b3 = new Book();
//		
		
		//위와 같은 방법으로 객체를 만들면 count 가 각 객체마다 존재하기 때문에 누적이 되지않는다. 이 셋의 count값을 공유하고싶다.
		//static 을 book class에 있는 count 앞에 붙이게 되면 static을 위한 메모리가 따로 잡히면서 처리가 된다. 그리고 static은 미리 메모리에 올라온다.
		// 원래는 count가 분산되는것이 맞다 객체가 다르기 때문에. 
		
		
	
		System.out.println("총갯수 :" + Book.getCount()); // 객체 생성을 하지 않아도 그 안에 static 변수를 가져 올 수 있다. -> 객체가 없어도 클래스 명으로 
												   // 접근이 가능 하다.  -> 이것이 static의 존재 이유이다. 미리 메모리에 올리는 것
												   // 이미 메모리에 올라 가 있기 때문에 객체가 없어도 접근이 가능하게 된다.
												   //멤버 변수에 static을 붙이는 경우에는 공유가 하고싶어서 이고
												    // 메소드에 static을 붙이는 경우는 class 에 접근을 하기 위해서
		


	}

}
