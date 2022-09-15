package chapter10.EX01;

class Fruit {			// 과일 : 부모 클래스
	String name;	// 과일이름
	String color;	// 과일 색깔
	int large;		// 과일의 크기
	
	void eat() {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
	void print() {
		System.out.println(name+","+color+","+large);
	}
}
class Apple extends Fruit{			// 사과 : 자식 클래스
	// 자식 클래스만 가지는 필드1, 메소드1
		int apllecontent;
		void apllecontent() {
			System.out.println("사과의 당도는 "+apllecontent+" 입니다.");
		}
	
}
class Orange extends Fruit{			// 오렌지 : 자식 클래스
	// 자식 클래스만 가지는 필드1, 메소드1
	int orengecontent;
	void orengecontent() {
		System.out.println("오렌지의 당도는 "+orengecontent+" 입니다.");
	}
}
class Banana extends Fruit{			// 바나나 : 자식 클래스
	// 자식 클래스만 가지는 필드1, 메소드1
	int bananacontent;
	void bananacontent() {
		System.out.println("바나나의 당도는 "+bananacontent+" 입니다.");
	}
}

public class Using_Inheritance02 {

	public static void main(String[] args) {
		// 1. Fruit 클래스 객체 생성 (부모)
		System.out.println("==== Fruit 객체 ====");
		Fruit f = new Fruit();
		
		f.name = "복숭아";
		f.color = "분홍색";
		f.large = 20;
		
		f.eat();
		f.print();

		
		// 2. Apple 클래스 객체 생성 (자식)
		System.out.println("==== Apple 객체 ====");
		Apple a = new Apple();
		
		a.name = "사과";
		a.color = "빨강색";
		a.large = 25;
		a.apllecontent = 50;
		
		a.eat();
		a.print();
		a.apllecontent();
				

		
		// 3. Orange 클래스 객체 생성 (자식)
		System.out.println("== Orange 객체 출력 ==");
		Orange o = new Orange();
		
		o.name = "오렌지";
		o.color = "주황색";
		o.large = 30;
		o.orengecontent = 60;
		
		o.eat();
		o.print();
		o.orengecontent();

		
		// 4. Banana 클래스의 객체 생성 (자식)
		System.out.println("== Banana 객체 출력 ==");
		
		Banana b = new Banana();
		
		b.name = "바나나";
		b.color = "노란색";
		b.large = 15;
		b.bananacontent = 40;
		
		b.eat();
		b.print();
		b.bananacontent();
		

	}

}
