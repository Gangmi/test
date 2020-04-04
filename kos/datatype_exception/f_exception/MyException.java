package f_exception;

public class MyException extends Exception { // 얘가 기존에 만들어져 있는 아이의 역할을 수행 하려면 Exception 을 상속 받아야한다.

	public String getMessage() { //내가 만든 나의 예외이다. Exception 안에 getMessage 가 있기 때문에 이 코드가 가능하고 상속받은 부모의 
								 //메소드 형식을 그대로 가져와서 사용해야 하기때문에 이 getMessage는 String 으로만 return이 가능하다.
								 //다만 이 리턴하는 값은 내가 원하는 문자열로 대체해서 보낼 수 있다. 이것을 overriding 이라고 부른다.
		return"맨날 실수하는 예외 : 배열 범위 잘 봐라" ;
	}
}
