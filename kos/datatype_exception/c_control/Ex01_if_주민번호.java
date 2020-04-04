package c_control;

import java.util.Calendar; //전부 다 가져다가 쓰는 기호

public class Ex01_if_주민번호 {

	public static void main(String[] args) {
		
		//프로그램 에서 숫자는 0부터 셀 수도 있고 1부터 셀 수도 있다.
		//프로그램 언어 같은 경우는 거의 0부터 세고
		//나머지 들은 1부터 세는 경우가 많다.
		
		String id = "990405-3111111"; // 우리 주민등록 번호에서 0부터 세서 7번째 문자가 0인지 1인지를 판단해서 성별을 판단.
		char sung =id.charAt(7); //문자 열에서 문자하나를 가져 오는것이라서. charAt(n) 은 n 번째 문자열을 가져 오는 것이다.
		
		//성변수에 값이 1이면 남자를 출력
		//그렇지 않고 2라면 여자를 출력
		
		if (sung == '1' ||sung ==  '3' || sung == '9') {
			System.out.println("남자");
			
		}else if ( sung== '2' || sung == '4' ||sung == '0') { // 문자를 변수로 잡았기 때문에 값의 비교 또한 문자 2 로 해야 한다. 중요 / 실수함.
			
			System.out.println("여자");
			
			
		}
		
		//나이를 구하기. 나이는 주민등록번호 맨앞의 두개를 얻어와야 하기 때문에
		//id.substring(beginIndex, endIndex) // begin부터 end'앞'까지 
		String nai =id.substring(0, 2); //
		
		//nai = "80" 문자열 80은 계산이 안 됨 현재 문자열 80이다
		//따라서 문자를 정수로 변환
		
		int nai2=Integer.parseInt(nai); // 정수로 변환 
		
		//이 때 nai 2 에 들어있는 것은 숫자 80이다.
		Calendar c = Calendar.getInstance(); // 캘린더를 불러와서 인스턴스를 만드는 코드
		int year =c.get(Calendar.YEAR); // 만들어진 캘린더에서 년도를 따와서 year 이라는 정수형 데이터 변수에 저장 한 것
		
		int age = 0;
		if (sung == '1' || sung == '2'  ) {
			
			age = year - (1900 + nai2) + 1; // 현재 년도에서 1900 + 주민등록상 앞 두자리 + 1(우리나라 나이) 
		
		}else if ( sung == '3' || sung =='4') {
			age = year - (2000 + nai2) + 1;
		
		}else if ( sung == '0' || sung =='9') {
			age = year - (1800 + nai2) + 1;	
		}
		System.out.println("나이 " +age);
	     
		
		//현재 년도를 박아버려서 내년에는 못쓰는 프로그램이 되므로 
		//자바에서 달력을 불러와서 년도가 바뀔 때 마다 자동으로 년도를 넣어줌
	}
	
}	
		
		
		//위와 같이 코딩하면 2000년대 이상 사람은 계산이 안 된다. 예를들면 오늘 태어난 아기가 있다고 했을 때
		
		
		
		
		
		
		
	
		
		
		
		
		

	

