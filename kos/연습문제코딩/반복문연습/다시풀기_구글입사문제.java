package 반복문연습;

public class 다시풀기_구글입사문제 {

	public static void main(String[] args) {
		/*
		 * * 문제 : 8의 숫자 세기(구글입사문제)
		 *
		 * 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가? 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두
		 * 카운팅 해야 한다. (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다) 결과 : 4000
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * 1부터 100000 까지 돌아가는 코드 i=0 i<10000 i++
		 * 이중에서 8 이들어가는 값을 찾아내려면,
		 * 일단, 10으로 나눴을 때 나머지가 8인경우, 8이 들어간다.
		 * 그런데 100이상일 경우에는 걸러주지 못해,
		 * 808이들어왔을때 8 2개를 카운팅 해 주기 위해서는 이 수를 10으로 나눴을 때 몫이 0이 될 때 까지 반복문을 계속 동작 시켜야 한다.
		 * for 문으로 제일 위에 코드를 만들고 그 for이 돌아가는 동안 나오는 수를 a 에 저장, a를 10으로 나눴을 때 몫이 0이 될 때 까지 코드를 반복시킨다.
		 *  
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		int count =0;
		for(int i=1; i<=10000; i++) {
			int a = i;
			while(a!=0) { // a 가  0이 될 때 까지 이 코드를 반복한다.
				if(a%10==8) {
					count++;
				}
				a/=10; // while 이 끝날 때 a 값을 10 나눠서 검사한다. 이게 8을 더 가지고 있는지.
				
			}
		}
		System.out.println(count);
		
		
		

	}

}
