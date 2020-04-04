import java.util.Scanner;

public class 윤년구하기 {

	public static void main (String [] args) {
		int year;
		Scanner input = new Scanner(System.in);
		System.out.println("년도를 입력 해 주세요");
		year = input.nextInt();
		if(year%4==0 && year%4 != 00|| year%400 == 0 ) { // 4로 나눴을 때 나누어떨어지고, 100년마다는 아니고, 400년마다는 맞고
			
			System.out.println("윤년입니다.");
			
		}else {
			System.out.println("윤년이 아닙니다.");
		}

	
		int  arr [] [] = {  { 1, 2, 3, 4, 5}, { 6, 7, 8 }, { 9 } , { 7, 7, 7, 7 }  };
		int a = arr[2].length;
		int [] arr2 [] ;
		int arr3[] = { 1, 2, 3 };
		System.out.println(a);
		
	}
}












