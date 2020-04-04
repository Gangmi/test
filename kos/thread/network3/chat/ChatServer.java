package network3.chat;

import java.io.*;
import java.util.*;
import java.net.*;


// Runnable 을 구현한 ChatServer 클래스 
public class ChatServer implements Runnable {
	
	//사용자들의 소켓을 저장할 arrayList
	ArrayList vc = new ArrayList();

	
	// new thread(cs)로 시작되는 멀티스레드 작업시에 돌아갈 run 메소드
	public void run() {
		//서버 소켓 자료형의 ss 선언
		ServerSocket ss = null;
		
		
		
		try{
			//서버 소켓의 객체를 생성 하면서 1234포트 설정
			ss = new ServerSocket(1234);
			
		
			//예외처리
		}catch( Exception e ) { 
			System.out.println(e);
		}
		
		
		//트루인동안에 계속 이미 멀티스레드로 제어권이 넘어가서 이 반복문을 계속 돌림으로서 연결된 클라이언트가 있을 때마다 소켓을 저장한다.
		while(true) {
			try{
				
				Socket s = ss.accept(); // 서버소켓의 accept를 불러와서
										// accept 함수는 처리되지 않은 연결들이 대기하고 있는 큐에서 
										// 제일 처음 연결된 연결을 가져와서 새로운 연결된 소켓을 만든다.
										//그리고 소켓을 가르키는 파일지정자를 할당하고 이것을 리턴한다.
				


				
				
				
				System.out.println("Client 가 접속시도 :" + s );
				ChatService cs = new ChatService(s);
				cs.start();
				vc.add(cs); // 어레이 리스트에 이 객체를 보관함.
			
			} catch( Exception e ) { }
		}
	}  // run ends
	
	//메인메소드
	public static void main( String [] arg ) {
		ChatServer cs = new ChatServer(); // 현재 클래스인 ChatServer 의 객체를 생성해서 cs에 담아주고 그 cs를 인자로 넘김.
		new Thread(cs).start(); // 처음에 여기서 sc클래스를 thread로 돌림
	}



class ChatService extends Thread {
		String myname = "Guest";
		BufferedReader in;
		OutputStream out;
		
		ChatService( Socket s ) {
			try{
				in = new BufferedReader( new InputStreamReader(s.getInputStream()));
				out = s.getOutputStream();
			}catch( Exception e ) { }
		}// 생성자 종료
		
	

	public void run() {
		while(true) {
			try{
				//클라이언트에서 보낸 메시지를 읽음 
				String msg = in.readLine();
				
				// 메시지가 없으면 반환
			
				if( msg == null ) return;
				
				
				
				//들어온 메시지를 토큰단위로 자름
				StringTokenizer st = new StringTokenizer(msg);
		
				
				if( st.countTokens() > 1 ) {
					//토큰이 있을 때 까지 토큰을 temp 에 저장
					String temp = st.nextToken();
					
					if( temp.equalsIgnoreCase("/name" )) {
						temp = st.nextToken();
						putMessageAll(myname + "님의 이름이 " + temp + "으로 바뀌었습니다.");
						
						myname = temp;

						// 추가2: 멤버 목록 추가
						changeList();

						continue;
					}
					
					else if( temp.indexOf(">") == 0 ) {
						String towhom = temp.substring(1);
						temp = st.nextToken();
						putMessageTo( towhom, "(속삭임)" + temp );
						continue;
					}
				
					// 추가	
					// 방에 처음 들어왔을때 멤버들에게 인사
					else if( temp.equalsIgnoreCase("/start" )) {
						myname = st.nextToken();
						putMessageAll(myname + "님이 입장하셨습니다");

						// 추가2: 멤버 목록 보여주기
						changeList();
		
						continue;
					}

					// 추가3: 클라이언트측에서 종료할때
					else if( temp.equalsIgnoreCase("/exit" )) {
						
						putMessageAll(myname + "님이 퇴실하셨습니다");

						// 추가4: 멤버목록에서 제거
						vc.remove(this);						
						changeList();

						continue;
					}
				}
				
				putMessageAll( myname + ">" + msg );
			
			}catch( Exception ex ) { return; }
			
		}
	}// run ends
	
	// 추가2: 멤버 목록 보여주기
	void changeList(){
			String msg = "/member  ";
			for( int i =0 ; i<vc.size() ; i++ ) {
				ChatService cs = (ChatService)vc.get(i);
				msg += cs.myname + " ";
			}
			
			putMessageAll( msg ) ; //<-------  여기서 \n을 절대 주면 안됨
			
			
	}

	void putMessageAll( String msg ) {
		for( int i =0 ; i<vc.size() ; i++ ) {
			ChatService cs = ( ChatService ) vc.get(i); // 리스트의 각 인덱스에 있는 소켓의 인아웃을 가져와서  cs에 저
			
			try {
				cs.putMessage(msg);
			}catch( Exception e ) {
				vc.remove(i--);
			}
		}
	} // putMessageAll ends
	
	void putMessageTo( String towhom, String msg ) {
		for( int i=0; i<vc.size() ; i++ ) {
			ChatService cs = ( ChatService ) vc.get(i);
			if( towhom.equalsIgnoreCase( cs.myname )) {
				try{
					cs.putMessage( towhom +">"+ msg);
					break;
				}catch( Exception ex ) { }
			}
		}
	} // putMessageTo ends
	
	void putMessage( String msg )
		throws Exception {
			out.write( (msg+"\r\n").getBytes() );
		}

 } // ChatService class ends
	
	
}// ChatServer class ends
