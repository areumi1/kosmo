package chapter04.EX04;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {
		
		// for 문 내의 if
		// 정수 (음수, 양수) 을 스캐너로 5개 인풋받아서 
		// 양수만 더한 값 과 평균값 을 출력 하세요.
		
		Scanner sc = new Scanner (System.in);
		int sum1 = 0 ;
		int sum2 = 0 ;
		int count = 0 ;		// 양수를 카운트 하는 변수
		int count1 = 0;
		for (int i = 0; i < 5; i++) {		
			System.out.println("정수를 입력하세요 : ");
			 int a = sc.nextInt();
			 sum2 += a;
			 count1++;
			if (a> 0) {
				sum1 += a;
				count ++;		// 양수일때 1씩 증가
			}
			
			
		}
		System.out.println("합계 : "+ sum1);
		double cc = sum1 / count ;
		System.out.println("평균 : "+cc);
		System.out.println("양수의 합 : "+ sum1+", 양수의 평균 : "+ sum1 / (double)count);
		System.out.println("모든 수의 합 : "+ sum2+", 모든 수의 평균 : "+ sum2 / (double)count1);
		
		
	}

}
