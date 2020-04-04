package 반복문연습;

import java.util.Scanner;

public class For_연습문제12_주사위의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==n) {
					System.out.println(i+"+" + j);
					
				}
			}
		}

	}

}
