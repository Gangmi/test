package c_control;

public class Ex02_if_학번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		우리대학의 학번은 총 10자리로 되어 있습니다.
		//
		//
		//		맨 앞의 4자리는 입학년도이고 5번째 문자는 단과대 번호입니다.
		//		     1 : 공대
		//		     2 : 사회대
		//
		//
		//		그 뒤의 2자리는 각 학과번호입니다.
		//		  공과대학인 경우는
		//		     11 : 컴퓨터학과       12 : 소프트웨어학과          13 : 모바일학과
		//		     22 : 자바학과         33 : 서버학과
		//		사회대학인 경우는
		//		  11 : 사회학과         12 : 경영학과          13 : 경제학과
		//
		//
		//
		//
		//
		//		       ex) 2017111001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다
		//		       ex) 2019211001 는 2019년도에 입학한 사회대 사회학과 학생입니다
		//		       ex) 2018133001 는 2018년도에 입학한 공대 서버학과 학생입니다        

		String id = "2020122112" ; //학번을 먼저 설정한다. 문자열로 이유는 계산이 되면 안 되기 때문이다.


		String inschool =id.substring(0, 4); //id에서 입학년도에 해당하는 숫자를 불러온다 - inschool = 2020 *substring에서 end값은 
		// 그 전 까지라는 뜻이기때문에 원하는 차례 다음 수를 적어 준다.


		char a = id.charAt(4); // 공과 대학인지 사회대학인지 구별하기 위해서 4번째 문자를 char a 에 담는다. -> 문자 하나만 가져오는 것이니까 char을 
		// 쓰도록 하자.

		String depart = ""; // 아래에서 부서를 사용하기 위해서 빈 문자열 변수 depart를 만든다.

		String major = id.substring(5, 7); //학과의 번호를 가져오기 위한 코드

		if(a == '1') { // 문자라는 표시를 꼭 해야한다.
			
			depart = "공대";
			
			if(major.equals("11")) { //equals 를 사용해야 함 = 이유는 문자열의 비교 이기 때문이다.

				major = "컴퓨터학과";
			}
			if(major.equals("12")) { 

				major = "소프트웨어학과";
			}
			if(major.equals("13")) { 

				major = "모바일학과";
			}
			if(major.equals("22")) { 
				
				major = "자바학과";
			}
			if(major.equals("33")) { 

				major = "서버학과";
			}




		}else if (a == '2') {
			
			depart = "사회대";
			
			if(major.equals("11")) { 

				major = "사회학과";
			}
			if(major.equals("12")) { 

				major = "경영학과";
			}
			if(major.equals("13")) { 

				major = "경제학과";
			}

		}
		System.out.println(id + "는 " + inschool + "년도에 입학한 " + depart +" "+ major  + " 학생입니다." ); // " " 를 쓴이유는 공백을 넣으려고 



	}

}
