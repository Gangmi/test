package c_collection;
import java.util.TreeSet;

public class bTreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet  set = new TreeSet(); // 이건 tree 구조는 작으면 왼쪽 크면 오른쪽 으로 둔다.
									 // 읽는 방법이 있다. - > 정렬이 쉽다.
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("snack");
		set.add("zebra");
		set.add("bee");
		set.add("lion");

		System.out.println( set );
		

	}
}
