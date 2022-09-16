package chapter10.EX05;

class Animal{
	void Cry(){
		System.out.println("모든 동물은 웁니다.");
	}
}
class Bird extends Animal{
	@Override
	void Cry() {
		System.out.println("짹짹");
	}
}
class Cat extends Animal{
	@Override
	void Cry() {
		System.out.println("야옹");
	}
}
class Dog extends Animal{
	@Override
	void Cry() {
		System.out.println("멍멍");
}
}
public class Using_Method_Overriding02 {
			
		public static void main(String[] args) {
			// 1. 각각의 타입으로 선언 + 각각의 타입으로 생성
			Animal aa = new Animal();
			Bird bb = new Bird();
			Cat cc = new Cat();
			Dog dd = new Dog();
				
			aa.Cry();		//aa.cry() : Animal 의 cry()를 호출
			bb.Cry();		//bb.cry() : Bird 의 cry()를 호출
			cc.Cry();		//cc.cry() : Cat 의 cry()를 호출
			dd.Cry();		//dd.cry() : Dog 의 cry()를 호출
			
			System.out.println("========");
			
			// 2. Animal 타입으로 선언 + 자식 클래스로 객체 생성
					// 자식의 객체를 생성할때 부모 타입으로 정의후 부모의 메소드를 호출시  오버라이딩된 메소드  출력
						// 오버라이딩을 사용해서 하나의 타입으로 정의 , 배열이나 컬렉션에 저장해서 관리를 쉽게 할 수 있다.
			
			Animal aa1 = new Animal();
			Animal bb1 = new Bird();
			Animal cc1 = new Cat();
			Animal dd1 = new Dog();
			
			aa1.Cry();		//aa1.cry() : Animal 의 cry()를 호출
			bb1.Cry();		//bb1.cry() : Animal 의 cry()를 호출 ==> Overriding 된 메소드가  출력 
			cc1.Cry();		//cc1.cry() : Animal 의 cry()를 호출 ==> Overriding 된 메소드가  출력  
			dd1.Cry();		//dd1.cry() : Animal 의 cry()를 호출 ==> Overriding 된 메소드가  출력 
			
			// Animal 타입으로 선언이 되어 있으므로 배열이나 컬랙션에 넣어서 아주 쉽게 관리 
			// 배열의 특징 : 1. 동일한 타입을 저장 		2. 방의 크기가 선언되면 바꿀수 없다.
			
			int[] arr1 = new int[5];			// 배열의 방크기 지정후 값을 할당.
			int[] arr2 = new int[] {1,2,3,4,};	// 배열 선언과 동시에 값을 할당.
			//타입[] 배열변수 = 
			
			//객체를 배열에 저장 : Animal 객체를 배열에 저장
			System.out.println("== 객체를 배열에 저장후 출력 ==");
			Animal[] arr3 = new Animal[] {aa1,bb1,cc1,dd1};
			
			//for 문을 사용해서 출력
			System.out.println("== For 문으로 출력 ==");
			for (int i=0; i<arr3.length; i++) {
				arr3[i].Cry();		// Animal 의 cry() 를 호출시 객체에서 오버라이딩된 메소드가 출력
			}
			
			//향상된 for 문을 사용해서 출력
			System.out.println("== 향상된 For 문으로 출력 ==");
			for (Animal k : arr3) {
				k.Cry();
			}
			
			
			
			
			
			
			
			
			
			
			
		}
		
}	


