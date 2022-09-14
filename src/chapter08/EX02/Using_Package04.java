package chapter08.EX02;

// import 시 * 를 사용하는 경우 : 해당 패키지의 모든 클래스를 import
//		- 하위의 패키지는 적용 되지 않음.
//		- * : 패키지의 모든 클래스만 적용. 하위패키지는 적용되지 않음.

import chapter08.EX01.*;		// 

public class Using_Package04 {

	public static void main(String[] args) {
		
		A a = new A ();
		
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
		
		//B b = new B();		// 오류 발생 : 외부 클래스에서 접근 불가 (default)
		
		C c = new C ();
		
		System.out.println(c.cc);
		System.out.println(c.dd);
		c.print();
		
	//	D d = new D ();		// 오류 발생  : comm 하위의 패키지는 import가 적용되지 않음.

	}

}
