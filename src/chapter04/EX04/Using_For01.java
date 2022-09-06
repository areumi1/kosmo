package chapter04.EX04;

public class Using_For01 {

	public static void main(String[] args) {
		/*
		 for(초기값 ; 조건 ; 증가값){
		 	실행문1;					<== 조건이 참일동안 계속반복 , 거짓이면 for문을 빠져나옴
		 }
		 	
		  */
		
		
		
		//기본 for 문
		int a ;
		for ( a = 0; a < 3; a++) {		// (초기값 ; 조건 ; 증가값)
			System.out.println(a);
		}	// 0 1	2			초기값 실행 => 증가값실행 => 조건대입 => 증가값실행 =>  조건대입  조건이 거짓일경우 종료
		
		System.out.println("=====================");
		// 초기값과 증가값에는 , 로 구분 해서 여러개의 변수 가 올 수 있다.
		
		int b, c, d;
		for (b=0, c=10, d=20; b<5; b++, c+=2, d+=5) {		//5번반복(0,1,2,3,4)
						// b : 1씩 증가, c: 2씩 증가, d: 5번 증가
			System.out.println("b : "+b +" c : "+ c  + " d : "+d);
			
		}
		
		System.out.println("=====================");
		
		// for 문에서 무한루프 ( 조건이나 증가값을 잘못처리할경우)
		int e;
		//for(e = 0 ; e<10; e -= 3) {  	// 무한루프
		for	(e = 0 ; e<10; e += 3) {
		System.out.println(e);			// 조건이 true일 동안 반복 
		}		// 0 3 6 9
		
		System.out.println("========for문 없이 : 1~10 까지 덧샘========");
		
		//1부터 10까지 for 문 없이 덧샘
		
		int sum1;
		sum1 = 0;		//0
		sum1 += 1;		// sum1 = sum1 + 1			// 1
		sum1 += 2;		// sum1 = sum1 + 2			// 3	
		sum1 += 3;		// sum1 = sum1 + 3 			// 6
		sum1 += 4;		// sum1 = sum1 + 4			// 10	
		sum1 += 5;		// sum1 = sum1 + 5			// 15	
		sum1 += 6;		// sum1 = sum1 + 6 			// 21	
		sum1 += 7;		// sum1 = sum1 + 7			// 28	
		System.out.println(sum1);
		sum1 += 8;		// sum1 = sum1 + 8			// 36
		sum1 += 9;		// sum1 = sum1 + 9			// 45
		sum1 += 10;		// sum1 = sum1 + 10			// 55
		System.out.println("1~10까지의 합 : "+sum1);
		
		// for 문을 사용해서 1부터 10까지의 합계 구하기
		int sum2 ;
		int i ;
		for (i = 1, sum2= 0 ; i <= 10; i++) {
			sum2 += i;
			System.out.println("sum2 : " + sum2+ ", i : "+ i );
		}
		System.out.println("1부터 10까지의 합계 : "+ sum2);
		
		// for 문을 사용해서 0 ~ 1000까지 7의 배수의 합계
		// 7의 배수의 합계 : 000
		
		System.out.println("===============================");
		int sum3;
		int f ;
		for (f = 0, sum3 = 0; f <= 1000; f += 7) {
			sum3 += f;
		}
		System.out.println("0 ~ 1000까지 7의 배수의 합계"+sum3);
		
		System.out.println("===============================");
		
		// for 문과 if 문을 사용해서 1~10까지 더한 값을 출력 하되 아래와 같이 출력하세요.
		// 결과 : 1+2+3+4+5+6+7+8+9+10 = 55		
		System.out.print("결과 : ");
		int sum4 ;
		int aa = 1;
		for ( sum4= 0 ; aa <= 10; aa++ ) {
			sum4 += aa;
			if (aa ==10) {
				System.out.print(aa + "=");		
			}else {
				System.out.print(aa + "+");
			}
		}
		System.out.println( sum4);
		
		


		
		
		
		
	}

}
