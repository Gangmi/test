package io.bytestream_4월2일_1;

/*
	======================================================
	InputStream을 구현한 FileInputStream을 이용한 예
	======================================================
	
	@ int read()
		` 한 바이트를 읽고 이를 0-255사이의 값을 리턴하지만4byte의 int 형으로 리턴
		` 리턴되는 값은 0-255 부호없는 바이트이지만 형변환 과정에서 -128 ~127의 부호 있는 바이트가 된다
		
		
		` 데이타를 읽어들이기 전까지 기다리므로 다른 부분을 실행할 수가 없다
			-> 쓰레드 적용 필요
			
		` 더이상 읽을 바이트가 없으면 -1 리턴
		
		
		
		[ 참고 ]
			int i =  b >= 0 ? b : 256 + b;
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputTestFirst
{
	public static  void main( String args[] ) 
	{

		//a.txt파일에서 읽을 수 있는 스트림을 생성
		try {
			FileInputStream is = new FileInputStream("a.txt");
			
//			for(int i=0; i<26 ; i++) {
//				int data = is.read();// 얘는 왜 인트로...반환..할까.. 
//				System.out.print((char)(data));
//				
//			}
			
			//파일을 읽을 때는 파일이 끝날 때 까지 읽어라.
			//파일이 끝났을 때의 표시를 -1 로 한다. 이 -1 하나 불러오려고 나머지를 전부 int 로 받는것이다.
			
			while(true) {
				int data =is.read();
				if(data == -1 )break; // data 에서 읽는것이 -1 일 때
					System.out.println((char)data);
				
				
				
			}
			
			
			is.close();
			
		} catch (FileNotFoundException e ) {
			
			System.out.println("예외발생");
		}catch(Exception b) {
			
			
		}
		
		
	
		
		
	}	
}

/*
	======================================
		결과 출력
	======================================

	` 숫자만 나오는데, 우선 열개만 읽어서 숫자 자체로 출력하고
	나머지는 읽어서 (char) 형변환 하면 문자로 출력될 것이
*/