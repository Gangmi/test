package c_control;

public class Ex05_while_복습 {
	public static void main(String[] args) {



		int n = 1;   
		int sum = 0;
		while( true ){
			sum += n; // n1 , sum1 ; n2 sum3, n3 sum6 n4 sum 10 n5 sum 15   
			if ( n++  == 10 ) break;
		}
		System.out.println("SUM = " + sum );
	}

}
