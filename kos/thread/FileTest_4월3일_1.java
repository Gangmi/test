import java.io.File;

public class FileTest_4월3일_1 {

	public static void main(String[] args) {
		
		
		
		File f = new File("a.txt"); 
		
		if (f.isFile()) { //파일도 관리 할 수 있고 디렉토리도 관리 할 수 있다.
			System.out.println("파일");
		}else if (f.isDirectory()) {
			System.out.println("디렉토리");
			String [] sub = f.list();
			
			for(String m:sub) {
				System.out.println(m);
			}
			
		}
		
		
		f.delete(); // 이걸로 파일을 지울 수 있지만, 휴지통으로 안간다.
		
	}

}
