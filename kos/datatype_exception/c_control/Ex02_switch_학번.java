package c_control;

public class Ex02_switch_학번 {

	public static void main(String[] args) {
		//		우리대학의 학번은 총 10자리로 되어 있습니다.
		//		
		//		
		//				맨 앞의 4자리는 입학년도이고 5번째 문자는 단과대 번호입니다.
		//				     1 : 공대
		//				     2 : 사회대
		//		
		//		
		//				그 뒤의 2자리는 각 학과번호입니다.
		//				  공과대학인 경우는
		//				     11 : 컴퓨터학과       12 : 소프트웨어학과          13 : 모바일학과
		//				     22 : 자바학과         33 : 서버학과
		//				사회대학인 경우는
		//				  11 : 사회학과         12 : 경영학과          13 : 경제학과

		String snum = "2020133001";

		String year = snum.substring(0, 4);
		char depart = snum.charAt(4);
		String major = "";
		String major2 = snum.substring(5 , 7);
		
		
		
		
		
		if (depart=='1') {
			major= "공대";
			
			switch(major2) {
			case  "11" : major2 = "컴퓨터학과";  break;
			case  "12" : major2 = "소프트웨어학과";  break;
			case  "13" : major2 = "모바일학과";  break;
			case  "22" : major2 = "자바학과";  break;
			case  "33" : major2 = "서버학과";  break;

			}

		}else if ( depart =='2') {
			major = "사회대";
			
			switch(major2) {
			case  "11" : major2 = "사회학과";  break;
			case  "12" : major2 = "경영학과";  break;
			case  "13" : major2 = "경제학과";  break;


			}
			
			






			//ex) 2017111001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다

		}
		 System.out.println(snum + "는" + year + "에 입학한 " + major +" "+ major2 + " 학생입니다. " );
	}
	
}

