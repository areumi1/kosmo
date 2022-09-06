package chapter04.EX05;

import java.util.Scanner;

public class Using_While03 {

	public static void main(String[] args) {
		// "그만" 할때 까지 정수값을 넣어서 합계와 평균을 출력
		// 힌트 : String 으로 인풋 값을 받아서 int 형으로 변환
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		System.out.println("원하는 정수를 입력 하신 뒤 그만 으로 종료를 알리세요. : ");
		String a = sc.next();
		
		
		while (!a.equals("그만") ) {
			int n = Integer.parseInt(a);
			sum += n;
			count++;
			a = sc.next();
			
		}
		if (count == 0) {
			System.out.println("입력하신 정수가 없습니다.");
		}else {
			System.out.printf("입력하신 정수갯수는 %d 이고, 합은 %d 이며 평균은 %f 입니다.",count,sum,sum/(double)count);

		}
		

	}

}
