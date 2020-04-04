package thread.basic_4월2일_7;

public class Ex_2_RunnableTest_2 {

	public static void main(String[] args) {
		
		MakeCar2 mc1 = new MakeCar2("차틀만들기") ;
		Thread t1 = new Thread(mc1); 
		t1.start(); //
		
		
		
		
		new Thread(new MakeCar2("엔진부착")).start();
		
		/*// 친절한 코딩
		 * 앞의 thread 클래스를 상속받은 클래스는 start() 함수를 가지고 있기 때문에 바로 사용이 가능하지만
		 * runnable 인터페이스에는 start() 함수가 없기 때문에 따로 thread 클래스의 객체를 생성하면서 생성자함수에
		 * runnable을 구현한 클래스의 객체를 넣어주고 thread 의 객체 에서 start를 부르는 식으로 사용해야 한다.
		 * 
		 * 덜친절한 코딩 
		 * 
		 * 한번만 사용하고 마는 코딩을 줄인다.
		 * makecar 객체를 생성하면서 스레드 클래스의 이름모를 객체가 생성되면서 Start 함수를 부르는 코딩.
		 * 
		 * 위의 3줄을 한줄로 줄이는 것.
		 * 
		 */
		
		

	}

}

class MakeCar2 implements Runnable  { //1 . runnable 구현
	String work;
	MakeCar2(String work){
		this.work = work;
	}
	
	
	public void run() {// 오버라이딩 이미 해 놨음 러너블 안에 들어있는 추상메소드 - run 임
		for (int i = 0; i < 5; i++) {
			System.out.println(work + "작업중");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

	}

}

