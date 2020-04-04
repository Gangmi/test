package h_inherit4;

public class Cd extends Item {
	String singer;

	public Cd() {

	}

	public Cd(String num, String title,String singer) {
		super(title, num);
		this.singer = singer;
		System.out.println("CD 인자 생성자");

	}

	public void output() { 
		System.out.println(num);
		System.out.println(title);
		System.out.println(singer);
	}
}
