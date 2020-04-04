package thread.basic_4월2일_7;

class Bread 
{
	String bread;

	//##  	

	boolean isCheck= false; // 안써도 false이긴함
	
	
	
	//빵이 먼저 만들어지고 가져가야지..
	public void setBread( String bread )
	{
		this.bread = bread;
		//##
		isCheck = true; //빵이 만들어졌다는 신호
		synchronized(bread) {
			notifyAll(); //빵이 만들어지는 순간에 blocking 에 있던 대기하고 있는 스레드를 불러줌
			
		}
	

	}	

	
	
	public String getBread()
	{
		//## 		
		if(!isCheck) { // 빵이 안만들어졌으면, 기다려야지
			try {
				synchronized(bread) {
				wait();//blocking 으로 올라감 -> 반드시 notify로 풀어줘야함 , 하지만 이걸 하는 도중에도 다른것을 할 수 있기 때문에
				       // 이 메소드와 notifyAll 메소드를 동기화 처리 해 줘야한다.
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

		return bread;
	}
}

class Baker extends Thread
{
	Bread bbang;

	
	
	//빵을 만들기만
	Baker( Bread bbang )
	{
		this.bbang = bbang;
	}
	public void run()
	{
		bbang.setBread("진열된 완성된 맛있는 빵");
	}
}





class Customer extends Thread
{
	Bread bbang;

	Customer( Bread bbang )
	{
		this.bbang = bbang;
	}
	public void run()
	{
		System.out.println("빵을 사감 : " + bbang.getBread());
	}
}

class Ex8_BreadTest_4월3일_6
{
	public static void main(String[] args) 
	{
		Bread  bread = new Bread();

		//커스터머와 베이커가 , 빵을 공유함 --> 빵이 없는데 사가는 경우가 생김
		Baker  baker = new Baker( bread );
		Customer customer = new Customer( bread );
		customer.start();
		baker.start();

		try{
			customer.join();
			baker.join();			
		}catch( Exception ex ){}

	}
}
