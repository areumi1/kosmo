package chapter05.EX01;

import java.util.Scanner;

public class Using_Array11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//탁구 2, 야구 9, 축구 11, 농구 6, 씨름 2	
		// 각 운동종목의 구성원 수의 합과 평균
		
		
		
		String s;
		int count = 0;
		int sum = 0;
		int a = 0;
		do {
			System.out.println("각 종목의 구성원 수를 공백을 이용해서 넣으세요 >>> ");
			s = sc.nextLine();
			String [] arr; 
			arr = s.split(" ");
			for (int i = 0; i < arr.length; i++){
				System.out.println(arr[i]);
			}for (int i =0; i<arr.length;i++) {
				if (i % 2 != 0) {
					a = Integer.parseInt(arr[i]);
					sum += a;
					count++;
				}
			}
			if (s.equals("그만")) {
				break;
			}
			System.out.println("종목의 갯수 : "+ count);
			System.out.println("구성원의 평균 : " + sum/(double)count);
			System.out.println("구성원의 합계 : " + sum);
			
		}while(true);
		System.out.println("프로그램을 종료합니다.");
	}

}
