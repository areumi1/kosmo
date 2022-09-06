package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {
		/*
		  스케너로 나이를 인풋받아서 출력
		  나이(age) 가 8세 미만이면 : "취학 전아동입니다."
		   						 "입장료는 <1000>원 입니다."
		  나이 14 미만 : "초등학생 입니다."
		  			  "입장료는 <2000>원 입니다.
		  나이 20 미만 : " 중, 고등학생입니다."
		  			  "입장료는 <2500>원 입니다.
		  나이 20세 이상 : "일반인 입니다."
		  				"입장료는<3000>원 입니다.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요.>>");
		int age = sc.nextInt();
		
		int prise = 0;
		
		if (age < 8) {
			prise = 1000;
			System.out.printf("취학전 아동 입니다. 입장료는 %d 원 입니다.",prise);
		}else if (age < 14) {
			prise = 2000;
			System.out.printf("초등학생 입니다. 입장료는 %d 원 입니다.",prise);
		}else if (age < 20) {
			prise = 2500;
			System.out.printf("중, 고등학생 입니다. 입장료는 %d 원 입니다.",prise);
		}else {
			prise = 3000;
			System.out.printf("일반인 입니다. 입장료는 %d 원 입니다.",prise);
		}
		
		System.out.println("================");
		
		
		if (age < 8) {
			prise = 1000;
			System.out.println("취학전 아동 입니다. ");
		}else if (age < 14) {
			prise = 2000;
			System.out.println("초등학생 입니다. ");
		}else if (age < 20) {
			prise = 2500;
			System.out.println("중, 고등학생 입니다. ");
		}else {
			prise = 3000;
			System.out.println("일반인 입니다. ");
		}
		System.out.println("입장료는 " + prise + " 원 입니다.");
		
		
		
		sc.close();
		

	}

}
