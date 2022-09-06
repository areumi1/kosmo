package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch04 {

	public static void main(String[] args) {
		//   문제 2.
	  	//스캐너로 월을 인풋받아서 해당월의 총 날짜를 
  		//	: "<월>은 <몇일> 일 까지 있습니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("달을 입력해 주세요 : ");
		int month = sc.nextInt();
		int days = 0;
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10: case 12:
			days = 31;
			break;
		case 4: case 6: case 9: case 11:
			break;
		case 2 :
			days = 28;
			break;
		default : 
			System.out.println("존재하지 않는 달입니다.");
		}
		System.out.printf("%d 달은 %d 일 까지 존재 합니다.",month,days);
		

		
		sc.close();

	}

}
