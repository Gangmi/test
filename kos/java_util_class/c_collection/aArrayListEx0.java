
package c_collection;

/*
 * 자료형 관련 클래스 -> wrapper class (감싸준다.)
 * 
 *  Byte/ Short
 *  Character
 *  Integer / Long
 *  Float / Double
 *  
 *  형변환을 위한 클래스 
 *  
 *  우리가 String -> int 형으로 만들기 위해서
 *  Integer.parseInt(); 를 사용했다.
 *  
 *  int 형 -> String 으로 바꾸는 것은?
 *  "" + 10 -> "10"
 *  
 *  String.valueOf(10) -> "10" 이 된다.
 * 
 */


class aArrayListEx0
{
	public static void main(String[] args) 
	{
		Object[] a=dataSet();
		for(int i =0; i<a.length ; i++) {
			System.out.println(a[i]); // 이게 출력이 되는 이유는 toString 을 모두 상속 하고 있고 각 객체들의 클래스가 overriding 하고 있기
									  // 때문이다
		}
		
		
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		
	}

	static Object[] dataSet()
	{// 이것들을 따로 클래스를 만들지 않고 각각의 클래스를 object 로 묶는다. -> 
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;
		
		Object[] data = new Object[3];

		data[0] = name;
		data[1] = new Integer(age);  // 기본형을 클래스로 사용 하기 위해서 사용하는 클래스 Integer
		data[2] = new Double(height);// 역시 기본형을 클래스로 사용하기 위해서 사용 하는 클래스 Double 대문자 주의
		
		return data;

	}
}
