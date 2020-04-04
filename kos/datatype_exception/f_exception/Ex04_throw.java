package f_exception;

public class Ex04_throw {

	public static void main(String[] args) { // throw 와 throws 는 다르다.
		// 지사
		try {
			readArray();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료"); // 문제가 생겨도 여기까지 오려고..

	}
	//-------------------------------------------
	//본사   아래 
	//본사에서try catch를 잡아버리면 무조건 정상이된다.
	static void readArray() throws Exception{
		String[] msg = new String[] { "행복하자", "끝내자", "맛난거먹자" };
		try { // 예외를 여기서 잡을 거니까 try 를 써준다.
			for (int i = 0; i <= msg.length; i++) { // = 을 사용했기 때문에 없는 값을 참조해서 예외가 발생함.
				System.out.println(msg[i]);
			}
		} catch (Exception e) {// 캐치에는 뭔가 잘못된것이 나온다.
//			System.out.println("예외 발생: " + e.getMessage()); //지금과 같은 경우는 관계가 없지만, 이 배열이 어떤 기준으로 모이는 곳이 필요하다.
			
			throw new MyException(); // 내가 만드는 예외를 일부러 발생하게 하기 위해서는 앞에 throw를 붙인다 
								     // 이 코드 자체가 예외를 발생 시키는 코드이다. 이 구문이 있는 곳에서 catch로 가게된다.
		}

	}

}
