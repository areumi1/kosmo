package chapter10.EX06;

class Animal{
	// 자식 클래스에서 2개의 메소드를 오버 라이딩 
	// Animal 타입으로 정의, 배열에 저장후 오버라이딩 된 메소드 출력(for, Enhanced For)
	
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}
class Tiger extends Animal{
	@Override
	void run() {
		System.out.println("호랑이는 네발로 달립니다.");
	}
	void eat() {
		System.out.println("호랑이는 육식 입니다.");
	}
	
}
class Egle extends Animal{
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	void eat() {
		System.out.println("독수리는 잡식 입니다.");
	}
	
}
class Fish extends Animal{
	@Override
	void run() {
		System.out.println("물고기는 헤엄을 칩니다.");
	}
	void eat() {
		System.out.println("물고기는 잡식 입니다.");
	}
	
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println("개는 네발로 달립니다.");
	}
	void eat() {
		System.out.println("개는 사료를 먹습니다.");
	}
}

public class Using_Method_Overriding03 {

	public static void main(String[] args) {
		//1. 객체 생성 (Animal 타입으로 생성)
		
		Animal a = new Animal();
		Animal t = new Tiger();
		Animal e = new Egle();
		Animal f = new Fish();
		Animal d = new Dog();
		
		Animal[] arr = {a,t,e,f,d}; 
		
		System.out.println("===== For 문 =====");
		for (int i = 0; i< arr.length; i++) {
			arr[i].run();
			arr[i].eat();
		}
		
		System.out.println("=== Enhanced For ===");
		for(Animal k : arr) {
			k.run();		//Animal의 메소드 : 오버라이딩된 메소드가 출력
			k.eat();
		}
		
		
		

	}

}
