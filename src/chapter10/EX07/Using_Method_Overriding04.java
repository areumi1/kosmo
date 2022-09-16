package chapter10.EX07;

class Animal{
	// 자식 클래스에서 2개의 메소드를 오버 라이딩 
	// Animal 타입으로 정의, 배열에 저장후 오버라이딩 된 메소드 출력(for, Enhanced For)
	Animal(){}
	Animal (int a){
	}
	
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}
class Tiger extends Animal{
	

	
	int count;			// 호랑이 수
	
	Tiger(int count) {
		
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("호랑이는 네발로 달립니다.");
	}
	void eat() {
		System.out.println("호랑이는 육식 입니다.");
	}
	
}
class Egle extends Animal{

	int count;			// 독수리 수
	Egle(int count) {
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	void eat() {
		System.out.println("독수리는 잡식 입니다.");
	}
	
}
class Fish extends Animal{
	

	int count;			// 물고기 수
	Fish(int count) {
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("물고기는 헤엄을 칩니다.");
	}
	void eat() {
		System.out.println("물고기는 잡식 입니다.");
	}
	
}
class Dog extends Animal{

	int count;			// 개의 수
	Dog(int count) {
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("개는 네발로 달립니다.");
	}
	void eat() {
		System.out.println("개는 사료를 먹습니다.");
	}
}

public class Using_Method_Overriding04 {

	public static void main(String[] args) {

		//1. 객체 생성
		//1. 객체 생성 (Animal 타입으로 생성)
			// 생성자를 통해서 각각의 필드에 값을 할당.
		Animal a = new Animal();
		Animal t = new Tiger(10);
		Animal e = new Egle(5);
		Animal f = new Fish(50);
		Animal d = new Dog(70);
		
		//객체를 배열에 저장
		Animal[] arr = {a,t,e,f,d}; 
		
		//For문을 사용해서 출력 : eat(), run), 동물의 총 마리수 : 00
			//1. for 문을 사용해서 객체를 Animal 객체로 뽑아서
			//2. 다운캐스팅 해서 자식 필드의 count 읽어서 총 더한 값을 출력
		
		int sum= 0; 
		for (int i = 0; i < arr.length; i++ ) {
			Animal aa = arr[i];
			aa.run();		// Animal의 eat() 메소드 : 오버라이딩된 메소드 출력
			aa.eat();		// Animal의 eat() 메소드 : 오버라이딩된 메소드 출력
			if (arr[i] instanceof Tiger) {
				Tiger tt = (Tiger)aa;
				sum += tt.count;
				System.out.println(tt.count);	
			}else if (arr[i] instanceof Egle) {
				Egle ee = (Egle)aa;
				sum += ee.count;
				System.out.println(ee.count);
			}else if (arr[i] instanceof Fish) {
				Fish ff = (Fish)aa;
				sum += ff.count;
				System.out.println(ff.count);
			}else if (arr[i] instanceof Dog){
				Dog dd = (Dog)aa;
				sum += dd.count;
				System.out.println(dd.count);
			} 
			
		}
		System.out.println("총합 : " + sum);
		
	}

}
