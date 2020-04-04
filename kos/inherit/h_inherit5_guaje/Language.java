package h_inherit5_guaje;

public class Language {
	protected String hello;
	protected String intro;
	protected String ment;

	// 셋 다 오버라이드
	
	
	
	public Language (String hello , String intro, String ment) {
		this.hello = hello;
		this.intro = intro;
		this.ment = ment;
		
		
		
	}
	
	
	public void hello() {
		System.out.println(hello);
	}

	public void intro() {
		System.out.println(intro);
		
	}

	public void ment() {
		System.out.println(ment);
		
	}

}
