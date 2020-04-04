package e_staticsample;

public class DBConnect {

	
		
		static DBConnect con =null; // 그리고 여기에도 static을 부여
		

	
	private  DBConnect() { // 생성자 함수  // private를 하면 생성자 함수를 부르지 못함 따라서 여기서만 사용 할 수 있음
		System.out.println("실제로 DB연결");
	}
	
	public static DBConnect getInstance () { //이런 메소드를 만들면 아래의 조건에 의해 단 한번만 생성됨 // 다른곳에서 생성자 함수를 만들 수 없으니까 이 함수에 static을 부여
		
		if(con == null ) con = new DBConnect(); // 메모리에 단 하나만 올리기 위해서 if를 사용함  //이것이 코딩으로 DBC를 하나만 올리는 것.
		return con;								// 이 함수에서는 같은 클래스의 생성자 함수를 사용 할 수 있기 때문에  new DBConnect(); 를 사용 할 수 있다.
	}
	
	

}
