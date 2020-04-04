package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String>  list = new ArrayList<String>(4); // 제네릭스를 썼을 때 쓸 수 있는 for 문이 있다.  
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정 -> 자료형을 명확하게 하지 않아서 -> 위에  <> 안에 무슨 자료형을 넣을 건지 쓰면된다.
		for( String data :list ) {
			System.out.println(data); // 제네릭스가 있을 경우에만 사용가능하다.
			
		}
		
//		
//		for(int i=0; i<list.size(); i++) {
//			String data =(String)list.get(i); // 뭐가 됐든 object 형으로 리턴할거야. 쓰고 싶으면 캐스팅 하면 됨
//			System.out.println();
//			
//		}
		

	}
}
