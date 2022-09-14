package chapter09.EX04;

class Student {
	
	
	static int serialNum = 1000;	//모든 객체에서 공유하는 필드, 객체를 생성할때마다 1씩 증가
	int studentID; // 학생 공유 ID
	String studentName; // 학생 이름
	int grade; // 학년 : 기본값 4
	String address; // 주소 : 기본값 "서울"

	
	
	Student() {
		serialNum ++;		//객체를 생성시 1씩 증가
		studentID = serialNum;
		grade = 4;
		address = "서울";
		
	}

	Student(String studentName) {
		this();
		this.studentName = studentName;
		
	}

	void print() {
		System.out
				.println("학생아이디 : " + studentID + " 학생 이름 : " + studentName + " 학년 : " + grade + "학년 주소 : " + address);
	}

}

public class Student_Tast {

	public static void main(String[] args) {
		// 객체를 생성시 자동으로 1000 부터 자동으로 1씩 증가되도록 학번이 저장되어야 한다.
		// studentID : 1000 부터 학생객체를 생성할때 마다 고유한 값으로 적용되어 있어야 한다.

		Student lee = new Student("이지원"); // 1001

		lee.print();

		Student hong = new Student("홍지원"); //1002
		 
		hong.print();
		
		Student jung = new Student("정지원"); //1003
		  
		jung.print();
		
		Student park= new Student("박지원"); //1004
		
		park.print();

	}

}
