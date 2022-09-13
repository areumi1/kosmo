package chapter07.EX04;

class Fruit{
	
	//1. 필드
	String name;		//과일 이름
	String color ;		//과일 색깔
	int count ;			//과일 갯수
	int sugatContent ;	//과일의 당도

	
	//2. 생성자
	Fruit (){};
	
	Fruit (String name, String color, int count, int sugatContent){
		this.name = name;
		this.color = color;
		this.count = count;
		this.sugatContent = sugatContent;
	}
	
	//3. show() : 필드의 값을 모두 출력 하는 메소드
	void show() {
		System.out.println(name+", "+color+", "+count+", "+sugatContent);
	}

	//4. getter/setter 메소드 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSugatContent() {
		return sugatContent;
	}

	public void setSugatContent(int sugatContent) {
		this.sugatContent = sugatContent;
	}

}


public class Fruit_Test {

	public static void main(String[] args) {
		// 1. banana 객체 생성 후 필드에 기본값을 직접 입력후 / 직접출력
		Fruit banana = new Fruit();
			// 필드의 값 셋팅(직접)
		banana.name = "바나나";
		banana.color = "노란색";
		banana.count = 10;
		banana.sugatContent = 8;
		
			// 필드의 값 출력
		System.out.println("====banana 객체 출력====");
		System.out.println(banana.name);
		System.out.println(banana.color);
		System.out.println(banana.count);
		System.out.println(banana.sugatContent);

		
		
		// 2. apple 객체 : 생성자를 사용해서 4개의 필드에 초기값 할당. show() 출력
		Fruit apple = new Fruit("사과","빨강",2,50);
		
		System.out.println("====show() 메소드 사용해서 출력====");
		apple.show();
		
		// 3. strawberry : setter를 사용해서 4개의 필드에 값 할당. getter 사용해서 출력
		
		Fruit Strawverry = new Fruit();
		
		//setter 를 사용해서 필드의 값 입력
		Strawverry.setName("딸기");
		Strawverry.setColor("빨강");
		Strawverry.setCount(10);
		Strawverry.setSugatContent(70);
		
		//getter를 사용해서 필드의 값  출력
		System.out.println("===getter를 사용해서 출력===");
		System.out.println(Strawverry.getName());
		System.out.println(Strawverry.getColor());
		System.out.println(Strawverry.getCount());
		System.out.println(Strawverry.getSugatContent());

	}

}
