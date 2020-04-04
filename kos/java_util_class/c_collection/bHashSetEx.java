package c_collection;
import java.util.HashSet;

public class bHashSetEx 
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		set.add("rabbit");
		set.add("zebra");
		set.add("fox");
		set.add("zebra");
		set.add("elephant");
		set.add("elephant");	
		
		System.out.println( set ); // 중복이 들어가지 않음 -> 중복제외를 위해서 사용함 -> hashset으로 중복수 제외를 할 수 있다.
		
	}
}
