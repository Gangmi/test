package c_control;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		// 세 정수 abc 가 주어질 때 두번째로 큰 수를 출력하는 프로그램
		Scanner input = new Scanner (System.in);
		System.out.println("정수 a 를 입력하세요 ->");
		int a = input.nextInt();
		System.out.println("정수 b 를 입력하세요 ->");
		int b = input.nextInt();
		System.out.println("정수 c 를 입력하세요 ->");
		int c = input.nextInt();

		//		if ( a>b && a<c || a<b && a>c) {
		//			System.out.println("중간값은 : " + a);
		//		}else if (b>a && b<c || b<a && b >c) {
		//			System.out.println("중간값은 : " + b);
		//		}else if (c>b && c<a || c<b && c>a) {
		//			System.out.println("중간값은 : " + c);
//	
//		int second_max =0; //
//		if (a>b) {
//			if(b>c) {
//				System.out.println(second_max =b);
//			}else {
//				if(a>c) {
//					System.out.println(second_max = c);
//				}else {
//					System.out.println(second_max = a);
//				}
//			}
//		}else {
//			if(c>b) {
//				System.out.println(second_max = b);
//			}else {
//				if(a<c) {
//					System.out.println(second_max = c);
//					
//				}else {
//					System.out.println(second_max =a);
//				}
//				
//			}
//		}
//		System.out.println(second_max);
		
		// 세 정수 abc 가 주어질 때 두번째로 큰 수를 출력하는 프로그램
		
		//String pass = (score>= 80) ? "합격"  : "불합격" ; // 문자열을 저장하려면 문자열로 만들어야지,,,
		int mid =0;
		if(a>b) {
			 mid = (b>c) ? b : ((a>c) ? c : a) ; 
			
		}else {
			 mid = (b<c) ? b : ((a>c) ? a : c) ;
		}
		System.out.println(mid);
		
		
		
	}
	
	
}


