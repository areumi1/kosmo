package basic1;

//import java.lang.*;		자동 컴파일러 그외 직접 입력

/*
 *	자료형(data type)
 *	1. 기본형
 *		boolean
 *		char
 *		int / long
 *		double 
 * 
 * 	2. 참조형
 * 		클래스
 * 		배열
 * 		-> new 예약어를 통해 객체를 생성
 * 
 * 	(*) String	 (String은 자동 컴파일러됨)
 */

public class Ex01_Var{ // extends object {  	자동 컴파일러
	// * 멤버변수 : 자동으로 초기화
	String a;	// null;
	int b;		// 0;

	public static void main(String[] args) {
		// * 지역변수
		
		// 문자열 변수 a 선언
		// 정수 변수 b 선언		// 자동초기화가 되지않기 때문에 초기화하는 습관 가지기.
		String a = null ;
		int b = 0;
		
		// 변수 b에 200 대입
		// 변수 a에 "Hello:을 지정
		
		a = "Hello";
		// ******
		// a = new String("Hello")
		b = 200;
		
		
		// 변수 a와 b 콘솔에 출력
		System.out.println(a);
		System.out.println(b);

	}

}
