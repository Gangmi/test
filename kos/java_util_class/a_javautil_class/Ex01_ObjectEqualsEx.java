package a_javautil_class;

public class Ex01_ObjectEqualsEx
{
	public static void main(String[] args)
	{
		 StudentA  a = new StudentA("012345", "송혜교");
		 StudentA  b = new StudentA("012345", "송혜교");
		 //object의 equals() : ==
		 //a==b
		 if( a.equals(b)) {
			 System.out.println("객체 a와 b는 같다");
		 }else {
			 System.out.println("객체 a와 b는 다르다");
		 }

		 System.out.println( a.toString()  ); // a가 이미 자식이니까 a. 해도 toString을 call 하는 것이 가능하다.
		 System.out.println( b  );
	}
}

class StudentA extends Object
{
	String  hakbun, name;
	StudentA( String  hakbun, String name)
	{
		this.hakbun = hakbun;
		this.name = name;
	}
	
	public String toString() {
		return hakbun + "/" + name; // 오브젝트 클래스를 상속 받고 있기 때문에 부모의 함수를 overriding 해서 사용 할 수 있다.
	}
	
	
	

}