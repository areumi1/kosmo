package chapter09.EX05;

class B{
	
	int a = 10;				//인스턴스 필드
	static int b = 20;		//정적필드
	
	void abc() {		// 인스턴스 메소드 : 객체를 생성후 사용. 
								// -- 인스턴스 필드, 정적필드, 인스턴스메소드, 정적메소드
		System.out.println("인스턴스 메소드 - abc()");
		System.out.println(a);		// 인스턴스 필드
		System.out.println(b);		// 정적 필드
		cde();						// 인스턴스 메소드
		bcd();						// 정적 메소드
	}
	
	static void bcd() {			// 정적메소드 : 객체 생성후 호출, 객체 생성없이도 호출
									// -- 정적 필드, 정적메소드
	//* 정적 메소드는 객체 생성없이 사용이 가능하다. 그러나 인스턴스 필드나, 인스턴스 메소드는 객체를 생성해야만 사용가능하므로 정적 메소드 내부에 포함 될 수 없다.
		System.out.println("정적 메소드 - bcd()");
//		System.out.println(a);		// 인스턴스 필드 올수 없다.
		System.out.println(b);		// 정적 필드 (O)
//		cde();						// 인스턴스 메소드 (X)
		def();						// 정적 메소드 (O)
	}
	
	void cde() {				// 인스턴스 메소드
		System.out.println("인스턴스 메소드 - cde()");

	}
	
	static void def() {
		System.out.println("정적 메소드 - def");
	}
	
}


public class Using_StaticMethod02 {

	public static void main(String[] args) {
		// 객체 생성없이 바로 호출 : static 필드, static 메소드
			//클래스명.필드명, 클래스명.메소드명()
		
		System.out.println("== static : 객체 생성 없이 호출");
//		System.out.println(B.a);	//인스턴스 필드 오류
		System.out.println(B.b);
//		B.abc();		//인스턴스 메소드 오류
		B.bcd();
//		B.cde();		//인스턴스 메소드 오류
		B.def();
		
		System.out.println("== 객체 생성후 필드, 메소드 호출 ==");
		//인스턴스 필드, 정적 필드 모두 호출됨.
		B b = new B();
		
		System.out.println("== static : 객체 생성후 호출");
		System.out.println(b.a);	//인스턴스 필드 오류
		System.out.println(b.b);
		b.abc();		//인스턴스 메소드 오류
		b.bcd();
		b.cde();		//인스턴스 메소드 오류
		b.def();
		
		
		
		

	}

}
