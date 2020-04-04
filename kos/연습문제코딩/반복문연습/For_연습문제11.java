package 반복문연습;

import java.util.Scanner;

public class For_연습문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 
		 */
		Scanner input = new Scanner (System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		int ad = 0; 
		for(int i=0; i<n; i++) {
			for(int k=0; k<m; k++) {
				++ad;
				System.out.print(ad+ " ");
				if(ad%m==0) {
					System.out.println();
				}
				
			}
			
		}

	}

}
