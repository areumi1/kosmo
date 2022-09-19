package basic1;

/*
 *	반복문 : for / while / do~while
 *
 * 	(1) for(초기값; 조건문; 증가값){
 * 			반복구문
 * 		}
 */


public class Ex03_for개념 {

	public static void main(String[] args) {
		
		// 1) 1부터 10까지 숫자 출력
//		for(int i=1; i<=5; i++) {
//			System.out.println(i);
//		}
		
		// [1]위의 for 원리 이해하기
		// [2] 1부터 10까지의 합을 출력
		int sum =0;
		for (int i=1; i<=10; i++) {
			sum += i;
		}System.out.println(sum);
		// [2] 1부터 10까지의 홀수의 합을 출력
		sum = 0;
		for (int i=1; i<=10; i+=2) {
			sum += i;
		}System.out.println(sum);
		
		sum =0;
		for (int i=0; i<=10; i++) {
			if(i %2 == 1) {
				sum += i;
			}
		}System.out.println(sum);
		
		
//		// 2) 'A' 부터 'Z'까지 출력
//		for (char i='A'; i <= 'Z'; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		
//		for (char i='A'; i <= 'Z'; i+=2) {
//			System.out.print(i);
//		}
//		System.out.println();
//		
//		// 'Z' 부터 'A' 까지 출력
//		for (char i='Z'; i >= 'A'; i--) {
//			System.out.print(i);
//		}
//		System.out.println();
		
		
		
		

	}

}
