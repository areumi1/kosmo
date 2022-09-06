package chapter04.EX05;

import java.util.Scanner;

public class Using_While03_1 {

	public static void main(String[] args) {
		// "그만" 할때 까지 정수값을 넣어서 합계와 평균을 출력
		// 힌트 : String 으로 인풋 값을 받아서 int 형으로 변환
		// 1. String s =sc.nextLine(); 인풋 받는다.
		// 2. s.splite(" "); <== 공백을 기준으로 잘라서 배열에 저장
		// 3. 문자열 String 을 정수형으로 변환, Integer.perseInt()
		// 4. 합계와 편균을 구하면 됩니다
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		int count = 0;
		int sum = 0;
		int b;
		
		do {
			System.out.println("정수값을 공백을 이용해서 넣으세요 >>>");
			s = sc.nextLine();
			if (s.equals("그만")) {
				break;
			}
			String []arr;
			arr = s.split(" ");
			for (int i =0; i<arr.length; i++) {
			
				b = Integer.parseInt(arr[i]);
				sum += b;
				count++;
				
			}
			
			System.out.println("정수의 갯수 : "+count);
			System.out.println("정수의 합: "+ sum);
			System.out.println("정수의 평균 : "+ sum / (double)count);
		}while(true);
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		
	}

}
