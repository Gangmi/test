package thread.basic_4월2일_7;

public class Ex_1ThreadTest_1_4월3일_2 {

	public static void main(String[] args) {

		MakeCar1 work1 = new MakeCar1("차틀만들기");
		work1.start();// run을

		MakeCar1 work2 = new MakeCar1("엔진부착");
		work2.start();
		// 이런식으로 하면 work1을 하는 동안에 work2가 동작하지 않는다.

		/*
		 * 멀티프로그래밍 비슷 (멀티스레드.) 을 구현하기 위해서는
		 * 
		 * Thread 상속 또는 Runnable 구현 해주고 -> 클래스 상속을 받을 수 없는 경우를 생각해서 2가지를 모두 제공함
		 * 
		 * run() 을 오버라이딩
		 * 
		 * run() 을 호출. ---> 원래는 이렇게 함수명을 직접 적어서 호출해야하지만 , start() 를 통해서 run()을 호출해야 한다.
		 * 
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * 위의 코딩처럼 만든 객체의 클래스에 thread 나  runnable 을 통해 제어권을 분기마다 나눠줄 수 있다.
		 * 
		 * 
		 * start 로 호출해야 하는 이유
		 * 내가 음악을 들으면서 게임을 한다고 할 때 
		 * 
		 * 이 두개의 작업을 같이 할 때 , 각 작업들을 작은 단위로 쪼개서 번갈아가면서 실행한다.
		 * 
		 *  		 block
		 *  
		 * runnalble 		run  -----------------teminal 
		 * 
		 * run - block runnable로 명령이 전달되고 실행된다.
		 * 
		 * runnalble 에 데이터가 들어와서 큐가 만들어져야, run이 되는 것
		 * 
		 * 따라서 그 runnable이라는 대기실에 들가기 위한 메소드가 start() 이다
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}
}

class MakeCar1 extends Thread {
	String work;

	MakeCar1(String _work) {
		work = _work;

	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(work + "작업중");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

	}

}
