package chapter07.EX05;

class Car{
	
	String companyName;		//현대자동차
	String color;			// 검은색
	double maxSpeed;		//200.0 km/h 
	
	//생성자
	Car(){
		companyName = "현대자동차";
		color = "검은색";
		maxSpeed = 200.0 ;
	}
	
	Car(String companyName){
		this();
		this.companyName = companyName;
	}
	
	Car(String companyName, String color){
		this(companyName);
		this.color = color;
	}
	
	Car(String companyName, String color, double maxSpeed){
		this(companyName, color);
		this.maxSpeed = maxSpeed;
	}
	
	// 필드의 모든 값을 출력 메소드 (print())
	void print() {
		System.out.println("자동차 회사 이름 : "+ companyName);
		System.out.println("자동차 색깔 : "+ color);
		System.out.println("자동차 최대 속도 : "+ maxSpeed);
	}
}

public class ThisMethod04 {

	public static void main(String[] args) {
		// this keyword, this Method 를 사용해서 처리.
		
		// 1. 매개 변수 0개 일때, 기본 필드의 값출력
		System.out.println("==== 기본 생성자 호출 ====");
		Car car1 = new Car ();
		car1.print();
		
		// 2. 매개 변수 1개 일때, companyName만 출력, 나머지는 기본값 출력
		System.out.println("==== 매개변수 1개인 생성자호출 ====");
		Car car2 = new Car ("기아 자동차");
		car2.print();
		
		// 3. 매개 변수 2개 일때
		System.out.println("==== 매개변수 2개인 생성자호출 ====");
		Car car3 = new Car ("쌍용자동차","흰색");
		car3.print();
		
		// 4. 매개 변수 3개 일때
		System.out.println("==== 매개변수 3개인 생성자호출 ====");
		Car car4 = new Car ("람보르기니","노란색",250);
		car4.print();

	}

}
