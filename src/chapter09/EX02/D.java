package chapter09.EX02;

import chapter09.EX01.A;

// extends : 상속 : class D는 class A를 상속받는다. ( 패키지 외부에서 상속 설정 (import))
	// class D 는 class A 의 필드와 메소드를 모두 물려 받는다.

	// protected 접근 제어자 : 상속 관계가 있을때만 외부 패키지에서 접근 가능

public class D extends A{
	
	public void print() {
		System.out.println("== 부모 클래스의 필드 출력(다른패키지) ==");
		System.out.println(a);		// public		// 다른 패키지에서 접근됨
		System.out.println(b);		// protected	// 다른 패키지에서 접근됨(상속)
//		System.out.println(c);		// default	오류발생	다른패키지 접근 불가능
//		System.out.println(d);		// private	오류발생	같은파일에서만 접근 가능
		
		System.out.println("== 부모 클래스의 메소드 출력(다른패키지) ==");
		print1();					// public		// 다른 패키지에서 접근됨
		print2();					// protected	// 다른 패키지에서 접근됨(상속)
//		print3();					// default	오류발생	다른패키지 접근 불가능
//		print4();					// private	오류발생	같은파일에서만 접근 가능
	}

}
