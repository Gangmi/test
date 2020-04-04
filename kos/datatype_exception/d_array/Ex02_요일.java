package d_array;

import java.util.Calendar;

public class Ex02_요일 {

	public static void main(String[] args) {
		
		Calendar c =  Calendar.getInstance(); // 이미 만들어져 있는 년월일 시분초를 가져오는것 = 다른 것 처럼  복사하는 느낌이 아님, 그냥 얻어오는 것
		
		int y = c.get(Calendar.YEAR);
		int mo = c.get(Calendar.MONTH);
		int d = c.get(Calendar.DATE);
		System.out.println(y +"년"+ (mo+1) +"월"+d + "일");
		//월은 문자열의 0번째가 januarty 이기때문에 하나 덜 나오게 된다.
		//따라서 month 에 1을 더해줘야 한다.

		
		//시 분초 출력
		int t = c.get(Calendar.HOUR_OF_DAY);
		int m = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		System.out.println(t +"시"+ (m+1) +"분"+s + "초");
		//calendar 는 시 분초 까지 출력가능.
		
		//요일 출력 일요일(1) ~ 토요일(7);
		
		
		String [] yoil = {"일","월","화","수","목","금","토"}; //요일에 따른 값을 미리 정해놓고
		int yoil2 = c.get(Calendar.DAY_OF_WEEK);//현재 요일의 값을 int yoil2에 담는다.
		
		System.out.println(yoil[(yoil2-1)]+"요일"); //int yoil2의 값은 우리가 정한 문자열보다 1많은 수를 보여주기때문에 -1해주고
												   //그 값을 배열 YOIL 에 넣어주면 정상적으로 출력된다.
		
		//요일은 또 숫자로 되어있음. 1요일 -> 일요일 이라서,,,  우리가쓴 배열은 0이 일요일 이니까 항상 1을 빼 줘야한다. 
		//배열을 만들어서 해당하는 요일을 꺼내온다.
		
		
		
		
		
		

	}

}
