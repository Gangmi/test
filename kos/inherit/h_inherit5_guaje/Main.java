package h_inherit5_guaje;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Language l = null;
		
		Scanner input = new Scanner(System.in);
		
		String in = "";
		
		do {
			System.out.println("언어를 선택하세요 (1.한국어 2.영어 3.일본어");
			int lan = input.nextInt();
			System.out.println("메시지를 선택 하세요 (1.인사말, 2.자기소개  3. 하고픈 말 ");
			int ment = input.nextInt();
			
			switch(lan) {
			case 1 : l = new Kor("안녕하세요" , "김경민입니다." , "뀨뀨");break;
			case 2 : l = new Eng("hello" , "I'm kyungmin" , "ggu");break;
			case 3 : l = new Jp("konnichiwa", "watashi kimudesu", "ggudesu");break;
			
			
			}
			// l 에 저장된 메시지중 하나를 불러옴 
			
			switch(ment) {
			case 1 : l.hello();break;
			case 2 : l.intro();break;
			case 3 : l.ment();break;
			
			
			}
			System.out.println("계속하시겠습니까?, (Y/N)");
			in = input.next();
			if(in.equals("n")| in.equals("N")){
				break;
			}
			
			
		}while(in.equals("y")|| in.equals("Y"));
		
		
		
		
		
		

	}

}
