package c_collection;

import java.util.*;

public class bHashSetLottoEx {
	public static void main(String[] args) {
		HashSet<Integer> lottos = new HashSet<Integer>(); // hashset 은 중복되지 않는다. 중복수를 가릴 때 유용..

		while (lottos.size() < 6) { // 6칸이 다 나올 때 까지 돌린다고 한다. -> for 보다는 while이 낫다. => 언제 까지 해야 할 지 모르니까
			int num = (int) ((Math.random() * 45) + 1); // 1부터 45사이의 임의의수 지정

			lottos.add(num);
		}
//		System.out.println(lottos);
		ArrayList<Integer> list = new ArrayList<Integer>(lottos); // Int는 기본형이라서 안된다.
		
		Collections.sort(list); // 이 코드는 list 의 값만 받는다. 따라서 위에 ArrayList를 만들어준다. -> 정렬을 해줌
		System.out.println(list);

	}
}
