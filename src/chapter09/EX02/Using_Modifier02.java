package chapter09.EX02;

import chapter09.EX01.A;

// A 클래스와 다른 패키지에 존재하는 클래스 : import를 사용

public class Using_Modifier02  {

	public static void main(String[] args) {
		
		// import 됨
		A a = new A();
		
		// 필드 접근
		System.out.println(a.a);		// public
//		System.out.println(a.b);		// 오류 protected : 다른 패키지에서 접근 할 경우  상속관계가 적용 되어 있어야한다.  
//		System.out.println(a.c);		// 오류 default : 외부클래스 접근 불가 
//		System.out.println(a.d);		// 오류 private : 외부클래스 접근 불가
		
		a.print1();					// public
//		a.print2();					// protected <접근 불가>, 상속이 적용안되어 있음.
//		a.print3();					// default <접근 불가>
//		a.print4();					// private <접근 불가>

		System.out.println("== 상속 관계 객체 출력 (D) ==");
		
		D d = new D();
		
		d.print();
		
		
	}

}
