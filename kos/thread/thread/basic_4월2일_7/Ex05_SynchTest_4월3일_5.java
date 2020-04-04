package thread.basic_4월2일_7;


	
	
class Count {
	
	int i;
	
	
	void increment() { // 지금이 메소드에는 코드는 한 줄 밖에 없지만 코드가 많을 경우 보통 싱크로나이즈 함수를 불러와서 넣어준다.
		
		synchronized(this) { //이런식으로 동기화 하고싶은 변수를 싱크로나이즈 블럭을 씌워서 넣어준다. 이때 인자가 필요한데
						 	// 딱히 쓸 클래스가 없다면 , 이 클래스를 넣어주면 된다.
			i++;
			
		}
		
	}

	
}

class ThreadCount extends Thread {
	Count cnt;
	
	public ThreadCount(Count cnt) {
		
		this.cnt= cnt;
	
	}
	public void run () {
		for(int i=0; i<100000000; i++) {
			cnt.increment();
			
		}
	}
	
	
	
}

public class Ex05_SynchTest_4월3일_5 {
	public static void main(String[] args) {
		//1  count 의 객체를 생성함
		Count cnt = new Count(); 
		
		
		//2. 카운트 객체를 넘기면서 제어권을 줌 
		ThreadCount tc1 = new ThreadCount(cnt);
		tc1.start();
		//3. 제어권을 또줌
		ThreadCount tc2 = new ThreadCount(cnt);
		tc2.start();
		try {
			//여기서 메인 스레드의 제어권이 기다린다.
			
			
			
			tc1.join();
			tc2.join();
			// 이렇게 하면 count 클래스를 공유하고 있기 때문에 두 스레드가 동시에 같은 값을 쓰는 경우가 생긴다.
			// 따라서 synchronized (동기화) 를 통해 한 쪽 스레드가 접근중일 때 다른 쪽 스레드가 접근하는것을 막아서
			// 한 번에 하나의 스레드만 접근 할 수 있게 만들어 주면 된다.
			// 하지만 이럴 경우에 , 속도가 느려진다는 단점이 있다.
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("i 의 결과 :"  + cnt.i);
		
		
		

	}

}
