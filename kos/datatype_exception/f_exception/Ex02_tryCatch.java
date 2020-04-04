package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;

public class Ex02_tryCatch {

	public static void main(String[] args) {
		FileInputStream fis = null; // try  구문에서 사용한 변수는 try가 끝나면 초기화 되기 때문에 따로 선언하고 , null값을 주어 초기화 한다.
		
		
		
		try {
			fis = new FileInputStream("data.txt"); // 이경우에 data.txt가 없을 경우=> 예외처리 를 무조건 정해 주어야 한다.
			//텍스트 파일과 이 파일의 연결 통로를연결
			System.out.println("파일 연결됨");
			fis.read();
			
			//fis.close();// 이 경우에 파일을 읽을 수 없다면 이 구문이 실행이 되지 않는다 . 파일을 열었으면 무조건 닫아야 하기때문에 이 구문은 finally로 가야한다.
			
			//**점심시간 후-> 만약 이 상태에서또 배열에 관한 예외가 생기면 , 또 멈추게 된다. 각 항목마다 예외를 만들수는 없다.
//		} catch (FileNotFoundException e) {//파일이 없을 경우에 예외 처리.
//		System.out.println("파일 없음 예외" ); 
////			e.printStackTrace();
//		}catch(IOException e) {//파일을 읽을 수 없을 경우에 예외 처리.
//			System.out.println("읽을 때 예외 발생"); //이렇게 구체적으로 처리 할 것이 아니라면 아래처럼 catch에서 Exception e 를 통해 모든 예외를 이쪽에서 
											   //처리하고 프로그램을 마칠 수 있다.
		}catch(Exception e) {
			System.out.println("그 외 예 처리"); // -> 위의 예외를 제외하고 또 다른 예외가 발생 했을 경우 모든 예외를 여기서 처리한다.
	
		}finally { //finally 안에서 try catch를 사용하는 이유는 닫을 때 또 예외가 생길 수 있기 때문에 써 준다. / 하지만 닫을 때 나오는 예외는 우리가 따로 처리하지 않기
				   //때문에 예외처리에 대한 내용을 넣지 않는다.
			try {
				fis.close();
			}catch(IOException e) { // 예외가 나와도 넘어간다.
				
			}
			
			
			
		}
		
		

	}

}
