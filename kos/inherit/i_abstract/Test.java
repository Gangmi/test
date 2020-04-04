package i_abstract;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 화면가정 - 여기서 그림을 그린다 가정
		Sharp s = method();
		s.draw();

	}

	static Sharp method() {
		Scanner in = new Scanner(System.in);
		System.out.println("님이 원하는 도형은? 1.사각 2.원 3.삼각");
		int sel = in.nextInt();
		Sharp s = null;
		
		switch (sel) {
		case 1:s = new Rect();break;
			
		case 2:s = new Circle();break;
			
		case 3:s = new Tri();break;
			
		}
		return s;

	}
}
// [ 추가 ] 밑변이나 높이 등의 값을 각각 입력 받아 넓이 구하기

abstract class Sharp {
	Scanner input = new Scanner(System.in);

	public abstract void draw(); // abstract없이 overriding 한 경우 이런 경우에 overriding 강제성이 없다.

}

class Rect extends Sharp {
	int h;
	int w;
	public void draw() {
		System.out.println("사각형의 넓이와 높이를 입력 해 주세요");
		h = input.nextInt();
		w = input.nextInt();
		System.out.println("사각형의 넓이는 :" + (h * w));

	}

	public void rectangel() {
		System.out.println("사각형은 점 4개의 도형입니다.");
	}
}

class Circle extends Sharp {
	int i;
	

	public void draw() {
		System.out.println("원의 반지름을 입력 해 주세요");
		i = input.nextInt();
		System.out.println("원의 넓이는 :" + (((double)i*i) *Math.PI));
	}

}

class Tri extends Sharp {
	int h;
	int w;
	public void draw() {
		System.out.println("삼각형의 높이와 넓이를 입력 해 주세요");
		int h = input.nextInt();
		int w = input.nextInt();
		System.out.println("삼각형의 넓이는 :" + ((double) h * w) * 0.5);
	}
}
