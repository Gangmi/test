package network1.basic_4월3일_7;

import java.io.*;
import java.net.*;

public class SimpleServer {
	
	public final static int PORT = 5000;	// PortNumer : 1024 ~
	
	public static void main( String args[] ) {
		
		ServerSocket 		server = null;
		DataInputStream 	in = null;
		DataOutputStream out = null;
		Socket clientSocket = null;
		
		try{
			// 1. 서버 소켓 생성 
			server = new ServerSocket( PORT );
			System.out.println("SimpleServer started..");
		
			// 2. 클라이언트 접속시 소켓 생성
			// 3. 소켓의 입출력 스트림 얻기
			
			clientSocket = server.accept(); //이 클라이언트 소켓이 여러개면 여러명의 클라이언트를 받을 수 있을 것이다.
											// 하지만 이 코드를 반복문을 돌리면 , 제어권이 아래로 넘어가지 않으니까 
											// 이 코드를 thread안에서 반복문을 돌려야 한다.
			
			
			
			
			in = new DataInputStream( clientSocket.getInputStream());
			out = new DataOutputStream( clientSocket.getOutputStream() );
		
			// 4. 데이터 전송
				String line = in.readUTF();
				System.out.println("we received : " + line );
				if( line.compareTo("안녕") == 0 ) {
					out.writeUTF("뀨?" );	
				} else {
					out.writeUTF("^^");
				}
		
			// 5. 소켓닫기
			in.close();
			out.close();
			clientSocket.close();
		} catch ( Exception ex ) {
			System.out.println( ex.getMessage() );	
		}
	}	
}