package 반복문연습;

public class 다시봐while_연습문제2_369게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제 369게임
		 * 1부터 n까지의 숫자를 출력하고
		 * 3 6 9 가 나올때 짝을 출력
		 * 33은 짝짝
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * 풀이.
		 * 1~100 범위의 숫자를 출력하는코드
		 *  
		 * 나오는 값을따로 저장해서 계산하는 코드 
		 *  
		 * 조건문에 대입시켜서 3,6,9가들어가는지 확인하는코드
		 * 
		 * 그 범위안에 3 , 6 , 9 가 나올 때 짝을 출력하고 10이상의 3이들어간 모든 수까지
		 * 
		 * 들어간 숫자대로 짝을 출력한다.
		 * 
		 * 
		 * 
		 *
		 */
		for(int i=1; i<=100; i++) { //100번 반복하는 코드 1부터
			int su =i;
			boolean g369 = false; // 이 스위치가 참이 될때
			while(su!=0) {
				int na = su%10; //su 를 10으로 나눈 나머지가 3 6 9 인지 확인 하려고.
				if(na==3||na==6||na==9) {
					System.out.print("짝");
					g369=true;
				}
				su/=10; // 이 코드로 10이상의 수를 나눴을 때 몫이 0이 아니라면 반복문을 계속 수행하도록
				
			}
			if(g369) {
				System.out.println();
			}else {
				System.out.println(i);
			}
			
		}
	
	}

}
