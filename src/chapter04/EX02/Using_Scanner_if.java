package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if {

	public static void main(String[] args) {
		
		// 문제 : Scanner 로 정수값을 인풋 받아서 
		//국어(aa), 영어(bb), 수학(cc), 과학(dd), 음악(ee) 점수를 인풋 받습니다. 
		// if 문을 사용해서 평균이 90점 이상이면 "A 학점", 80점 이상 : "B 학점" 70점 이상 : "C 학점" 60점 이상 : "D 학점", 나머지 : "F 학점"

		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학, 과학, 음악 점수를 공백으로 구분해서 입력해 주세요.>>>");
		
		int aa = sc.nextInt();
		int bb = sc.nextInt();
		int cc = sc.nextInt();
		int dd = sc.nextInt();
		int ee = sc.nextInt();
		
		
		double ff = (aa + bb + cc + dd + ee) / 5.0;
		
		if (ff >= 90.0) {
			System.out.println("A 학점 : " + ff);
		}else if (ff >= 80.0) {
			System.out.println("B 학점 : "+ ff);
		}else if (ff >= 70.0) {
			System.out.println("C 학점 : "+ ff);
		}else if (ff >= 60.0) {
			System.out.println("D 학점 : "+ ff);
		}else {
			System.out.println("F 학점 : "+ ff);
		}
		
		sc.close();
		
	}

}
