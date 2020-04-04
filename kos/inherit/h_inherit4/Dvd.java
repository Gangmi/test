package h_inherit4;

public class Dvd extends Item {

	String actor;

	String director;

	public Dvd() {
		System.out.println("DVd 기본생성자");

	}

	public Dvd(String num, String title,String actor, String director) {
		super(title, num);
		this.actor = actor;
		this.director = director;
		System.out.println("DVD 인자 생성자");

	}

	public void output() {
		System.out.println(num);
		System.out.println(title);
		System.out.println(actor);
		System.out.println(director);

	}

}
