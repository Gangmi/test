package 학점구하기;

public class GradeExpr {
	private int[] jumsu; // main 에서 점수배열을 양도받아 여기에 저장.
	
	
	 
	

	public GradeExpr(int[] i) {
		this.jumsu = i;
	}

	public int getTotal() { // 토탈을 구해서 리턴.
		int total =0;
		for (int i = 0; i < jumsu.length; i++) {
			total+= jumsu[i];
		}
		return total;

	}

	public double getAverage() { // 객체 생성시 전달된 점수배열에 저장된 점수릐 평균을 리턴
		double avg = (double) (getTotal()) / jumsu.length;
		return avg;
	}
	public int getGoodScore() { // 입력된 점수들 중에서 최고 점수를 int.형으로 return
		int goodscore =0;
		for(int i=0; i<jumsu.length; i++) {
			if(goodscore<jumsu[i]) {
				goodscore=jumsu[i];
			}
		}
		return goodscore;
	}
	public int getBadScore() { 
		int badscore=jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(badscore>jumsu[i]) {
				badscore=jumsu[i];
			}
		}
		return badscore;
	}
	
	
	
	
	

}
