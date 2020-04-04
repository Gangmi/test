package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex03_throws {

	public static void main(String[] args) {
//		readFile(); // 아래처럼하면 이렇게 함수를 call한곳에 에러가 생긴다 . 왜냐면 readFile에서 예외가 넘어왔는데 그걸 처리하는 구문이 없기 때문이다.
		
		
		try { // 따라서 마지막에는 try catch가 필요하다.
			readFile();
			System.out.println("파일 처리 성공");
			
		} catch (Exception e) {
			 
			System.out.println("실패");
		}
		
		
	}
	static void readFile() throws Exception{ //FileNotFoundException // 그게 아니라 모든 예외를 넘기겠다{
		FileInputStream fis = new FileInputStream("data2.txt"); // 이런 파일이 존재 하지 않을때 이 구문을 try catch 로 잡는다면 데이터는 처리가
															 	// 안 되는데 파일 처리 성공이라는 문구가뜨기 때문에 잡으면 안된다. 
		System.out.println("파일 연결됨");
		
		
		//따라서 그 구문에서 잡을거라면 try catch
		//그게 아니라 함수를 call한곳으로 던지려면 throws 구문을 사용하면 된다.

	}

}
