package c_control;

public class Ex01_swich_주민번호 {

	public static void main(String[] args) {

		String id = "200316-4534567" ; // 뒷자리 두번째를 지역수 라고 가정하고


		char chul = id.charAt(8); // 2가 들어갈 것이다. id 라는 문자열의 8번째 문자 하나.
		String home = ""; 


		switch(chul) { // switch case 문은 항상 break 로 그 구문을 벗어 날 수 있다. break를 쓰지 않으면 case에 맞는 값이여도 break 가 나올 때 까지
		               // 코드를 실행 하기 때문에 꼭 break 를 써 주어야 한다.
		
		case '0' : home = "서울"; break;

		case '1' : home = "인천/부산"; break;

		case '2' : home = "경기"; break;
		
		default : home = "한국인"; // default 를 통해 위에 걸리지 않은 값들을 한 번에 정의 할 수 있다. break 를 안쓴 이유는 default 의 위치가 맨 뒤라서이다
 		  						 // default 가 맨 위에 있다면 break; 를 써 주어야 한다.
		}

		System.out.println("출신지 - " + home);














	}

}
