package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
	ArrayList<Student> al =method(); // 가져온 ArrayList 를 al 이라는 변수로 저장
	
	//여기서 출력
	for(Object all: al) { // al 배열의 0번째 부터 , 있는 곳까지 출력.
		System.out.println(all); // println 이 tostring 을가지고 있음..? println 안에 String.valueOf(x) 에 의해
									// toString이 불러진다. 문자열을 출력하는 것이기때문에
	}
	for(int i=0; i<al.size(); i++) {
		Student data = (Student)al.get(i); // 이렇게 형 변환을 해서 사용해야 함 -> get 의 리턴형이 object 이기 때문에
		System.out.println(data); 
		
		
	}
	
	
	}
	
	
	static ArrayList<Student> method() { 
		
		 //세명의 학생정보를 저장 : ArraList이용 -> 배열의 갯수를 생각하지 않고 하고 싶어서.
		Student a =new Student("김경민", 27); // 각 학생의 인스턴스를 생성
		Student b =new Student("김2", 27);
		Student c =new Student("김3", 27);
		
		ArrayList<Student> al = new ArrayList<Student>(); // ArrayList 객체생성 
		
		al.add(a); // ArrayList 의 함수 add 로 인자를 전해줌
		al.add(b);
		al.add(c);
		
		return al; //al 을 리턴 -> 자료형이 ArrayList
		
	
	
	
		
		
		
	}

}

//----------------------------------------------------------
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
