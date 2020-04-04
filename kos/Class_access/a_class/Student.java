package a_class;

public class Student { //이렇게 서로다른 변수와 함수등을 한 데 묶은 것을 클래스라고 한다.
	String name;
	int kor, eng, math;
	int total;
	double avg;
	
	int caltotal() {
		total = kor+eng+ math;
		return total;
		
	}

	double calAve() {
		avg = (double)total/3;
		return avg;
	}
	
	
}
