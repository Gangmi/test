package io.bytestream_4월2일_1;

/*
	===========================================================
	OuputStream을 구현한 FileOutputStream을 이용한 예제
	===========================================================
	
	@ write( int )
		` 0-255 사이의 정수를 인자로 받아 해당하는 바이트를 출력스트림에 쓴다
		` 인자로 정수형을 받지만, 실제로는 부호없는 바이트로 전송
		  ( 자바에서 정수형은 32bit이지만 그 중 8bit만 사용 )
	
	
	
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputTestFirst
{
	public static void main( String args[] ) 
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("a.txt");// 자바에서 나가는 통로이므로 output
			//이 통로에 write를 하면 이 통로를 통해 넘어간다. -> 파일에다 출력하는 통로
			

			for( int ch = 'A'; ch <='Z'; ch++)
			{
				fos.write(ch); // 이렇게 함으로서 A 부터 Z 가 텍스트파일에 써진다 
			}
				
			fos.close();// 통로를 사용하면 반드시 통로를 닫아야 함.
			
		}catch( IOException ex ){
			System.out.println("파일전송실패 :" + ex.toString() );
		}
	}	
}

/****************************************************
	a.txt 를 노트패드와 워드패드로 읽어보기
*/