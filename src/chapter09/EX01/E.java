package chapter09.EX01;

//extends : 상속 : class E는 class A를 상속받는다. ( 동일한 패키지에서 상속 설정 (import X))
	// class D 는 class A 의 모든 필드와 메소드를 물려 받는다.
// A 클래스 : 부모 클래스 (super class), 필드, 메소드
// E 클래스 : 자식 클래스 (child class)
	
public class E extends A {
	
	public void print() {
		System.out.println("== 부모의 필드 호출 ==");
		System.out.println(a); 		// public		<== 부모의 a 필드
		System.out.println(b);		// protected	<== 부모의 b 필드
		System.out.println(c);		// default		<== 부모의 c 필드
//		System.out.println(d);		// private	오류발생 동일한 파일내에서 사용가능		<== 부모의 d 필드
		
		System.out.println("== 부모의 메소드 호출 ==");
		print1();					// public		<== 부모의 메소드 호출
		print2();					// protected	<== 부모의 메소드 호출
		print3();					// default		<== 부모의 메소드 호출
//		print4();					// private	오류발생 외부 클래스에서 적용불가		<== 부모의 메소드 호출
		
		
	}

}
