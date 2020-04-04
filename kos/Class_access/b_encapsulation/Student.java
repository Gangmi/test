package b_encapsulation;

/******* 캡슐화  -> 데이터를 한번 더 보호하기 위해서 캡슐을 씌우는 것이다.
 
B.	private / public 	-> private 멤버 변수 만든 후 main 에서 에러 확인
							-> public 멤버 메소드를 만들지 않아도 에러는 발생하진 않지만 명확하게 public 지정
							
			private : 다른 클래스에서의 접근을 차단				
			public : 모든 클래스에서의 접근을 허용
			캡슐화의 기본은 변수앞에private 를 씌우고 함수는  public을 지정 하는 것이다.
			
			
C.	setter / getter
D.	 this 
		

 */
public class Student {
	// 1. 멤버변수는 private / 멤버 메소드는 public
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	// 오른쪽 클릭 하고 source -> generate setter getter 에서 원하는 값을 클릭한다. -> 자동으로 만드는것이 좋음.
	//this 를 사용하는 이유는 멤버 변수라는것을 지칭해 주기 위해서 사용하는것이다.
	// 함수안에서 사용하는 함수명과 멤버변수의 이름이 같다면, 메소드 안에서의 함수명만 찾을 것이다. 
	// 따라서 멤버변수를 사용 할 수 없기 때문에 this. 으로 차이점을 두어 , 둘을 구분한다.
	
	public int calTotal()		{  
		total = kor + eng + math;  
		return total;
	}
	public double calAverage() 	{  
		avg = (double)total / 3;   
		return avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;// 
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	
	// 2. 필요한 것만 setter / getter 만든다
	//private 가 씌워진 것을 

	
}
