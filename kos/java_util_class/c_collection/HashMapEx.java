package c_collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx // 키와 값으로 이루어진 데이터의 집합.
// 순서를 유지하지 않음
// 키는 중복을 허용하지 ㅇ낳음
// 값은 중복하지 않음
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		HashMap map = new HashMap();
		map.put("javassem", "1111");
		map.put("javassem", "1234"); // 위의 javassem/1111을 덮어버림? //둘중에 뭐가 될까?
		map.put("kimssem", "1234");
		map.put("kimjava", "9999");
		map.put("kimbabo", "1234");

		boolean stop = false;
		while (!stop) // -> 무조건 트루
		{
			System.out.println("아이디와 패스워드를 입력하세요");
			System.out.print("아이디 -> ");
			String id = input.nextLine();
			System.out.print("패스워드 -> ");
			String pass = input.nextLine();

			// 1-1. 입력받은 id가 map에서 key 부분에 해당되는 것이 있다면
			if (map.containsKey(id)) { // 들어온 id 값이 키값중에 해당되는 것이 있는지 확인.

				// 2-1. 그 아이디와 같은 key의 value값과 입력받은 패스워드가 같다면 로그인 성공
				if (map.get(id).equals(pass)) {
					System.out.println("로그인");
					stop = true; // 스탑이 트루가 되는 순간 끝난다. or 이 반복문을 나간다는 뜻으로  break 를 사용해도된다.

					// 2-2. 패스워드가 다르다면 출력
				} else {
					System.out.println("패스워드가 틀립니다.다시해.");
					continue; // 즉시 해당회차 반복문 탈출하고 다시돌아감.

				}

				// 1-2. 없다면 해당하는 아이디 없다고 출력
			} else {
				System.out.println("존재하지 않는 아이디 입니다.");
				continue; // -> 이 부분에서 다시 시작 하기 위해서
			}
			// 코딩문이 많은 경우

		}

	}
}
