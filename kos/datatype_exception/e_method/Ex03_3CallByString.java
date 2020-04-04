package e_method;

public class Ex03_3CallByString {
	public static void main(String[] args) { // string 도 call by reference 이지만, 결과가 call by value로 나온다. 유의 할 것
		String a = "안녕";
		String b = "하이";
		add(a, b);
		System.out.println("A" + a + ", B = " + b);
	}

	static void add(String a, String b) { 
		// a+=b
		a+=b;
		System.out.println("A" + a + ", B = " + b);

	}
}
