package c_control;

public class Switch_연습문제 {

	public static void main(String[] args) {
		
		  int i =1, j=0; // i가 1 이기 때문에 default 값 까지 점핑하게 된다.
		  
		  switch ( i ) {
		   case 2 : j += 6;
		   case 4 : j += 1;
		   
		   default : j += 2; //default 값에 break; 가 없기때문에 아래에 case 0 까지 실행된다.
		   
		   case 0 : j += 4;
		  }
		  System.out.println( j ); // 답은 6이 나온다 . 이유는 int i 의 값은 1 이라고 했기 때문에 default 값으로 처리 되어
		       					   // j+=2 ; 가 실행 되지만 break 가 없기 때문에 아래에 case 0 의 경우도 실행이 되기 때문에
		  						   // j+= 4; 가 더해져 마지막에 출력되는 j 값은 6이다.
		  
//		  int i =2, j=0;  				 이 경우에는 i 가 2 이기 때문에 break 가 없으므로, case 2 의 코드 아래에 있는 코드가 모두 실행된다.
		  
//		  switch ( i ) {
//		  case 2 : j += 6;
//		  case 4 : j += 1;
//		  default : j += 2;
//		  case 0 : j += 4;
//		  }
//		  System.out.println( j );   // j 의 값은 13 이 된다.
		  
		  // 정확한 결과값을 원한다면  -> switch 구문을 빠져 나오려면, 아래처럼 break;를 사용해야 한다.
		  
		  
//		  int i =2, j=0;
//		  switch ( i ) {
//		   case 2 : j += 6; break;
//		   case 4 : j += 1; break;
//		   default : j += 2;
//		   case 0 : j += 4; break;
//		  }
//		  System.out.println( j );

 
		  


	}

}
